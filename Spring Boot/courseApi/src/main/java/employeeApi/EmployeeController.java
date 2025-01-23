package employeeApi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	// Display all employees
	@RequestMapping("/employee")
	public String displayAllEmployees(Model model) {
		model.addAttribute("employees", employeeService.getAllEmployee());
		return "employeeList"; // employeeList.html will be rendered
	}

	// Display details of a specific employee
	@RequestMapping("/employee/{id}")
	public String getEmployee(@PathVariable String id, Model model) {
		Employee employee = employeeService.getEmployee(id);
		model.addAttribute("employee", employee);
		return "employeeDetail"; // employeeDetail.html will be rendered
	}

	@RequestMapping(value = "/employee/add", method = RequestMethod.POST)
	public String addEmployee(@ModelAttribute Employee employee, Model model) {
		// Check for duplicate ID before adding
		if (employeeService.isEmployeeExists(employee.getId())) {
			model.addAttribute("errorMessage", "Duplicate entries should not occur.");
			model.addAttribute("employee", employee);
			return "employeeAdd"; // Stay on the add employee form and show the error
		}

		employeeService.addEmployee(employee);
		return "redirect:/employee"; // Redirect to the employee list
	}

	// Show form to edit an employee
	@RequestMapping(value = "/employee/edit/{id}", method = RequestMethod.GET)
	public String showEditEmployeeForm(@PathVariable String id, Model model) {
		Employee employee = employeeService.getEmployee(id);
		model.addAttribute("employee", employee);
		return "employeeEdit"; // employeeEdit.html form will be rendered
	}

	// Handle employee update
	@RequestMapping(value = "/employee/update/{id}", method = RequestMethod.POST)
	public String updateEmployee(@PathVariable String id, @ModelAttribute Employee employee) {
		employeeService.updateEmployee(id, employee);
		return "redirect:/employee"; // Redirect to the employee list
	}

	// Handle employee deletion
	@RequestMapping(value = "/employee/delete/{id}", method = RequestMethod.GET)
	public String deleteEmployee(@PathVariable String id) {
		employeeService.deleteEmployee(id);
		return "redirect:/employee"; // Redirect to the employee list
	}
}
