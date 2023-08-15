package com.FullstackProject.CreditcardManagement.service;

import com.FullstackProject.CreditcardManagement.entities.Customers;
import com.FullstackProject.CreditcardManagement.exceptions.CustomerExistsException;
import com.FullstackProject.CreditcardManagement.exceptions.CustomerNotFoundException;
import com.FullstackProject.CreditcardManagement.repo.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("")
public class CustomerService{

    @Autowired
    private ICustomerRepository CustomerRepo;

    public Customers insertCustomer(Customers customers) throws CustomerExistsException {
        if(CustomerRepo.existsById(customers.getCustomer_id()))
            throw new CustomerExistsException("Employee with "+customers.getId()+"already exists");
        long count = this.CustomerRepo.count();
        count++;
        int c=(int)count;
        customers.setCustomer_id(c);
        Customers savedEmployee = CustomerRepo.save(customers);
        System.out.printf("There are now %d employees\n", CustomerRepo.count());
        return  savedEmployee;
    }
    public void deleteCustomer(Integer customer_id) throws CustomerNotFoundException {
        if(!CustomerRepo.existsById(customer_id))
            throw new CustomerNotFoundException("Customer with "+customer_id+" does not exist");
        CustomerRepo.deleteById(customer_id);
    }
}
