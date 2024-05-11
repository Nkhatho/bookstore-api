package log.devdotlog.bookstoreapi.services;

import log.devdotlog.bookstoreapi.web.exceptions.AuthorNotFoundException;
import log.devdotlog.bookstoreapi.web.exceptions.BookNotFoundException;
import log.devdotlog.bookstoreapi.web.model.AuthorDTO;
import log.devdotlog.bookstoreapi.web.model.BookDTO;

import java.util.Set;

public interface AuthorService extends CrudService <AuthorDTO, Long> {
//    Set<AuthorDTO> getBooksByAuthor(String author);
    Set<AuthorDTO> retrieveAllAuthors();
    AuthorDTO retrieveAuthorById(Long id) throws AuthorNotFoundException;
    AuthorDTO persistAuthor(AuthorDTO authorDTO);
    void deleteAuthorById(Long id);
}
