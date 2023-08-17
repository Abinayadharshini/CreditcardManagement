package com.FullstackProject.CreditcardManagement.service;

import com.FullstackProject.CreditcardManagement.entities.Transactions;
import com.FullstackProject.CreditcardManagement.repo.ITransactionRepository;
import com.FullstackProject.CreditcardManagement.repo.TransactionPerPageResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TransactionService {
    @Autowired
    private ITransactionRepository transRepo;


    public List<Transactions> AllTransaction(){
        return this.transRepo.findAll();
    }
//    public List<Transactions> getTransactionByCity(String city){
//        return transRepo.findByCity(city);
//    }
//    public List<Transactions> getTransactionByMerchant(String merchant){
//        return transRepo.findByMerchant(merchant);
//    }
//    public List<Transactions> getTransactionByState(String state){
//        return transRepo.findByState(state);
//    }
//    public List<Transactions> getTransactionByGender(String gender){
//        return transRepo.findByGender(gender);
//    }
//    public List<Transactions> getTransactionByCategory(String category){
//        return transRepo.findByCategory(category);
//    }
//    public List<Transactions> getTransactionByJob(String job){ return transRepo.findByJob(job); }
//
//
//    public List<Transactions>  getTransactionByOrderByAmtAsc(){
//        return transRepo.findAll(Sort.by(Sort.Direction.ASC, "amt"));
//    }

    //Amt of spending
    public TransactionPerPageResponse getTransactionsByPagination(int pageno, int size) {
        Pageable pageable = PageRequest.of(pageno, size, Sort.Direction.ASC, "amt");
        Page<Transactions> page = transRepo.findAll( pageable);
        int totalPages = page.getTotalPages();
        long totalElements = page.getTotalElements();
        int noofelements = page.getNumberOfElements();
        int pagesize = page.getSize();
        TransactionPerPageResponse response = new TransactionPerPageResponse();
        response.setTransactions(page.getContent());
        response.setNoofelements(noofelements);
        response.setPagesize(pagesize);
        response.setTotalElements(totalElements);
        response.setTotalPages(totalPages);
        return response;
    }

    //Job
    public TransactionPerPageResponse getTransactionsByJobsByPagination(String job, int pageno, int size) {
        Pageable pageable = PageRequest.of(pageno, size);
        Page<Transactions> page = transRepo.findByJob( job, pageable);
        int totalPages = page.getTotalPages();
        long totalElements = page.getTotalElements();
        int noofelements = page.getNumberOfElements();
        int pagesize = page.getSize();
        TransactionPerPageResponse response = new TransactionPerPageResponse();
        response.setTransactions(page.getContent());
        response.setNoofelements(noofelements);
        response.setPagesize(pagesize);
        response.setTotalElements(totalElements);
        response.setTotalPages(totalPages);
        return response;
    }

    //Category
    public TransactionPerPageResponse getTransactionsByCategoryByPagination(String category, int pageno, int size) {
        Pageable pageable = PageRequest.of(pageno, size);
        Page<Transactions> page = transRepo.findByCategory( category, pageable);
        int totalPages = page.getTotalPages();
        long totalElements = page.getTotalElements();
        int noofelements = page.getNumberOfElements();
        int pagesize = page.getSize();
        TransactionPerPageResponse response = new TransactionPerPageResponse();
        response.setTransactions(page.getContent());
        response.setNoofelements(noofelements);
        response.setPagesize(pagesize);
        response.setTotalElements(totalElements);
        response.setTotalPages(totalPages);
        return response;
    }

    //Merchant
    public TransactionPerPageResponse getTransactionsByMerchantByPagination(String merchant, int pageno, int size) {
        Pageable pageable = PageRequest.of(pageno, size);
        Page<Transactions> page = transRepo.findByMerchant( merchant, pageable);
        int totalPages = page.getTotalPages();
        long totalElements = page.getTotalElements();
        int noofelements = page.getNumberOfElements();
        int pagesize = page.getSize();
        TransactionPerPageResponse response = new TransactionPerPageResponse();
        response.setTransactions(page.getContent());
        response.setNoofelements(noofelements);
        response.setPagesize(pagesize);
        response.setTotalElements(totalElements);
        response.setTotalPages(totalPages);
        return response;
    }

    //City
    public TransactionPerPageResponse getTransactionsByCityByPagination(String city, int pageno, int size) {
        Pageable pageable = PageRequest.of(pageno, size);
        Page<Transactions> page = transRepo.findByCity( city, pageable);
        int totalPages = page.getTotalPages();
        long totalElements = page.getTotalElements();
        int noofelements = page.getNumberOfElements();
        int pagesize = page.getSize();
        TransactionPerPageResponse response = new TransactionPerPageResponse();
        response.setTransactions(page.getContent());
        response.setNoofelements(noofelements);
        response.setPagesize(pagesize);
        response.setTotalElements(totalElements);
        response.setTotalPages(totalPages);
        return response;
    }

    //State
    public TransactionPerPageResponse getTransactionsByStateByPagination(String state, int pageno, int size) {
        Pageable pageable = PageRequest.of(pageno, size);
        Page<Transactions> page = transRepo.findByState( state, pageable);
        int totalPages = page.getTotalPages();
        long totalElements = page.getTotalElements();
        int noofelements = page.getNumberOfElements();
        int pagesize = page.getSize();
        TransactionPerPageResponse response = new TransactionPerPageResponse();
        response.setTransactions(page.getContent());
        response.setNoofelements(noofelements);
        response.setPagesize(pagesize);
        response.setTotalElements(totalElements);
        response.setTotalPages(totalPages);
        return response;
    }

    //gender
    public TransactionPerPageResponse getTransactionsByGenderByPagination(String gender, int pageno, int size) {
        Pageable pageable = PageRequest.of(pageno, size);
        Page<Transactions> page = transRepo.findByGender( gender, pageable);
        int totalPages = page.getTotalPages();
        long totalElements = page.getTotalElements();
        int noofelements = page.getNumberOfElements();
        int pagesize = page.getSize();
        TransactionPerPageResponse response = new TransactionPerPageResponse();
        response.setTransactions(page.getContent());
        response.setNoofelements(noofelements);
        response.setPagesize(pagesize);
        response.setTotalElements(totalElements);
        response.setTotalPages(totalPages);
        return response;
    }

}
