package com.example.stocks.services;

import com.example.stocks.models.UserRegistration;
import com.example.stocks.repositories.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Autowired
    LoginRepository loginRepository;

    public String validateUser(String email) {
        return this.loginRepository.findByEmailAddress(email);
    }
}