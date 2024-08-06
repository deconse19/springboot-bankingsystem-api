package com.sprintboot.banking_system.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "accounts")
@Getter
@Setter
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String acccountHolderName;
    private double balance;

    public Account(Long id, String acccountHolderName, double balance) {
        this.id = id;
        this.acccountHolderName = acccountHolderName;
        this.balance = balance;
    }

    
    public Account() {
    }


    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getAcccountHolderName() {
        return acccountHolderName;
    }
    public void setAcccountHolderName(String acccountHolderName) {
        this.acccountHolderName = acccountHolderName;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    


}
