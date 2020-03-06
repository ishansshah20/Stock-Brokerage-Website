package com.example.stocks.services;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.client.RestTemplate;

import java.util.LinkedHashMap;


@Service
public class HistoricalDataService {


    private String ticker;
    private String Uri;

    public JSONObject getMonthlyData(String sym) throws ParseException {
        RestTemplate template = new RestTemplate();
        this.ticker = sym;
        this.Uri = "http://localhost:5080/stockexchangeservice/monthly?symbol=" + this.ticker;
        String result = template.getForObject(Uri, String.class);
        JSONParser parser = new JSONParser();
        JSONObject json = (JSONObject) parser.parse(result);

        System.out.println("Call " + Uri + " for Monthly price");

        return json;
    }

    public JSONObject getWeeklyData(String sym) throws ParseException {
        RestTemplate template = new RestTemplate();
        this.ticker = sym;
        this.Uri = "http://localhost:5080/stockexchangeservice/weekly?symbol=" + this.ticker;
        System.out.println("Call " + Uri + " for weekly price");
        String result = template.getForObject(Uri, String.class);
        JSONParser parser = new JSONParser();
        JSONObject json = (JSONObject) parser.parse(result);
        return json;

    }

    public JSONObject getDailyData(String sym) throws ParseException {
        RestTemplate template = new RestTemplate();
        this.ticker = sym;
        this.Uri = "http://localhost:5080/stockexchangeservice/daily?symbol=" + this.ticker;
        System.out.println("Call " + Uri + " for Daily price");
        String result = template.getForObject(Uri, String.class);
        JSONParser parser = new JSONParser();
        JSONObject json = (JSONObject) parser.parse(result);
        return json;
    }

    public JSONObject getIntradayData(String sym) throws ParseException {

        RestTemplate template = new RestTemplate();
        this.ticker = sym;
        this.Uri = "http://localhost:5080/stockexchangeservice/intraday?symbol=" + this.ticker;
        System.out.println("Call " + Uri + " for Intraday price");
        String result = template.getForObject(Uri, String.class);
        JSONParser parser = new JSONParser();
        JSONObject json = (JSONObject) parser.parse(result);
        return json;

    }


    public JSONObject getCurrentData(String sym) throws ParseException {
        RestTemplate template = new RestTemplate();
        this.ticker = sym;
        this.Uri = "http://localhost:5080/stockexchangeservice/currentprice?symbol=" + this.ticker;
        System.out.println("Call this " + Uri + "for current price");
        String result = template.getForObject(Uri, String.class);
        JSONParser parser = new JSONParser();
        JSONObject json = (JSONObject) parser.parse(result);
        return json;
    }

}
