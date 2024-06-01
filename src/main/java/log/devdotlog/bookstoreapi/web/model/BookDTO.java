package log.devdotlog.bookstoreapi.web.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import log.devdotlog.bookstoreapi.domain.store.Author;
import log.devdotlog.bookstoreapi.domain.store.BookPublisher;
import log.devdotlog.bookstoreapi.domain.store.Category;
import jakarta.validation.constraints.Null;
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
    // book title will be book namezz

    @Null
    private Long id;
    @NotBlank
    private String name;
    @NotBlank
    private String description;
    @NotBlank
    private String isbn;
    @Positive
    private Long pages;
//    private Set<Author> authors;
//    private Set<BookPublisher> bookPublishers = new HashSet<>();
//    private Date publishDate;
//    private Category category;
}
// TODO: Figure out the order_history along with the order_status
