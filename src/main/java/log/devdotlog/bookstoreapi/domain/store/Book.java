package log.devdotlog.bookstoreapi.domain.store;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import log.devdotlog.bookstoreapi.domain.common.NamedEntity;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

@EqualsAndHashCode(exclude = {"category", "authors", "publishers"})
@NoArgsConstructor
@Data
@Entity
@Table(name = "book")
public class Book extends NamedEntity {

    // Note: A book has a title which is essentially a name, therefore it extends named entity.
    // book title will be book name
    private String description;
    @Column(
            name = "isbn",
            nullable = false,
            unique = true,
            length = 13
    )
    private String isbn;

    @Column(name = "pages")
    private Long pages;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "book_author",
            joinColumns = @JoinColumn(name = "book_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "author_id", referencedColumnName = "id")
    ) // fine
    @JsonIgnoreProperties("books")
    private Set<Author> authors;

    @OneToMany(mappedBy = "book", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnoreProperties("book")
    private Set<BookPublisher> bookPublishers = new HashSet<>();

    @DateTimeFormat(fallbackPatterns = {"yyyy/MM/dd"})
    @Column(
            name = "publish_date",
            updatable = false
    )
    private Date publishDate;

//    @ManyToOne
//    @JoinTable(
//            name = "book_purchase",
//            joinColumns = @JoinColumn(name = "book_id"),
//            inverseJoinColumns = @JoinColumn(name = "purchase_id")
//    ) // fine
//    private Purchase purchase;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "category_id")
    private Category category;

    @Builder(builderMethodName = "bookBuilder")
    public Book(Long id, String name, String description, String isbn, Long pages, Set<Author> authors, Set<BookPublisher> bookPublishers, Date publishDate,
                 Category category) {
        super(id, name);
        this.description = description;
        this.isbn = isbn;
        this.pages = pages;
        this.authors = authors;
        this.bookPublishers = bookPublishers;
        this.publishDate = publishDate;
//        this.purchase = purchase;
        this.category = category;

    }
}
// TODO: Figure out the order_history along with the order_status
