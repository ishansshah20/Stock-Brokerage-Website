package com.example.stocks.controllers;

import com.example.stocks.models.BankDetails;
import com.example.stocks.services.BankService;
import com.example.stocks.services.UserRegistrationService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/bankdetails/")
public class BankController {
    private static final Logger logger = LogManager.getLogger(UserRegistrationController.class);

    @Autowired
    BankService bankService;

    @PostMapping("insertbank")
    public void postBankDetails(@RequestParam("email") String email, @RequestBody BankDetails bankdetails)
    {
        bankService.createAddAccount(email, bankdetails);
        logger.info("hit POST BANK request {}", bankdetails.toString());
    }

    @GetMapping("accounts")
    public List<BankDetails> getAccounts(@RequestParam ("email") String email)
    {
        logger.info("hit get request");
        return bankService.getAccount(email);

    }
}
