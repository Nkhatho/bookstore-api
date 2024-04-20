package log.devdotlog.bookstoreapi.domain.common;

import jakarta.persistence.MappedSuperclass;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@MappedSuperclass
public class Person extends NamedEntity {
    private String surname;

    @Builder(builderMethodName = "personBuilder")
    public Person(Long id, String name, String surname) {
        super(id, name);
        this.surname = surname;
    }
//    public static class
}
