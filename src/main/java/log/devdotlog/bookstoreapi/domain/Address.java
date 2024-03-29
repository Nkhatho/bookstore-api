package log.devdotlog.bookstoreapi.domain;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name = "address")
public class Address extends BaseEntity {
    @Column(name = "street_number")
    private Long streetNumber;
    @Column(name = "street_name")
    private String streetName;
    @Column(name = "city")
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
