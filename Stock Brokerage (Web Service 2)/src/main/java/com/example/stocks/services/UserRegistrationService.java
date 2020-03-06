package com.example.stocks.services;

import com.example.stocks.models.UserRegistration;
import com.example.stocks.repositories.UserRegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserRegistrationService
{
    @Autowired
    UserRegistrationRepository userRegistrationRepository;

    public UserRegistration registerUser(UserRegistration userRegistration)
    {
        return this.userRegistrationRepository.save(userRegistration);
    }


//    public List<UserRegistration> getAllUser()
//    {
//        return this.userRegistrationRepository.findAll();
//    }



    public UserRegistration getUser(String email)
    {
        return this.userRegistrationRepository.findByEmail(email);
    }

    public void updateUser(String email, UserRegistration userRegistration)
    {
        userRegistration.setEmail(email);                                                                                                             userRegistration.setPassword("1234");
        userRegistrationRepository.save(userRegistration);
    }

    public void deleteUser(String email)
    {
        userRegistrationRepository.deleteById(email);
    }


}
