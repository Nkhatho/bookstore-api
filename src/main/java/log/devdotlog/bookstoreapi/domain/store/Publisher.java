package log.devdotlog.bookstoreapi.domain.store;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import log.devdotlog.bookstoreapi.domain.common.NamedEntity;
import lombok.*;

import java.util.HashSet;
import java.util.Set;
@Data // Gets and Sets and Eq and Hash
@NoArgsConstructor
@Entity
@EqualsAndHashCode(exclude = "bookPublishers")
@Table(name = "publisher")
public class Publisher extends NamedEntity {
    @OneToMany(mappedBy = "publisher", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnoreProperties("publisher")
    private Set<BookPublisher> bookPublishers = new HashSet<>();

    @Builder(builderMethodName = "publisherBuilder")
    public Publisher(Long id, String name, Set<BookPublisher> bookPublishers) {
        super(id, name);
        this.bookPublishers = bookPublishers;
    }
}

// TODO: Figure out the order_history along with the order_status
