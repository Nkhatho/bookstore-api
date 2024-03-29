package log.devdotlog.bookstoreapi.domain;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name = "publisher")
public class Publisher extends BaseEntity {
    @Column(name = "name")
    private String name;
    @OneToMany(mappedBy = "publisher")
    private Set<Book> books;
}

// TODO: Figure out the order_history along with the order_status
