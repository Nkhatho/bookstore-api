package log.devdotlog.bookstoreapi.domain;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name = "customer")
public class Customer extends BaseEntity {

    @Column(name = "name")
    private String name;
    @Column(name = "surname")
    private String surname;
    @Column(name = "email")
    private String email;
    @OneToMany(mappedBy = "customer")
    private Set<Purchase> purchases;
    @OneToMany(mappedBy = "customer")
    private Set<Address> addresses;
}

// TODO: Figure out the order_history along with the order_status
