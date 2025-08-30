package com.example.BebkaSpringProject.controller;

import com.example.BebkaSpringProject.model.Employee;
import com.example.BebkaSpringProject.service.EmployeeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    private EmployeeService employeeService;

    public EmployeeController (EmployeeService employeeService)
    {
        this.employeeService=employeeService;
    }

    @PostMapping("/addEmployee")
    public Employee addEmploye(@RequestBody Employee employee)
    {
        return employeeService.addEmployee(employee);
    }

    @GetMapping
    public List<Employee>findEmployees()
    {
       return employeeService.getAllEmployees();
    }

    @PutMapping("/{id}")
    public Employee updateEmployee(@PathVariable Long id,     @RequestParam(required = false) String name,
                                   @RequestParam(required = false) String email)
    {
        return employeeService.updateEmployee(id,name,email);
    }

    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable Long id)
    {
        employeeService.deleteEmployee(id);
    }

    @GetMapping("/getByName")
    public List<Employee> getByName(@RequestParam String name) {
        return employeeService.findByName(name);
    }

    @GetMapping("/getByDepartment")
    public List<Employee> getByDepartment(@RequestParam String department) {
        return employeeService.findByDepartment(department);
    }

    @GetMapping("/getGreaterSalary")
    public ResponseEntity<List<Employee>> getBySalary(@RequestParam float amount){
        return ResponseEntity.ok(employeeService.getEmployeesWithSalaryGreaterThan(amount));
    }

    @GetMapping("/getNativeDepartment")
    public ResponseEntity<List<Employee>> getByDepartmentNative(@RequestParam String dept){
        return ResponseEntity.ok(employeeService.getEmployeesByDepartmentNative(dept));
    }
}
