package com.FullstackProject.CreditcardManagement.controller;

import com.FullstackProject.CreditcardManagement.entities.Transactions;
import com.FullstackProject.CreditcardManagement.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController

@RequestMapping("/transactions")

// http://localhost:8080/transactions

public class TransactionController {
    @Autowired
    private TransactionService transService;
    @GetMapping("/city/{city}")
    public List<Transactions> getTransactionByCity(@PathVariable String city){
        List<Transactions> T =this.transService.getTransactionByCity(city);
        System.out.println(T);
        return T;
    }
    @GetMapping("/merchant/{merchant}")
    public List<Transactions> getTransactionByMerchant(@PathVariable String merchant){
        List<Transactions> T=this.transService.getTransactionByMerchant(merchant);
        System.out.println(T);
        return T;
    }
    @GetMapping("/state/{state}")
    public List<Transactions> getTransactionByState(@PathVariable String state){
        List<Transactions> T=this.transService.getTransactionByState(state);
        System.out.println(T);
        return T;
    }
    @GetMapping("/gender/{gender}")
    public List<Transactions> getTransactionByGender(@PathVariable String gender) {
        List<Transactions> T = this.transService.getTransactionByGender(gender);
        System.out.println(T);
        return T;
    }
    @GetMapping("/category/{category}")
    public List<Transactions> getTransactionBySpendingCategory(@PathVariable String category) {
        List<Transactions> T = this.transService.getTransactionByCategory(category);
        System.out.println(T);
        return T;
    }
    @GetMapping("/job/{job}")
    public List<Transactions> getTransactionByJob(@PathVariable String job) {
        List<Transactions> T = this.transService.getTransactionByJob(job);
        System.out.println(T);
        return T;
    }
    @GetMapping("/amt/{amt}")
    public List<Transactions> getTransactionByAmt(@PathVariable double amt) {
        List<Transactions> T = this.transService.getTransactionByAmt(amt);
        System.out.println(T);
        return T;
    }
//    @GetMapping
//    public List<Transactions> getAllTransaction(){
//        return this.transService.AllTransaction();
//    }


}
