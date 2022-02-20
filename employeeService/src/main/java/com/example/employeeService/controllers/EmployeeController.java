package com.example.employeeService.controllers;

import com.example.employeeService.enities.Employee;
import com.example.employeeService.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/")
    public Employee saveEmployee(@RequestBody Employee employee) {
        return employeeService.saveEmployee(employee);
    }

    @GetMapping("/{id}")
    public Employee findEmployee(@PathVariable("id") String employeeId) {
        return employeeService.findEmployee(employeeId);
    }
}
