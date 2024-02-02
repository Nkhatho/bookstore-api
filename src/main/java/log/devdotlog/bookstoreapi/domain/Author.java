package log.devdotlog.bookstoreapi.domain;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String surname;
    @OneToMany
    private Set<Book> books;
}
// TODO: Figure out the order_history along with the order_status

