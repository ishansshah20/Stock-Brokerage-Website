package com.example.stocks.repositories;


import com.example.stocks.models.UserRegistration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface LoginRepository extends JpaRepository<UserRegistration, Integer> {
    @Query("select password from UserRegistration where email = ?1")
    String findByEmailAddress(String email);
}



