package springboot.backend.springboot_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import springboot.backend.springboot_backend.model.employee;

public interface EmployeeRepository extends JpaRepository<employee,Long>{

}
