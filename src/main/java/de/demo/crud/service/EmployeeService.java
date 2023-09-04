package de.demo.crud.service;

import java.util.List;
import de.demo.crud.entity.Employee;

public interface EmployeeService {

	List<Employee> findAll();
	
	Employee findById(int id);
	
	void save(Employee employee);
	
	void deleteById(int id);
	
}
