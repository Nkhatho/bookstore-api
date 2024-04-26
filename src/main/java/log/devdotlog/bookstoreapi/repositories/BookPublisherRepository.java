package log.devdotlog.bookstoreapi.repositories;

import log.devdotlog.bookstoreapi.domain.store.BookPublisher;
import org.springframework.data.repository.CrudRepository;

public interface BookPublisherRepository extends CrudRepository<BookPublisher, Long> {
}
