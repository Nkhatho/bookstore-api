package log.devdotlog.bookstoreapi.web.model;

import log.devdotlog.bookstoreapi.domain.store.Author;
import log.devdotlog.bookstoreapi.domain.store.Book;
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
public class AuthorDTO {

    private Long id;
    private String name;
    private String surname;
    private Set<Book> books = new HashSet<>();
}
// TODO: Figure out the order_history along with the order_status
