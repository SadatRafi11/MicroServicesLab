package com.example.employeeService.services;

import com.example.employeeService.enities.Employee;
import com.example.employeeService.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public Employee findEmployee(String employeeId) {
        return employeeRepository.findEmployeeById(employeeId);
    }
}
