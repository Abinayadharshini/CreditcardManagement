package com.FullstackProject.CreditcardManagement.controller;


import com.FullstackProject.CreditcardManagement.entities.Customers;
import com.FullstackProject.CreditcardManagement.exceptions.CustomerExistsException;
import com.FullstackProject.CreditcardManagement.exceptions.CustomerNotFoundException;
import com.FullstackProject.CreditcardManagement.service.CustomerService;
import com.FullstackProject.CreditcardManagement.utility.StatusMessages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController



public class CustomerController {

    @Autowired
    private CustomerService customerService;

    // http://localhost:8080/customers/greet/get

    @RequestMapping("/customers/greet/get")
    public String greet(){
        return "Hey";
    }

    @PostMapping
    public ResponseEntity<Object> addEmployee(@RequestBody Customers customers)
    {
        System.out.println((customers));
        try {
            Customers C = this.customerService.insertCustomer(customers);
           // Employee employee1 = this.employeeService.insertEmployee(employee);
            return ResponseEntity.status(HttpStatus.CREATED).body(C);
        }
        catch (CustomerExistsException e) {
            return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body(e.getMessage());
        }
    }

    @DeleteMapping("/{customer_id}")
    public ResponseEntity<Object> deleteCustomerById(@PathVariable Integer customer_id)
    {
        System.out.println("delete Customer "+customer_id);
        Map<StatusMessages, String> map = new HashMap<>();
        try {
            map.put(StatusMessages.SUCCESS, "Employee deleted successfully");
            this.customerService.deleteCustomer(customer_id);
            System.out.println("deleted");
            return ResponseEntity.status(HttpStatus.ACCEPTED).body(map);
        } catch (CustomerNotFoundException e) {
            System.out.println("error "+e.getMessage());
            map.put(StatusMessages.FAILURE, e.getMessage());
            return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body(map);
        }
    }





}
