package log.devdotlog.bookstoreapi.domain.store;

import jakarta.persistence.*;
import log.devdotlog.bookstoreapi.domain.common.NamedEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;
@Data // Gets and Sets and Eq and Hash
@NoArgsConstructor
@Entity
@Table(name = "publisher")
public class Publisher extends NamedEntity {
    @OneToMany(mappedBy = "publisher")
    private Set<Book> books;

    @Builder(builderMethodName = "publisherBuilder")
    public Publisher(Long id, String name, Set<Book> books) {
        super(id, name);
        this.books = books;
    }
}

// TODO: Figure out the order_history along with the order_status
