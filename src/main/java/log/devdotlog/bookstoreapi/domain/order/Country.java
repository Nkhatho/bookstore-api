package log.devdotlog.bookstoreapi.domain.order;

import jakarta.persistence.*;
import log.devdotlog.bookstoreapi.domain.common.NamedEntity;
import lombok.*;

import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
@Entity
@Table(name = "country")
public class Country extends NamedEntity {
    @OneToMany(mappedBy = "country")
    private Set<Address> addresses;
//    @OneToMany(mappedBy = "country")
//    private Set<StateRegion> stateRegions;
}

// TODO: Figure out the order_history along with the order_status
