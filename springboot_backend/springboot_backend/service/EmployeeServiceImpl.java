package springboot.backend.springboot_backend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import springboot.backend.springboot_backend.exception.ResourceNotFoundException;
import springboot.backend.springboot_backend.model.employee;
import springboot.backend.springboot_backend.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	
	private EmployeeRepository employeeRepository;
	private employee existingEmployee;
	private Object employee;
	
	
	// no need of Autowired
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}



	@Override
	public employee saveEmployee(employee employ) {
		
		return employeeRepository.save(employ);
	}


	@Override
	public List<employee> getAllEmployees() {
		return employeeRepository.findAll();
	}
	



	@Override
	public employee getEmployeebyId(long rollNo) {
		
		Optional<employee> employ= employeeRepository.findById(rollNo);
		if(employ.isPresent())
			return employ.get();
		else
			throw new ResourceNotFoundException("employee","RollNo",rollNo);
	}



	@Override
	public employee updateEmployeeById(employee employ,long rollNo) {
		
	Optional<employee> existingEmploy= employeeRepository.findById(rollNo);

	 employee existingEmployee=existingEmploy.get();
	if(existingEmploy.isPresent()) {

		
		existingEmployee.setSurName(employ.getSurName());
	existingEmployee.setActualName(employ.getActualName());
	existingEmployee.setEmail(employ.getEmail());
	
	//save existing employee to DB
	return employeeRepository.save(existingEmployee);
	}
	else
		throw new ResourceNotFoundException("employee","RollNo",rollNo);
	
	}



	@Override
	public void deleteEmployeeById(long rollNo) {
		Optional<employee> existingEmploy=employeeRepository.findById(rollNo);
		//employee existingEmployee=existingEmploy.get();
		if (existingEmploy.isPresent()){
			employeeRepository.deleteById(rollNo);
		}else
			throw new ResourceNotFoundException("employee","RollNo",rollNo);
		
		
	}

}

	

	

	
	


