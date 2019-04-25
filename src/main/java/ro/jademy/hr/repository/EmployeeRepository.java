package ro.jademy.hr.repository;

import org.springframework.data.repository.CrudRepository;
import ro.jademy.hr.model.Employee;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

    List<Employee> findAll();
}
