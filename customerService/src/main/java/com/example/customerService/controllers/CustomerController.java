package com.example.customerService.controllers;

import com.example.customerService.entities.Customer;
import com.example.customerService.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customers")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @PostMapping("/")
    public Customer saveCustomer(@RequestBody Customer customer) {
        return customerService.saveCustomer(customer);
    }

    @GetMapping("/{id}")
    public Customer findCustomer(@PathVariable("id") String customerId) {
        return customerService.findCustomer(customerId);
    }
}
