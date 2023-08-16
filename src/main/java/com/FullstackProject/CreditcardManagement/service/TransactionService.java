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

    public List<Transactions>  getTransactionByOrderByAmtAsc(){
        return transRepo.findAll(Sort.by(Sort.Direction.ASC, "amt"));
        //List<Passenger> passengers = repository.findAll(Sort.by(Sort.Direction.ASC, "seatNumber"));
    }


    public TransactionPerPageResponse getTransactionsByPagination(int pageno, int size) {
        //Pageable pageable = PageRequest.of(pageno, size, Sort.Direction.DESC, "amt");
        Pageable pageable = PageRequest.of(pageno, size);
        Page<Transactions> page = transRepo.findAll( pageable);
        int totalPages = page.getTotalPages();
        long totalElements = page.getTotalElements();
        int noofelements = page.getNumberOfElements();
        int pagesize = page.getSize();
        TransactionPerPageResponse response = new TransactionPerPageResponse();
        response.setEmployees(page.getContent());
        response.setNoofelements(noofelements);
        response.setPagesize(pagesize);
        response.setTotalElements(totalElements);
        response.setTotalPages(totalPages);
        return response;
    }

}
