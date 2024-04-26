package log.devdotlog.bookstoreapi.repositories;

import log.devdotlog.bookstoreapi.domain.store.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BookRepository extends CrudRepository<Book, Long> {
}
