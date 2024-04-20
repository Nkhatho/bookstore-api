package log.devdotlog.bookstoreapi.domain.order;

import jakarta.persistence.*;
import log.devdotlog.bookstoreapi.domain.BaseEntity;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name = "address")
public class Address extends BaseEntity {
    @Column(
            name = "street_number",
            nullable = false
    )
    private Long streetNumber;

    @Column(
            name = "street_name",
            nullable = false
    )
    private String streetName;

    @Column(
            name = "city",
            nullable = false
    )
    private String city;

    @ManyToOne
    private Country country;

    @ManyToOne
    @JoinTable(
            name = "customer_address",
            joinColumns = @JoinColumn(name = "customer_id"),
            inverseJoinColumns = @JoinColumn(name = "address_id")
    ) // fine
    private Customer customer;
}
// TODO: Figure out the order_history along with the order_status
