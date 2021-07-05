package ste.projects.springsqlserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ste.projects.springsqlserver.models.Customer;

public interface ICustomerRepository extends JpaRepository<Customer, Long> {
}
