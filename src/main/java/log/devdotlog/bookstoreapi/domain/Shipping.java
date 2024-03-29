package log.devdotlog.bookstoreapi.domain;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name = "shipping")
public class Shipping extends BaseEntity {
    @Column(name= "name")
    private String name;
    @Column(name = "price")
    private BigDecimal price;
    @OneToMany(mappedBy = "shipping")
    private Set<Purchase> purchases;
}
// TODO: Figure out the order_history along with the order_status

