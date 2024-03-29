package log.devdotlog.bookstoreapi.domain;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
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
    @Column(name = "order_date")
    private Timestamp orderDate;
}

// TODO: Figure out the order_history along with the order_status
// TODO: Figure out with Thompson on how to get the correct mappings on entity relationships and also to get join tables with foreign keys
