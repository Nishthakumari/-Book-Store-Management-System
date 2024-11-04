package com.store.bookstore_management.controller;

import com.store.bookstore_management.model.Customer;
import com.store.bookstore_management.service.CustomerService;
import org.hibernate.id.factory.spi.CustomIdGeneratorCreationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {
    @Autowired
    public CustomerService customerService;

    @GetMapping
    public List<Customer> getAllCustomers()
    {
        return customerService.getAllCustomers();
    }

    @PostMapping
    public Customer addCustomer(@RequestBody Customer customer)
    {
        return customerService.addCustomer(customer);
    }

    @DeleteMapping("/{id}")
    public void deleteCustomer(@PathVariable Long id)
    {
        customerService.deleteCustomer(id);
    }

}
