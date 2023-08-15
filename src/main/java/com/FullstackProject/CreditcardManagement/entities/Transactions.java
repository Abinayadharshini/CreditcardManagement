package com.FullstackProject.CreditcardManagement.entities;

import org.springframework.data.annotation.Id;

import java.util.Date;

public class Transactions {
    @Id
    private String id;
    private String trans_date_trans_time;
    private double amt;
    private int trans_num;

    private int  customer_id;
    private String city;
    private String state;
    private long city_population;
    private String merchant;
    private String category;
    private String first;
    private String last;
    private Gender gender;
    private
    String job;
    private Date dob;
    public static enum Gender {
        M, F;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTrans_date_trans_time() {
        return trans_date_trans_time;
    }

    public void setTrans_date_trans_time(String trans_date_trans_time) {
        this.trans_date_trans_time = trans_date_trans_time;
    }

    public double getAmt() {
        return amt;
    }

    public void setAmt(double amt) {
        this.amt = amt;
    }

    public int getTrans_num() {
        return trans_num;
    }

    public void setTrans_num(int trans_num) {
        this.trans_num = trans_num;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public long getCity_population() {
        return city_population;
    }

    public void setCity_population(long city_population) {
        this.city_population = city_population;
    }

    public String getMerchant() {
        return merchant;
    }

    public void setMerchant(String merchant) {
        this.merchant = merchant;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public Transactions(String id, String trans_date_trans_time, double amt, int trans_num, int customer_id, String city, String state, long city_population, String merchant, String category, String first, String last, Gender gender, String job, Date dob) {
        this.id = id;
        this.trans_date_trans_time = trans_date_trans_time;
        this.amt = amt;
        this.trans_num = trans_num;
        this.customer_id = customer_id;
        this.city = city;
        this.state = state;
        this.city_population = city_population;
        this.merchant = merchant;
        this.category = category;
        this.first = first;
        this.last = last;
        this.gender = gender;
        this.job = job;
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Transactions{" +
                "id='" + id + '\'' +
                ", trans_date_trans_time='" + trans_date_trans_time + '\'' +
                ", amt=" + amt +
                ", trans_num=" + trans_num +
                ", customer_id=" + customer_id +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", city_population=" + city_population +
                ", merchant='" + merchant + '\'' +
                ", category='" + category + '\'' +
                ", first='" + first + '\'' +
                ", last='" + last + '\'' +
                ", gender=" + gender +
                ", job='" + job + '\'' +
                ", dob=" + dob +
                '}';
    }
}
