package com.FullstackProject.CreditcardManagement.service;

import com.FullstackProject.CreditcardManagement.entities.Customers;
import com.FullstackProject.CreditcardManagement.exceptions.CustomerExistsException;
import com.FullstackProject.CreditcardManagement.exceptions.CustomerNotFoundException;
import com.FullstackProject.CreditcardManagement.repo.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CustomerService{

    @Autowired
    private ICustomerRepository CustomerRepo;

    public Customers insertCustomer(Customers customers) throws CustomerExistsException {
        boolean c1= CustomerRepo.existsByFirst(customers.getFirst());
        boolean c2= CustomerRepo.existsByLast(customers.getLast());
        if(c1 && c2){
            System.out.println("Customer "+customers.getFirst()+" "+customers.getLast() +" already exists");
            throw new CustomerExistsException("Customer "+customers.getFirst()+" "+customers.getLast() +" already exists");
        }
        else {
            long count = this.CustomerRepo.count();
            int c=(int)count;
            customers.setCustomerId(c);
            CustomerRepo.save(customers);
            System.out.println("Your credit card is registered successfully!");
            System.out.println("Customer Id : "+customers.getCustomerId());
        }
        return customers;
    }

    public void deleteCustomer(Integer customerId) throws CustomerNotFoundException {
        if(!CustomerRepo.existsByCustomerId(customerId))
            throw new CustomerNotFoundException("Customer Id "+customerId+" does not exist");
        CustomerRepo.deleteByCustomerId(customerId);
    }
}
