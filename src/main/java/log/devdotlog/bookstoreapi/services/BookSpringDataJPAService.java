package log.devdotlog.bookstoreapi.services;

import log.devdotlog.bookstoreapi.domain.store.Book;
import log.devdotlog.bookstoreapi.repositories.BookRepository;
import log.devdotlog.bookstoreapi.web.model.BookDTO;
import org.springframework.stereotype.Service;

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
        return Set.of();
    }

    @Override
    public BookDTO retrieveBookById(Long id) {
        BookDTO bookDTO = new BookDTO();
        Optional<Book> optionalBook = bookRepository.findById(id);
        if(optionalBook.isPresent()) {
           bookDTO = DTOBuilder.buildBookDTO(optionalBook.get());
        }
        return bookDTO;
    }

    @Override
    public BookDTO persistBook(BookDTO bookDTO) {
        return null;
    }

    @Override
    public void deleteBookById(Long id) {

    }
}
