package com.example.BebkaSpringProject.service;

import com.example.BebkaSpringProject.controller.EmployeeController;
import com.example.BebkaSpringProject.model.Employee;
import com.example.BebkaSpringProject.model.Student;
import com.example.BebkaSpringProject.repository.EmployeeIRepository;
import com.example.BebkaSpringProject.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    private final EmployeeIRepository employeeIRepository;

    public EmployeeService(EmployeeIRepository employeeIRepository) {
        this.employeeIRepository = employeeIRepository;
    }

    public Employee addEmployee(Employee employee)
    {
    return employeeIRepository.save(employee);
    }

    public List<Employee> getAllEmployees() {
        return employeeIRepository.findAll();
    }
public Employee updateEmployee(long employeeid,String employeeName,String employeeMail)
{
 Employee employee= employeeIRepository.findById(employeeid) .orElseThrow(() -> new RuntimeException(" Böyle bir çalışan yok"));
     employee.setName(employeeName);
     employee.setEmail(employeeMail);
     return employeeIRepository.save(employee);
}

public void deleteEmployee(Long employeeId)
{
   Employee employee= employeeIRepository.findById(employeeId) .orElseThrow(() -> new RuntimeException("Böyle bir çalışan yok"));
    employeeIRepository.delete(employee);
}
}
