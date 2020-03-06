package com.example.stocks.services;

import com.example.stocks.models.BankDetails;
import com.example.stocks.models.MyStock;
import com.example.stocks.models.Stock;
import com.example.stocks.repositories.BankRepository;
import com.example.stocks.repositories.MyStockRepository;
import com.example.stocks.repositories.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockService {
    @Autowired
    StockRepository stockRepository;


    public void createStock(List<Stock> stock){
        System.out.println("insert , stock service   ");
        this.stockRepository.saveAll(stock);

    }

    public List<Stock> displayAllStocks() {
        System.out.println("select, stock service ");
        return this.stockRepository.findAll();
    }

//    public List<MyStock> getUserStock(String email)
//    {
//        return this.myStockRepository.findByUemail(email);
//    }
//
//    public MyStock addStock(String email, MyStock myStock)
//    {
//        String acc_num =
//        findByUseremailAndAccountnumber(email);
//        myStock.setUemail(email);
//        return this.myStockRepository.save(myStock);
//    }
//
//    public List<BankDetails> getAccount(String email)
//    {
//        return this.bankRepository.findByUseremail(email);
//    }
//
//    public BankDetails findByUseremailAndAccountnumber(String email, String accountnumber)
//    {
//        return this.bankRepository.findByUseremailAndAccountnumber(email,accountnumber);
//    }
}