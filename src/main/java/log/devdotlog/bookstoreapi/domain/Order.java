package log.devdotlog.bookstoreapi.domain;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Set;

@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Book book;
    @ManyToOne
    private Shipping shipping;
    private BigDecimal price;
    private Timestamp orderDate;
}

// TODO: Figure out the order_history along with the order_status
