package log.devdotlog.bookstoreapi.domain.common;

import jakarta.persistence.MappedSuperclass;
import lombok.*;

@NoArgsConstructor
@Data
@MappedSuperclass
public class NamedEntity extends BaseEntity{
    private String name;

    @Builder(builderMethodName = "NamedEntityBuilder")
    public NamedEntity(Long id, String name) {
        super(id);
        this.name = name;
    }
}
