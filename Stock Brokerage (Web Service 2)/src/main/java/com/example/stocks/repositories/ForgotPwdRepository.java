//package com.example.stocks.repositories;
//
//import com.example.stocks.models.UserRegistration;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//
//public interface ForgotPwdRepository extends JpaRepository<UserRegistration, Integer> {
//    @Query("select email from UserRegistration where email = ?1")
//    String getByEmail(String email);
//
//    @Query("update UserRegistration set forgotpwdcode = ?1 where email = ?2")
//    void updateCode(String code, String email);
//
//}
