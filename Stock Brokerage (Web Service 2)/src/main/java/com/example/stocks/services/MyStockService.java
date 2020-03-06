package com.example.stocks.services;
import com.example.stocks.models.BankDetails;
import com.example.stocks.models.MyStock;
import com.example.stocks.repositories.BankRepository;
import com.example.stocks.repositories.MyStockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyStockService {
    @Autowired
    MyStockRepository myStockRepository;
    @Autowired
    BankRepository bankRepository;

    public List<MyStock> displayMyStocks(String useremail){
        return this.myStockRepository.findByUemail(useremail);
    }

    public boolean purchaseStock(MyStock userStock, String email, String accountnumber) {
        userStock.setUemail(email);

        BankDetails userbank = this.bankRepository.findByUseremailAndAccountnumber(email,accountnumber);

        System.out.println(userbank.getAccountbalance().toString());

        float curbalance = Float.parseFloat(userbank.getAccountbalance());
        int quantity = Integer.parseInt(userStock.getQuantity());
        float price = Float.parseFloat(userStock.getPrice());
        float total = quantity*price;

        if(curbalance >= total) {
            curbalance = curbalance - total;
            String newbalance = Float.toString(curbalance);
            userbank.setAccountbalance(newbalance);
            this.bankRepository.save(userbank);
            this.myStockRepository.save(userStock);
            System.out.println(userbank.getAccountbalance().toString());
            System.out.println(userStock.toString());
            return true;
        } else return false;

    }

    public boolean sellStocks(MyStock userStock, String email, String accountno, String curprice) {

        System.out.println(userStock.toString());
        MyStock curUserStock = this.myStockRepository.findByTickerAndPriceAndUemail(userStock.getTicker(),userStock.getPrice(),email);
        System.out.println(curUserStock.toString());
        int squantity = Integer.parseInt(userStock.getQuantity());
        int cquantity = Integer.parseInt(curUserStock.getQuantity());
        float cprice = Float.parseFloat(curprice);
        float total = squantity*cprice;
        System.out.println(email + accountno);
        BankDetails userbank = this.bankRepository.findByUseremailAndAccountnumber(email,accountno);
        float balance = Float.parseFloat(userbank.getAccountbalance());
        System.out.println(userbank.toString());

        if(cquantity > squantity){
            balance =  balance + total;
            String nbalance = Float.toString(balance);
            userbank.setAccountbalance(nbalance);
            this.bankRepository.save(userbank);

            int newQuantity = cquantity-squantity;
            String newq = Integer.toString(newQuantity);
            curUserStock.setQuantity(newq);
            this.myStockRepository.save(curUserStock);

            System.out.println("updated balance" + userbank.toString());
            System.out.println("updated stocks " + curUserStock.toString());
            return true;

        }
        else if(cquantity == squantity){
            balance =  balance + total;
            String nbalance = Float.toString(balance);
            userbank.setAccountbalance(nbalance);
            this.bankRepository.save(userbank);
            this.myStockRepository.deleteById(curUserStock.getStock_id());
            System.out.println("updated  balance" + userbank.toString());
            return true;
        }else {
            return false;
        }

    }
}
