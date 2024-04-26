package log.devdotlog.bookstoreapi.web.model;

import log.devdotlog.bookstoreapi.domain.store.Book;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data // Gets and Sets and Eq and Hash
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PublisherDTO {
    private Long id;
    private String name;
    private Set<Book> books;
}
