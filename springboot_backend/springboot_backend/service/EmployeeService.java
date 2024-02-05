package springboot.backend.springboot_backend.service;

import java.util.List;

import springboot.backend.springboot_backend.model.employee;

public interface EmployeeService {
	employee saveEmployee(employee employ);
	List<employee> getAllEmployees();
	employee getEmployeebyId(long rollNo);
	employee updateEmployeeById(employee employ,long rollNo);
	void deleteEmployeeById(long rollNo);
}
