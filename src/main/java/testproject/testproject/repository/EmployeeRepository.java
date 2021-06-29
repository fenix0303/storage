package testproject.testproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import testproject.testproject.entity.Employee;

import java.util.UUID;

public interface EmployeeRepository extends JpaRepository<Employee, UUID> {
}
