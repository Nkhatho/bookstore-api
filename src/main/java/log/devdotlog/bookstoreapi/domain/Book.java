package log.devdotlog.bookstoreapi.domain;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name = "book")
public class Book extends BaseEntity{
    @Column(name = "title")
    private String title;
    @Column(name = "isbn")
    private String isbn;
    @Column(name = "pages")
    private Long pages;
    @ManyToOne
    @JoinTable(
            name = "book_author",
            joinColumns = @JoinColumn(name = "book_id"),
            inverseJoinColumns = @JoinColumn(name = "author_id")
    ) // fine
    private Author author;
    @ManyToOne // fine
    private Publisher publisher;
    @Column(name = "publish_date")
    private Timestamp publishDate;
    @ManyToOne
    @JoinTable(
            name = "book_purchase",
            joinColumns = @JoinColumn(name = "book_id"),
            inverseJoinColumns = @JoinColumn(name = "purchase_id")
    ) // fine
    private Purchase purchase;
}
// TODO: Figure out the order_history along with the order_status
