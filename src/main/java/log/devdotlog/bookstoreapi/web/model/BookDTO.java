package log.devdotlog.bookstoreapi.web.model;

import log.devdotlog.bookstoreapi.domain.order.Purchase;
import log.devdotlog.bookstoreapi.domain.store.Author;
import log.devdotlog.bookstoreapi.domain.store.Category;
import log.devdotlog.bookstoreapi.domain.store.Publisher;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BookDTO {
    // Note: A book has a title which is essentially a name, therefore it extends named entity.
    // book title will be book name
    private Long id;
    private String name;
    private String isbn;
    private Long pages;
    private Author author;
    private Publisher publisher;
    private Timestamp publishDate;
    private Purchase purchase;
    private Set<Category> categories;
}
// TODO: Figure out the order_history along with the order_status
