package springboot.backend.springboot_backend.Controller;

import java.util.List;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import springboot.backend.springboot_backend.Model.Employee;
import springboot.backend.springboot_backend.Service.EmployeeService;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
	private EmployeeService  employeeService;

	
	
	public EmployeeController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}



	//build create employee REST API
	@PostMapping
	public ResponseEntity<Employee>saveEmployee(@RequestBody Employee employee){
		return new ResponseEntity<Employee>(employeeService.saveEmployee(employee),HttpStatus.CREATED);
				
	}
//	//build get all employees REST API
//	@GetMapping
//	public List<Employee> getAllEmployees(){
//		return employeeService.getAllEmployees();
//	}
//	//build get Employee by id REST API
//	//http://localhost:9001/api/employees/3
//	@GetMapping("{id}")
//	public ResponseEntity<Employee> getEmployeeById(@PathVariable("id")long EmpId) {
//		return new ResponseEntity<Employee>(employeeService.getEmployeebyId(EmpId),HttpStatus.OK);
//	}
//	//build update employee by Id REST API
//	//http://localhost:9001/api/employees/5
//	@PutMapping("{id}")
//	public ResponseEntity<Employee> updateEmployeeById(@RequestBody Employee employee,@PathVariable("id")long EmpId){
//		return new ResponseEntity<Employee>(employeeService.updateEmployeeById(employee, EmpId),HttpStatus.OK);
//	}
//	
//	//build delete employee by Id REST API
//	//http://localhost:9001/api/employees/7
//	@DeleteMapping("{id}")
//	public ResponseEntity<String> deleteEmployeeById(@PathVariable("id")long EmpId){
//		employeeService.DeleteEmployeeById(EmpId);
//		return new ResponseEntity<String>("Employee deleted successfully!",HttpStatus.OK);
//	}
}
