package log.devdotlog.bookstoreapi.repositories;

import log.devdotlog.bookstoreapi.domain.store.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
