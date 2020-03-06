package com.example.stocks.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "user_registration")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class UserRegistration
{
    @Id
    @Column(nullable = false, unique = true)
    @Email(message = "Please provide a valid e-mail")
    @NotEmpty(message = "Please provide an e-mail")
    private String email;

    private String username;

    private String password;

    private String address;
//    private String forgotpwdcode;
//
//    public String getForgotpwdcode() {
//        return forgotpwdcode;
//    }
//
//    public void setForgotpwdcode(String forgotpwdcode) {
//        this.forgotpwdcode = forgotpwdcode;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    @Override
    public String toString() {
        return "User{" +
                " email='" + email + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

