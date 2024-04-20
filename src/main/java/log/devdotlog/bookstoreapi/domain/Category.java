package log.devdotlog.bookstoreapi.domain;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name = "category")
public class Category extends NamedEntity {

    @Column(name = "description")
    private String description;

    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "book")
    private Set<Book> books = new HashSet<>();
}
