package codeclan.com.example.Staffservice.repositories;

import codeclan.com.example.Staffservice.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
