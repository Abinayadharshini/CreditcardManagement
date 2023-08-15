package com.FullstackProject.CreditcardManagement.entities;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document("customers")
public class Customers {

   // @Id
    private String id;
    private String first;
    private String last;
    private String gender;
    public static enum Gender {
        M, F;
    }
    private String job;
    private Date dob;
    @Id
    private int customer_id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public Customers(String id, String first, String last, String gender, String job, Date dob, int customer_id) {
        this.id = id;
        this.first = first;
        this.last = last;
        this.gender = gender;
        this.job = job;
        this.dob = dob;
        this.customer_id = customer_id;
    }

    @Override
    public String toString() {
        return "Customers{" +
                "id='" + id + '\'' +
                ", first='" + first + '\'' +
                ", last='" + last + '\'' +
                ", gender='" + gender + '\'' +
                ", job='" + job + '\'' +
                ", dob=" + dob +
                ", customer_id=" + customer_id +
                '}';
    }
}
