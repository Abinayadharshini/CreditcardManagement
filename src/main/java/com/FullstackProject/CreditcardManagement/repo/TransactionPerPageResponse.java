package com.FullstackProject.CreditcardManagement.repo;

import com.FullstackProject.CreditcardManagement.entities.Transactions;

import java.util.List;

public class TransactionPerPageResponse {
    int totalPages;
    long totalElements;
    int noofelements ;
    int pagesize ;
    List<Transactions> transactions;

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public long getTotalElements() {
        return totalElements;
    }

    public void setTotalElements(long totalElements) {
        this.totalElements = totalElements;
    }

    public int getNoofelements() {
        return noofelements;
    }

    public void setNoofelements(int noofelements) {
        this.noofelements = noofelements;
    }

    public int getPagesize() {
        return pagesize;
    }

    public void setPagesize(int pagesize) {
        this.pagesize = pagesize;
    }

    public List<Transactions> getTransactions() {
        return transactions;
    }

    public void setEmployees(List<Transactions> transactions) {
        this.transactions = transactions;
    }
}
