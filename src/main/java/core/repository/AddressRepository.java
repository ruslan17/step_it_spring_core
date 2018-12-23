package core.repository;

import core.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository
        extends JpaRepository<Address, Integer> {
}
