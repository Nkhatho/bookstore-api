package log.devdotlog.bookstoreapi.domain;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Set;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String isbn;
    private Long pages;
    @OneToMany
    private Set<Author> authors;
    @ManyToOne
    private Publisher publisher;
    private Timestamp publishDate;
    @OneToMany
    private Set<Order> orders;


}
// TODO: Figure out the order_history along with the order_status
