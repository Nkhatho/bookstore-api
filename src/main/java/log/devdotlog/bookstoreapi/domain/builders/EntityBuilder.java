package log.devdotlog.bookstoreapi.domain.builders;

import log.devdotlog.bookstoreapi.domain.store.Book;
import log.devdotlog.bookstoreapi.web.model.BookDTO;

public class EntityBuilder {
    public static Book buildBookEntity(BookDTO bookDTO){
        return Book.bookBuilder()
                .id(bookDTO.getId())
                .name(bookDTO.getName())
                .isbn(bookDTO.getIsbn())
                .pages(bookDTO.getPages())
                .authors(bookDTO.getAuthors())
                .bookPublishers(bookDTO.getBookPublishers())
                .publishDate(bookDTO.getPublishDate())
                .category(bookDTO.getCategory())
                .build();
    }
}
