package com.example.BebkaSpringProject.repository;

import com.example.BebkaSpringProject.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeIRepository extends JpaRepository<Employee,Long> {
    public List<Employee> findByNameContaining(String name);
    public List<Employee>findByDepartment(String department);
}
