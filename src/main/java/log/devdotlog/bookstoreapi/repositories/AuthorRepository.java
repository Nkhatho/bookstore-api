package log.devdotlog.bookstoreapi.repositories;

import log.devdotlog.bookstoreapi.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
