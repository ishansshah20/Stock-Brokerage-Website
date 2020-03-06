package com.example.stocks.controllers;

import com.example.stocks.models.UserRegistration;
import com.example.stocks.services.LoginService;
import com.example.stocks.services.UserRegistrationService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/stockregistration/")
public class UserRegistrationController
{
    private static final Logger logger = LogManager.getLogger(UserRegistrationController.class);

    @Autowired
    UserRegistrationService userRegistrationService;

    @Autowired
    LoginService loginService;


//    @GetMapping("user/{id}")
//    public UserRegistration getUser(@PathVariable int id)
//    {
//        System.out.println("inside get");
//        return userRegistrationService.getUser(id);
//    }

    @PostMapping("user")
    public void postUser(@RequestBody UserRegistration user)
    {
        userRegistrationService.registerUser(user);
        logger.info("User registered Successfully");
    }

    @PostMapping("updateuser")
    public void postUser(@RequestBody UserRegistration user,@RequestParam String email)
    {
        userRegistrationService.updateUser(email, user);
        logger.info("User registered Successfully");
    }




    @GetMapping("user")
    public UserRegistration getUser(@RequestParam String email)
    {
        System.out.println("inside get");
        return userRegistrationService.getUser(email);
    }


//    @DeleteMapping("user/{id}")
//    public void deleteUser(@PathVariable int id)
//    {
//        userRegistrationService.deleteUser(id);
//    }

    @DeleteMapping("user/{email}")
    public void deleteUser(@PathVariable String email)
    {
        userRegistrationService.deleteUser(email);
    }


    @PutMapping("user/{email}")
    public void updateUser(@RequestBody UserRegistration user, @PathVariable String email)
    {
        userRegistrationService.updateUser(email, user);
    }
}
