package com.FullstackProject.CreditcardManagement.repo;

import com.FullstackProject.CreditcardManagement.entities.Transactions;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface ITransactionRepository extends MongoRepository<Transactions,String> {

    //Job
    List<Transactions> findByJob(String job);
    Page<Transactions> findByJob(String job,Pageable pageable);


    //Category
    List<Transactions> findByCategory(String category);
    Page<Transactions> findByCategory(String category,Pageable pageable);

    //Merchant
    List<Transactions> findByMerchant(String merchant);
    Page<Transactions> findByMerchant(String merchant,Pageable pageable);


    //City
    List<Transactions> findByCity(String city);
    Page<Transactions> findByCity(String city,Pageable pageable);


    //state
    List<Transactions> findByState(String state);
    Page<Transactions> findByState(String state,Pageable pageable);

    //Gender
    List<Transactions> findByGender(String gender);
    Page<Transactions> findByGender(String gender,Pageable pageable);

    //Amt of spending
    Page<Transactions> findAll(Pageable pageable);
}
