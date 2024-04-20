package log.devdotlog.bookstoreapi.domain;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
@Entity
@Table(name = "country")
public class Country extends BaseEntity {
    @Column(name = "name")
    private String name;
    @OneToMany(mappedBy = "country")
    private Set<Address> addresses;
}

// TODO: Figure out the order_history along with the order_status
