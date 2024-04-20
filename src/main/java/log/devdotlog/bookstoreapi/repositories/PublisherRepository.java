package log.devdotlog.bookstoreapi.repositories;

import log.devdotlog.bookstoreapi.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
    Optional<Publisher> findById(Long id);

}
