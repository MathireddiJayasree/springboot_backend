package springboot.backend.springboot_backend.Service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import springboot.backend.springboot_backend.Exception.ResourceNotFoundException;
import springboot.backend.springboot_backend.Model.Employee;
import springboot.backend.springboot_backend.Repository.EmployeeRepository;
import springboot.backend.springboot_backend.Service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	private EmployeeRepository employeeRepository;
	
	// no need of @Autowired as this class is a spring bean and only one constructor , spring will configure these dependancies automatically
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	
	}


	@Override
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

//
//	@Override
//	public List<Employee> getAllEmployees() {
//		return employeeRepository.findAll();
//	}
//
//
//	@Override
//	public Employee getEmployeebyId(long id) {
////		Optional<Employee> employee= employeeRepository.findById(id);
////		//checking whether this optional object has employee object
////		if(employee.isPresent()) {
////			return employee.get();
////		}else {
////			throw new ResourceNotFoundException("Employee","EmployeeId","id");
////		}
//		
//		//lambda expression
//		return employeeRepository.findById(id).orElseThrow(()->
//							new ResourceNotFoundException("Employee","EmployeeId","id"));
//	}
//
//
//	@Override
//	public Employee updateEmployeeById(Employee employee, long id) {
//		//we need to check whether employee with given id is exist in DB or not
//		//lambda expression
//		Employee existingEmployee= employeeRepository.findById(id).orElseThrow(()->
//				new ResourceNotFoundException("Employee","EmployeeId","id"));
//		existingEmployee.setFirstName(employee.getFirstName());
//		existingEmployee.setLastName(employee.getLastName());
//		existingEmployee.setEmail(employee.getEmail());
//		//save existing employee to DB
//		return employeeRepository.save(existingEmployee);
//	}
//
//
//	@Override
//	public void DeleteEmployeeById(long id) {
//		//we need to check whether employee with given id is exist in DB or not
//		//lambda expression
//		Employee existingEmployee=employeeRepository.findById(id).orElseThrow(()->
//				new ResourceNotFoundException("Employee","EmployeeId","id"));;
//		//findById method gives OptionalObject
//		 employeeRepository.deleteById(id);
//	}
//
//
//	
//
//	

}
