package log.devdotlog.bookstoreapi.services;

import log.devdotlog.bookstoreapi.web.model.BookDTO;

import java.util.Set;

public interface BookService extends CrudService <BookDTO, Long> {
//    Set<BookDTO> getBooksByAuthor(String author);
    Set<BookDTO> retrieveAllBooks();
    BookDTO retrieveBookById(Long id);
    BookDTO persistBook(BookDTO bookDTO);
    void deleteBookById(Long id);
}
