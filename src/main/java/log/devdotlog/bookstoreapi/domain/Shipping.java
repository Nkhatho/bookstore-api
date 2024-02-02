package log.devdotlog.bookstoreapi.domain;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Set;

@Entity
public class Shipping {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private BigDecimal price;
    @OneToMany
    private Set<Order> orders;
}
// TODO: Figure out the order_history along with the order_status

