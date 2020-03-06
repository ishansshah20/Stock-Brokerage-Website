//package com.example.stocks.services;
//
//import com.example.stocks.models.UserRegistration;
//import com.example.stocks.repositories.ForgotPwdRepository;
//import com.example.stocks.repositories.UserRegistrationRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import java.util.List;
//
//public class ForgotPwdService {
//
//    @Autowired
//    ForgotPwdRepository forgotPwdRepository;
//
//    public String getUser(String email)
//    {
//        return this.forgotPwdRepository.getByEmail(email);
//    }
//
//    public void updateUser(String email, UserRegistration userRegistration)
//    {
//        String code = Integer.toString(getRandomNumber());
//        this.forgotPwdRepository.updateCode(code,email);
//    }
//
//    public static int getRandomNumber()
//    {
//        int x = (int) Math.random();
//        return x;
//    }
//}
