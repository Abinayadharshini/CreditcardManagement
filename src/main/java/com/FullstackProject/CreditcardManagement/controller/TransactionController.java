package com.FullstackProject.CreditcardManagement.controller;

import com.FullstackProject.CreditcardManagement.entities.Customers;
import com.FullstackProject.CreditcardManagement.entities.Transactions;
import com.FullstackProject.CreditcardManagement.exceptions.CustomerExistsException;
import com.FullstackProject.CreditcardManagement.exceptions.CustomerNotFoundException;
import com.FullstackProject.CreditcardManagement.repo.TransactionPerPageResponse;
import com.FullstackProject.CreditcardManagement.service.TransactionService;
import com.FullstackProject.CreditcardManagement.utility.StatusMessages;
import io.swagger.v3.oas.models.responses.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController

@RequestMapping("/transactions")

// http://localhost:8080/transactions

public class TransactionController {
    @Autowired
    private TransactionService transService;

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
    @GetMapping("/merchant/{merchant}")
    public List<Transactions> getTransactionByMerchant(@PathVariable String merchant){
        List<Transactions> T=this.transService.getTransactionByMerchant(merchant);
        System.out.println(T);
        return T;
    }
    @GetMapping("/city/{city}")
    public List<Transactions> getTransactionByCity(@PathVariable String city){
        List<Transactions> T =this.transService.getTransactionByCity(city);
        System.out.println(T);
        return T;
    }
    @GetMapping("/state/{state}")
    public List<Transactions> getTransactionByState(@PathVariable String state){
        List<Transactions> T=this.transService.getTransactionByState(state);
        System.out.println(T);
        return T;
    }
    @GetMapping("/job/{job}")
    public List<Transactions> getTransactionByJob(@PathVariable String job) {
        List<Transactions> T = this.transService.getTransactionByJob(job);
        System.out.println(T);
        return T;
    }

//    @GetMapping("/amt/{amt}")
//    public List<Transactions> getTransactionByAmt(@PathVariable double amt) {
//        List<Transactions> T = this.transService.getTransactionByAmt(amt);
//        System.out.println(T);
//        return T;
//    }
    @GetMapping("/getTransactionByOrderByAmtAsc")
    public List<Transactions> getTransactionByOrderByAmtAsc(){
        List<Transactions> T = this.transService.getTransactionByOrderByAmtAsc();
        System.out.println(T);
        return T;
    }

    @GetMapping("/pages")
    public TransactionPerPageResponse getTransactionsByPage(@RequestParam(required = false, defaultValue = "0") int pageno,
                                                         @RequestParam(required = false, defaultValue = "5") int size)
    {
        return this.transService.getTransactionsByPagination(pageno, size);
    }


}
