package log.devdotlog.bookstoreapi.domain;

import com.fasterxml.jackson.databind.ser.Serializers;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name = "book")
public class Book extends BaseEntity {

    @Column(
            name = "title",
            nullable = false
    )
    private String title;

    @Column(
            name = "isbn",
            nullable = false,
            unique = true,
            length = 13
    )
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

    @CreationTimestamp
    @Column(
            name = "publish_date",
            updatable = false
    )
    private Timestamp publishDate;

    @ManyToOne
    @JoinTable(
            name = "book_purchase",
            joinColumns = @JoinColumn(name = "book_id"),
            inverseJoinColumns = @JoinColumn(name = "purchase_id")
    ) // fine
    private Purchase purchase;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "book_category",
            joinColumns = @JoinColumn(name = "book_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id")
    )
    private Set<Category> categories;
}
// TODO: Figure out the order_history along with the order_status
