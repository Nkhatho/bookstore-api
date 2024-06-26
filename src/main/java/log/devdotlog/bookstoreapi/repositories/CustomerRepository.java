package log.devdotlog.bookstoreapi.repositories;

import log.devdotlog.bookstoreapi.domain.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
}
