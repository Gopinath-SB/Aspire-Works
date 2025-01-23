package employeeApi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	// Fetch all employees
	public List<Employee> getAllEmployee() {
		return employeeRepository.findAll();
	}

	// Fetch an employee by ID
	public Employee getEmployee(String id) {
		return employeeRepository.findById(id).orElse(null);
	}

	// Add a new employee
	public void addEmployee(Employee employee) {
		employeeRepository.save(employee);
	}

	// Update an existing employee
	public void updateEmployee(String id, Employee employee) {
		employeeRepository.save(employee);
	}

	// Delete an employee by ID
	public void deleteEmployee(String id) {
		employeeRepository.deleteById(id);
	}
}
