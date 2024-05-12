package log.devdotlog.bookstoreapi.domain.builders;

import log.devdotlog.bookstoreapi.domain.store.Author;
import log.devdotlog.bookstoreapi.domain.store.Book;
import log.devdotlog.bookstoreapi.web.model.AuthorDTO;
import log.devdotlog.bookstoreapi.web.model.BookDTO;

import java.util.Optional;

public class DTOBuilder {
    public static BookDTO buildBookDTO(Book book){
        return BookDTO.builder()
                .id(book.getId())
                .name(book.getName())
                .description(book.getDescription())
                .isbn(book.getIsbn())
                .pages(book.getPages())
//                .authors(book.getAuthors())
//                .bookPublishers(book.getBookPublishers())
//                .publishDate(book.getPublishDate())
//                .category(book.getCategory())
                .build();
    }

    public static AuthorDTO buildAuthorDTO(Author author) {
        return AuthorDTO.builder()
                .id(author.getId())
                .name(author.getName())
                .surname(author.getSurname())
//                .books(author.getBooks())
                .build();
    }
}
