package log.devdotlog.bookstoreapi.repositories;

import log.devdotlog.bookstoreapi.domain.Purchase;
import org.springframework.data.repository.CrudRepository;

public interface PurchaseRepository extends CrudRepository<Purchase, Long> {
}
