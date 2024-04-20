package log.devdotlog.bookstoreapi.services;

import log.devdotlog.bookstoreapi.domain.store.Book;
import log.devdotlog.bookstoreapi.web.model.BookDTO;

public class EntityBuilder {
    public static Book buildBookEntity(BookDTO bookDTO){
        return Book.bookBuilder()
                .id(bookDTO.getId())
                .name(bookDTO.getName())
                .isbn(bookDTO.getIsbn())
                .pages(bookDTO.getPages())
                .author(bookDTO.getAuthor())
                .publisher(bookDTO.getPublisher())
                .publishDate(bookDTO.getPublishDate())
                .purchase(bookDTO.getPurchase())
                .categories(bookDTO.getCategories())
                .build();
    }
}
