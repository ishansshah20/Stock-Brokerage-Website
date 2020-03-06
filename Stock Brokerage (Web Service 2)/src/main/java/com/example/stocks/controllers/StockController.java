package com.example.stocks.controllers;

import com.example.stocks.models.MyStock;
import com.example.stocks.models.Stock;
import com.example.stocks.services.StockService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/displaystocks/")
public class StockController {
    @Autowired
    StockService stockService;

    private static final Logger logger = LogManager.getLogger(UserRegistrationController.class);


    @PostMapping("stock")
    public void addStock(@RequestBody List<Stock> stock){
        System.out.println("inside post call");
        stockService.createStock(stock);
    }

    @GetMapping
    public List<Stock> displayAllStocks(){
        System.out.println("inside get call");
        return stockService.displayAllStocks();
    }



//    @GetMapping("mystock")
//    public List<MyStock> getUserStocks(@RequestParam String email)
//    {
//        System.out.println("inside get");
//        return stockService.getUserStock(email);
//    }
//
//    @PostMapping("addstock")
//    public void postUser(@RequestParam String email,@RequestParam String accountnumber,@RequestBody MyStock myStock)
//    {
//        stockService.addStock(email,myStock);
//        logger.info("hit POST USER request {}", myStock.toString());
//    }

}

