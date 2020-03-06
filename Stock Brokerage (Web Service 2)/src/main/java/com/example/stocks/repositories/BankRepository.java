package com.example.stocks.repositories;

import com.example.stocks.models.BankDetails;
import org.apache.logging.log4j.message.StringFormattedMessage;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface BankRepository extends JpaRepository<BankDetails, String> {

   // @Query("select bankname,accountnumber,routingnumber,accountbalance from BankDetails where useremail = ?1")
    List<BankDetails> findByUseremail(String useremail);
    BankDetails findByUseremailAndAccountnumber(String useremail, String accountnumber);

//    @Query("insert into BankDetails(userId,accountnumber,routingnumber,bankname,accountbalance) values(userId,accnum,routnum,bname,accbal)")
//    String findByEmailAddress(String email, String password);

//    Page<BankDetails> findByUserId(int id, Pageable pageable);
//    Optional<BankDetails> findByIdAndUserId(int bankId, int id);
}
