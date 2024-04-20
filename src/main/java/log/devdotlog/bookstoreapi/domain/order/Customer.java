package log.devdotlog.bookstoreapi.domain.order;

import jakarta.persistence.*;
import log.devdotlog.bookstoreapi.domain.Person;
import lombok.*;

import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
@Entity
@Table(name = "customer")
public class Customer extends Person {

    // customer has an account ( to be implemeted )

    @Column(name = "email")
    private String email;

    @Column(name = "cellphone_number")
    private String cellphoneNumber;

    @OneToMany(mappedBy = "customer")
    private Set<Purchase> purchases;

    @OneToMany(mappedBy = "customer")
    private Set<Address> addresses;
}

// TODO: Figure out the order_history along with the order_status
