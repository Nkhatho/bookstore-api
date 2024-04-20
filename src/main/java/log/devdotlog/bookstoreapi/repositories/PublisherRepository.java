package log.devdotlog.bookstoreapi.repositories;

import log.devdotlog.bookstoreapi.domain.store.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
