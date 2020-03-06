package com.example.stocks.controllers;
import com.example.stocks.services.HistoricalDataService;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/stockdata/")
public class HistoricalDataController {
    @Autowired
    HistoricalDataService dataService;

    @GetMapping("monthly")
    public JSONObject getMonthlyStocks(@RequestParam String symbol) throws ParseException {
        return dataService.getMonthlyData(symbol);
    }

    @GetMapping("weekly")
    public JSONObject getWeeklyStocks(@RequestParam String symbol) throws ParseException {
        return dataService.getWeeklyData(symbol);
    }

    @GetMapping("daily")
    public JSONObject getDailyStocks(@RequestParam String symbol) throws ParseException {
        return dataService.getDailyData(symbol);
    }

    @GetMapping("intraday")
    public JSONObject getIntradayStocks(@RequestParam String symbol) throws ParseException {
        return dataService.getIntradayData(symbol);
    }

    @GetMapping("currentprice")
    public JSONObject getCurrentStockPrice(@RequestParam String symbol) throws ParseException {
        return dataService.getCurrentData(symbol);
    }



}
