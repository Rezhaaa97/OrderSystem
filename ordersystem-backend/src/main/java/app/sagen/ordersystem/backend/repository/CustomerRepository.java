package app.sagen.ordersystem.backend.repository;

import app.sagen.ordersystem.backend.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    Optional<Customer> findByEmailIgnoreCase(String email);
    List<Customer> findByNameIgnoreCaseContainingOrderByName(String name);
    List<Customer> findByNameIgnoreCaseContainingOrEmailIgnoreCaseContainingOrPhoneContainingOrderByName(String filter1, String filter2, String filter3);

}
