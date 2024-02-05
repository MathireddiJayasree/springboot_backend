package springboot.backend.springboot_backend.controller;

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

import springboot.backend.springboot_backend.model.employee;
import springboot.backend.springboot_backend.service.EmployeeService;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
	private EmployeeService employeeService;

	public EmployeeController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}
	
	//build create employee rest api
	@PostMapping
	public ResponseEntity<employee>saveEmploy(@RequestBody employee employ){
		return new ResponseEntity<employee>(employeeService.saveEmployee(employ),HttpStatus.CREATED);
	}
	//build get all employees rest api
	@GetMapping
	public List<employee> getAllEmployees(){
		return employeeService.getAllEmployees();
	}
	@GetMapping("{id}")
	public ResponseEntity<employee>getEmployee(@PathVariable("id")long roll){
		return new ResponseEntity<employee>(employeeService.getEmployeebyId(roll),HttpStatus.OK);
	}
	@PutMapping("{id}")
	public ResponseEntity<employee>updateEmployee(@RequestBody employee employ,@PathVariable("id")long roll){
		return new ResponseEntity<employee>(employeeService.updateEmployeeById(employ, roll),HttpStatus.OK);
		
	}
	@DeleteMapping("{id}")
	public ResponseEntity<String>deleteEmployee(@PathVariable("id")long roll){
		employeeService.deleteEmployeeById(roll);
		return new ResponseEntity<String>("Employee deleted ",HttpStatus.OK);
	}
}
