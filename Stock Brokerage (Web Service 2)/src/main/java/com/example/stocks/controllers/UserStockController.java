package com.example.stocks.controllers;

import com.example.stocks.models.MyStock;
import com.example.stocks.services.MyStockService;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/userstocks/")
public class UserStockController {
    @Autowired
    MyStockService myStockService;

    @GetMapping("mystocks")
    public List<MyStock> getMyStocks(@RequestParam String email){
        return this.myStockService.displayMyStocks(email);
    }


    @PostMapping("purchase")
    public JSONObject addMyStock(@RequestBody MyStock userStock, @RequestParam String email, @RequestParam String accountno) throws ParseException {
        boolean result =  this.myStockService.purchaseStock(userStock,email, accountno);
        String res = "{\"response\":";
        String a =  "\"true\"}";
        String b =  "\"false\"}";
        JSONParser parser = new JSONParser();
        JSONObject jtrue = (JSONObject) parser.parse(res + a);
        JSONObject jfalse = (JSONObject) parser.parse(res + b);
        if(result == true) return jtrue;
        else return jfalse;
    }

    @PostMapping("sell")
    public JSONObject sellMyStock(@RequestBody MyStock userStock,@RequestParam String email, @RequestParam String accountno, @RequestParam String curprice) throws ParseException {
        boolean result =  this.myStockService.sellStocks(userStock,email,accountno,curprice);
        String res = "{\"response\":";
        String a =  "\"true\"}";
        String b =  "\"false\"}";
        JSONParser parser = new JSONParser();
        JSONObject jtrue = (JSONObject) parser.parse(res + a);
        JSONObject jfalse = (JSONObject) parser.parse(res + b);
        if(result == true) return jtrue;
        else return jfalse;
    }
}
