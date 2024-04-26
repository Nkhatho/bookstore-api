package log.devdotlog.bookstoreapi.web.model;

import log.devdotlog.bookstoreapi.domain.store.Author;
import log.devdotlog.bookstoreapi.domain.store.BookPublisher;
import log.devdotlog.bookstoreapi.domain.store.Category;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.HashSet;
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
    private Set<Author> authors;
    private Set<BookPublisher> bookPublishers = new HashSet<>();
    private Timestamp publishDate;
    private Category category;
    private String description;
}
// TODO: Figure out the order_history along with the order_status
