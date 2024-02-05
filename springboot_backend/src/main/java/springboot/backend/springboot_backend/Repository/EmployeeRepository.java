package springboot.backend.springboot_backend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import springboot.backend.springboot_backend.Model.Employee;
// no need of @Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long>{

}
