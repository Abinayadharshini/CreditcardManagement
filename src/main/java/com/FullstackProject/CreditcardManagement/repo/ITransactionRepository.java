package com.FullstackProject.CreditcardManagement.repo;

import com.FullstackProject.CreditcardManagement.entities.Transactions;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface ITransactionRepository extends MongoRepository<Transactions,String> {
    List<Transactions> findByCity(String city);
    List<Transactions> findByMerchant(String merchant);
    List<Transactions> findByState(String state);
    List<Transactions> findByGender(String gender);

    List<Transactions> findByCategory(String category);
    List<Transactions> findByJob(String job);
    Page<Transactions> findAll(Pageable pageable);

    //Page<Transactions> findByJob(String job,Pageable pageable);
}
