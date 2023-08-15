package com.FullstackProject.CreditcardManagement.entities;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

@Document("customers")
public class Customers {

    private String first;
    private String last;
    private String gender;
    public static enum Gender {
        M, F;
    }
    private String job;
    private Date dob;
    @Id
    private String id;
    @Field("customer_id")
    private int customerId;


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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
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


    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public Customers(String first, String last, String gender, String job, Date dob) {

        this.first = first;
        this.last = last;
        this.gender = gender;
        this.job = job;
        this.dob = dob;
       // this.customerId = customerId;
    }

    @Override
    public String toString() {
        return "Customers{" +
                ", first='" + first + '\'' +
                ", last='" + last + '\'' +
                ", gender='" + gender + '\'' +
                ", job='" + job + '\'' +
                ", dob=" + dob +
                ", customer_id=" + customerId +
                '}';
    }
}
