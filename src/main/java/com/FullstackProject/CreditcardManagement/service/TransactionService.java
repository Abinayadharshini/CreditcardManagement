package com.FullstackProject.CreditcardManagement.service;

import com.FullstackProject.CreditcardManagement.entities.Transactions;
import com.FullstackProject.CreditcardManagement.repo.ITransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TransactionService {
    @Autowired
    private ITransactionRepository transRepo;
    public List<Transactions> AllTransaction(){
        return this.transRepo.findAll();
    }
    public List<Transactions> getTransactionByCity(String city){
        return transRepo.findByCity(city);
    }
    public List<Transactions> getTransactionByMerchant(String merchant){
        return transRepo.findByMerchant(merchant);
    }
    public List<Transactions> getTransactionByState(String state){
        return transRepo.findByState(state);
    }
    public List<Transactions> getTransactionByGender(String gender){
        return transRepo.findByGender(gender);
    }
    public List<Transactions> getTransactionByCategory(String category){
        return transRepo.findByCategory(category);
    }
    public List<Transactions> getTransactionByJob(String job){
        return transRepo.findByJob(job);
    }
    public List<Transactions> getTransactionByAmt(double amt){
        return transRepo.findByAmt(amt);
    }
    public Transactions addTransaction(Transactions transaction) {
        if(transRepo.existsById(transaction.getId())){
            return null;
        }
        else {
            System.out.println("INSERTING "+transaction.getId());
            transRepo.save(transaction);
        }

        return transaction;
    }

}
