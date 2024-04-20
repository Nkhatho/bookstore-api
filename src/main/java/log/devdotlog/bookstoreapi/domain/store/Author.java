package log.devdotlog.bookstoreapi.domain.store;

import jakarta.persistence.*;
import log.devdotlog.bookstoreapi.domain.Person;
import lombok.*;

import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name = "author")
public class Author extends Person {
    @OneToMany(mappedBy = "author") // fine
    private Set<Book> books;
}
// TODO: Figure out the order_history along with the order_status

