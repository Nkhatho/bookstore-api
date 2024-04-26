package log.devdotlog.bookstoreapi.web.model;

import log.devdotlog.bookstoreapi.domain.store.Book;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CategoryDTO {

    private String description;
    private Set<Book> books = new HashSet<>();
}
