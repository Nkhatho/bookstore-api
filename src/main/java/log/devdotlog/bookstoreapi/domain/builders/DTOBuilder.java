package log.devdotlog.bookstoreapi.domain.builders;

import log.devdotlog.bookstoreapi.domain.store.Book;
import log.devdotlog.bookstoreapi.web.model.BookDTO;

public class DTOBuilder {
    public static BookDTO buildBookDTO(Book book){
        return BookDTO.builder()
                .id(book.getId())
                .name(book.getName())
                .isbn(book.getIsbn())
                .pages(book.getPages())
                .authors(book.getAuthors())
                .bookPublishers(book.getBookPublishers())
                .publishDate(book.getPublishDate())
                .category(book.getCategory())
                .build();
    }
}
