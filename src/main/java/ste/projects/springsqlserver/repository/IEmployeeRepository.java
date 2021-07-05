package ste.projects.springsqlserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ste.projects.springsqlserver.models.Customer;
import ste.projects.springsqlserver.models.Employee;

public interface IEmployeeRepository extends JpaRepository<Employee, Long> {
}
