package log.devdotlog.bookstoreapi.repositories;

import log.devdotlog.bookstoreapi.domain.store.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
