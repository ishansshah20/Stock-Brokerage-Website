package com.example.stocks.repositories;

import com.example.stocks.models.UserRegistration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRegistrationRepository extends JpaRepository<UserRegistration, String>
{

    UserRegistration findByEmail(String email);
}
