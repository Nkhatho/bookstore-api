package log.devdotlog.bookstoreapi.domain.store;

import jakarta.persistence.*;
import log.devdotlog.bookstoreapi.domain.common.NamedEntity;
import log.devdotlog.bookstoreapi.domain.order.Purchase;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;
import java.util.Set;

@NoArgsConstructor
@Data
@Entity
@Table(name = "book")
public class Book extends NamedEntity {

    // Note: A book has a title which is essentially a name, therefore it extends named entity.
    // book title will be book name
    @Builder(builderMethodName = "bookBuilder")
    public Book(Long id, String name, String isbn, Long pages, Author author, Publisher publisher, Timestamp publishDate,
                Purchase purchase, Set<Category> categories) {
        super(id, name);
        this.isbn = isbn;
        this.pages = pages;
        this.author = author;
        this.publisher = publisher;
        this.publishDate = publishDate;
        this.purchase = purchase;
        this.categories = categories;
    }

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
