package log.devdotlog.bookstoreapi.domain.order;

import jakarta.persistence.*;
import log.devdotlog.bookstoreapi.domain.common.NamedEntity;
import lombok.*;

import java.util.Set;

@NoArgsConstructor
@Data
@Entity
@Table(name = "country")
public class Country extends NamedEntity {
    @OneToMany(mappedBy = "country")
    private Set<Address> addresses;
//    @OneToMany(mappedBy = "country")
//    private Set<StateRegion> stateRegions;
    @Builder(builderMethodName = "countryBuilder")
    public Country(Long id, String name, Set<Address> addresses) {
        super(id, name);
        this.addresses = addresses;
    }
}

// TODO: Figure out the order_history along with the order_status
