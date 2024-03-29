package log.devdotlog.bookstoreapi.repositories;

import log.devdotlog.bookstoreapi.domain.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository<Address, Long> {
}
