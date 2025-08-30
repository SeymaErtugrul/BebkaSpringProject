package com.example.BebkaSpringProject.repository;

import com.example.BebkaSpringProject.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeIRepository extends JpaRepository<Employee,Long> {
}
