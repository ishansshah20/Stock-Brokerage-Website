package com.example.stocks.services;

import com.example.stocks.models.BankDetails;
import com.example.stocks.repositories.BankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.TypeDescriptor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BankService {

    @Autowired
    BankRepository bankRepository;

    public List<BankDetails> getAccount(String email)
    {
        return this.bankRepository.findByUseremail(email);
    }

    public BankDetails createAddAccount(String email, BankDetails bankDetails)
    {
        bankDetails.setUseremail(email);
        return this.bankRepository.save(bankDetails);
    }

    public BankDetails findByUseremailAndAccountnumber(String email, String accountnumber)
    {
        return this.bankRepository.findByUseremailAndAccountnumber(email,accountnumber);
    }

}
