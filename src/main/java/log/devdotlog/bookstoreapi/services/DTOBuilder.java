package log.devdotlog.bookstoreapi.services;

import log.devdotlog.bookstoreapi.domain.store.Book;
import log.devdotlog.bookstoreapi.web.model.BookDTO;

public class DTOBuilder {
    public static BookDTO buildBookDTO(Book book){
        return BookDTO.builder()
                .id(book.getId())
                .name(book.getName())
                .isbn(book.getIsbn())
                .pages(book.getPages())
                .author(book.getAuthor())
                .publisher(book.getPublisher())
                .publishDate(book.getPublishDate())
                .purchase(book.getPurchase())
                .categories(book.getCategories())
                .build();
    }
}
