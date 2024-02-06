package log.devdotlog.bookstoreapi.domain;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Set;

@Entity
public class Purchase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToMany(mappedBy = "purchase")
    private Set<Book> books;
//    @ManyToOne
//    private Customer customer;
//    @ManyToOne
//    private Shipping shipping;
    private BigDecimal price;
    private Timestamp orderDate;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Timestamp getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Timestamp orderDate) {
        this.orderDate = orderDate;
    }
}

// TODO: Figure out the order_history along with the order_status
// TODO: Figure out with Thompson on how to get the correct mappings on entity relationships and also to get join tables with foreign keys
