package com.example.BebkaSpringProject.repository;

import com.example.BebkaSpringProject.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeIRepository extends JpaRepository<Employee,Long> {
    public List<Employee> findByNameContaining(String name);

    public List<Employee> findByDepartment(String department);

    @Query("SELECT e FROM Employee e WHERE e.salary > :amount")
    List<Employee> getEmployeesWithSalaryGreaterThan(@Param("amount") float amount);

    @Query(value = "SELECT * FROM employee WHERE department = :dept", nativeQuery = true)
    List<Employee> getEmployeesByDepartmentNative(@Param("dept") String dept);
}