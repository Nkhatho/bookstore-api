package log.devdotlog.bookstoreapi.domain;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @OneToMany
    private Set<Address> addresses;
}

// TODO: Figure out the order_history along with the order_status
