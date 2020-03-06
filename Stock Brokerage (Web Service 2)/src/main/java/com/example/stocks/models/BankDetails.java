package com.example.stocks.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;


import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "bank_details")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class BankDetails {
    private String useremail;
    @Id
    private String accountnumber;
    private String routingnumber;
    private String bankname;
    private String accountbalance;

    public String getUseremail() {
        return useremail;
    }

    public void setUseremail(String useremail) {
        this.useremail = useremail;
    }

    public String getBankname() {
        return bankname;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname;
    }

    public String getRoutingnumber() {
        return routingnumber;
    }

    public void setRoutingnumber(String routingnumber) {
        this.routingnumber = routingnumber;
    }

    public String getAccountnumber() {
        return accountnumber;
    }

    public void setAccountnumber(String accountnumber) {
        this.accountnumber = accountnumber;
    }

    public String getAccountbalance() {
        return accountbalance;
    }

    public void setAccountbalance(String accountbalance) {
        this.accountbalance = accountbalance;
    }

//    @ManyToOne(fetch = FetchType.LAZY, optional = false)
//    @JoinColumn(name = "id", nullable = false)
//    @OnDelete(action = OnDeleteAction.CASCADE)
//    @JsonIgnore
//    private UserRegistration user;
//
//    public UserRegistration getUser() {
//        return user;
//    }
//
//    public void setUser(UserRegistration user) {
//        this.user = user;
//    }

    @Override
    public String toString() {
        return "BankDetails{" +
                ", routingnumber='" + routingnumber + '\'' +
                ", accountnumber='" + accountnumber + '\'' +
                ", bankname='" + bankname + '\'' +
                ", accountbalance='" + accountbalance + '\'' +
                '}';
    }
}
