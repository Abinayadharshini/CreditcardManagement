package com.FullstackProject.CreditcardManagement.repo;

import com.FullstackProject.CreditcardManagement.entities.Customers;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ICustomerRepository extends MongoRepository<Customers, Integer> {

   // Customers findByCustomerId(int customer_id);
    //boolean deleteByTitle(String title);
    long deleteByCustomerId(int customerId);

    boolean existsByCustomerId(Integer customerId);

    boolean existsByFirst(String first);

    boolean existsByLast(String last);

    //existsByFirst(customers.getFirst()
}
