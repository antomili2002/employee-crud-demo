package de.demo.crud.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import de.demo.crud.entity.Employee;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    /*
     * this method will automatically be executed by Spring Boot
     * it creates and executes the query to order the employees by LastName
     * EmployeeServiceImpl will call this method on instance EmployeeRepository
     */
    public List<Employee> findAllByOrderByLastNameAsc();
}
