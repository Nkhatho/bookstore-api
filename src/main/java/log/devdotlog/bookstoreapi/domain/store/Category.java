package log.devdotlog.bookstoreapi.domain.store;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import log.devdotlog.bookstoreapi.domain.common.NamedEntity;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@Entity
@Data
@EqualsAndHashCode(exclude = "books")
@Table(name = "category")
public class Category extends NamedEntity {

    @Column(name = "description")
    private String description;

    @OneToMany( mappedBy = "category", cascade = CascadeType.ALL)
    @JsonIgnoreProperties("category")
    private Set<Book> books = new HashSet<>();

    @Builder(builderMethodName = "categoryBuilder")
    public Category(Long id, String name, String description, Set<Book> books) {
        super(id, name);
        this.description = description;
        this.books = books;
    }
}
