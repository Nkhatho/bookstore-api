package log.devdotlog.bookstoreapi.domain;

import jakarta.persistence.MappedSuperclass;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@MappedSuperclass
public class Person extends BaseEntity {
    private String name;
    private String surname;
}
