package log.devdotlog.bookstoreapi.domain.order;

import jakarta.persistence.*;
import log.devdotlog.bookstoreapi.domain.common.NamedEntity;
import lombok.*;

import java.math.BigDecimal;
import java.util.Set;

@NoArgsConstructor
@Data
@Entity
@Table(name = "shipping")
public class Shipping extends NamedEntity {

    @Column(
            name = "price",
            precision = 2,
            nullable = false
    )
    private BigDecimal price;

    @OneToMany(mappedBy = "shipping")
    private Set<Purchase> purchases;

    @Builder(builderMethodName = "shippingBuilder")
    public Shipping(Long id, String name, BigDecimal price, Set<Purchase> purchases) {
        super(id, name);
        this.price = price;
        this.purchases = purchases;
    }
}
// TODO: Figure out the order_history along with the order_status

