package log.devdotlog.bookstoreapi.services;

import log.devdotlog.bookstoreapi.domain.builders.DTOBuilder;
import log.devdotlog.bookstoreapi.domain.builders.EntityBuilder;
import log.devdotlog.bookstoreapi.domain.store.Book;
import log.devdotlog.bookstoreapi.repositories.BookRepository;
import log.devdotlog.bookstoreapi.web.exceptions.BookNotFoundException;
import log.devdotlog.bookstoreapi.web.model.BookDTO;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
public class BookSpringDataJPAService implements BookService {
    private final BookRepository bookRepository;
    public BookSpringDataJPAService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Set<BookDTO> retrieveAllBooks() {
        return new HashSet<>((Collection) bookRepository.findAll());
    }

    @Override
    public BookDTO retrieveBookById(Long id) throws BookNotFoundException {
        Optional<Book> optionalBook = bookRepository.findById(id);
        if(optionalBook.isPresent()) {
           return DTOBuilder.buildBookDTO(optionalBook.get());
        }
        throw new BookNotFoundException();
    }

    @Override
    public BookDTO persistBook(BookDTO bookDTO) {
        // perform some validations on dto before saving it
        // ensure all the properties required are presented

        Book book = bookRepository.save(EntityBuilder.buildBookEntity(bookDTO));
        return DTOBuilder.buildBookDTO(book);
    }

    @Override
    public void deleteBookById(Long id) {

    }
}
