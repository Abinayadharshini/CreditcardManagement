package com.FullstackProject.CreditcardManagement.controller;


import com.FullstackProject.CreditcardManagement.entities.Customers;
import com.FullstackProject.CreditcardManagement.entities.Transactions;
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

   // @RequestMapping("/customers/greet/get")
//    public String greet(){
//        return "Hey";
//    }

//    @GetMapping("customers/greet")
//    public String greet(){
//        return "Hey";
//    }

//    @GetMapping("/customer_id/{customer_id}")
//    public Customers getCustomerByCustomerId(@PathVariable int customer_id){
//        Customers C =this.customerService.getCustomerByCustomerId(customer_id);
//        System.out.println(C);
//        return C;
//    }
    @PostMapping
    public ResponseEntity<Object> addCustomerById(@RequestBody Customers customers)
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
        System.out.println("Deleting Customer with Id: "+customer_id);
        Map<StatusMessages, String> map = new HashMap<>();
        try {
            this.customerService.deleteCustomer(customer_id);
            map.put(StatusMessages.SUCCESS, "Customer deleted successfully");
            System.out.println("Deleted");
            return ResponseEntity.status(HttpStatus.ACCEPTED).body(map);
        }
        catch (CustomerNotFoundException e) {
            System.out.println("Error: "+e.getMessage());
            map.put(StatusMessages.FAILURE, e.getMessage());
            return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body(map);
        }
    }





}
