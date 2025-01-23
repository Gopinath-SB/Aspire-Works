package employeeApi;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, String> {
    // JpaRepository provides CRUD methods like findAll(), save(), deleteById(), etc.
}
