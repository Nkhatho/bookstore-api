package log.devdotlog.bookstoreapi.domain.order;

import jakarta.persistence.*;
import log.devdotlog.bookstoreapi.domain.common.BaseEntity;
import log.devdotlog.bookstoreapi.domain.store.Book;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name = "purchase")
public class Purchase extends BaseEntity {

    @OneToMany(mappedBy = "purchase")
    private Set<Book> books;

    @ManyToOne
    @JoinTable(
            name = "customer_purchase",
            joinColumns = @JoinColumn(name = "customer_id"),
            inverseJoinColumns = @JoinColumn(name = "purchase_id")
    ) // fine
    private Customer customer;

    @ManyToOne
    @JoinTable(
            name = "shipping_purchase",
            joinColumns = @JoinColumn(name = "shipping_id"),
            inverseJoinColumns = @JoinColumn(name = "purchase_id")
    ) // fine
    private Shipping shipping;

    @Column(name = "price")
    private BigDecimal price;

    @CreationTimestamp
    @Column(name = "order_date")
    private Timestamp orderDate;

}

// TODO: Figure out the order_history along with the order_status
// TODO: Figure out with Thompson on how to get the correct mappings on entity relationships and also to get join tables with foreign keys