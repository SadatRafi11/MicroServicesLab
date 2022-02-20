package com.example.customerService.services;

import com.example.customerService.entities.Customer;
import com.example.customerService.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    public Customer findCustomer(String customerId) {
        return customerRepository.findCustomerById(customerId);
    }
}
