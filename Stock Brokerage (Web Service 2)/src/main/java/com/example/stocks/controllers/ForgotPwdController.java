//package com.example.stocks.controllers;
//
//
//import com.example.stocks.models.UserRegistration;
//import com.example.stocks.services.ForgotPwdService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping(value="/forgotpassword/")
//public class ForgotPwdController {
//
//    @Autowired
//    private ForgotPwdService forgotPwdService;
//
//    @GetMapping("pwd/{email}")
//    public String getUser(@RequestParam String email)
//    {
//        System.out.println("inside get");
//        String emailAdd = forgotPwdService.getUser(email);
//        if(emailAdd==null)
//        {
//            return "true";
//        }
//    }
//
//    @PutMapping("pwd/{email}")
//    public void updateUser(@RequestBody UserRegistration user, @PathVariable String email)
//    {
//        forgotPwdService.updateUser(email, user);
//    }
//}
