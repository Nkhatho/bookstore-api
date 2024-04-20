package log.devdotlog.bookstoreapi.repositories;

import log.devdotlog.bookstoreapi.domain.order.Shipping;
import org.springframework.data.repository.CrudRepository;

public interface ShippingRepository extends CrudRepository<Shipping, Long> {
}
