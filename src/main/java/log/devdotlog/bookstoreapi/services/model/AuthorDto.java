package log.devdotlog.bookstoreapi.services.model;

import jakarta.persistence.Column;
import jakarta.persistence.OneToMany;
import log.devdotlog.bookstoreapi.domain.Book;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AuthorDto {
    private String name;
    private String surname;
    private Set<Book> books;
}
