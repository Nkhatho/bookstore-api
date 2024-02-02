package log.devdotlog.bookstoreapi.domain;

import jakarta.persistence.*;

@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long streetNumber;
    private String streetName;
    private String city;
    @ManyToOne
    private Country country;
    @ManyToOne
    private Customer customer;


}
// TODO: Figure out the order_history along with the order_status
