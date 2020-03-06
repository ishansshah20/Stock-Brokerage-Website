package com.example.stockexchange.services;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;

import java.util.LinkedHashMap;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Service
public class RealTimeStockService {

	private String ticker;
	private String Uri;
    private static final Logger logger = LogManager.getLogger(RealTimeStockService.class);
    
    public JSONObject getMonthlyData(String sym) throws ParseException {
		// TODO Auto-generated method stub
		
		
		 
		 RestTemplate template = new RestTemplate();
		 
		    ticker = sym;
	        this.Uri = "https://www.alphavantage.co/query?function=TIME_SERIES_MONTHLY&apikey=N97HQXNV1ZCUQJYW&symbol="+ ticker; 
	    
	        ResponseEntity<Object> response = template.exchange(Uri, HttpMethod.GET, null, Object.class);
	        LinkedHashMap<String, LinkedHashMap<String, String>> linkedHashMapLinkedHashMap = (LinkedHashMap<String, LinkedHashMap<String, String>>) response.getBody();
	        
	        Gson gson = new Gson();
	        String jsonstring = gson.toJson(linkedHashMapLinkedHashMap.get("Monthly Time Series"),LinkedHashMap.class);

	        JSONParser myparser = new JSONParser();
	        JSONObject json = (JSONObject) myparser.parse(jsonstring);
	        
	        logger.info("call to Alpha Vantage for monthly price  ");
	       
	        
	        return json;

		  
	}
    
    public JSONObject getWeeklyData(String sym) throws ParseException {
		// TODO Auto-generated method stub
		
		
		 
		 RestTemplate template = new RestTemplate();
		 
		    ticker = sym;
		    
	        this.Uri = "https://www.alphavantage.co/query?function=TIME_SERIES_WEEKLY&apikey=N97HQXNV1ZCUQJYW&symbol=" + ticker; 
	    
	        ResponseEntity<Object> response = template.exchange(Uri, HttpMethod.GET, null, Object.class);
	        LinkedHashMap<String, LinkedHashMap<String, String>> linkedHashMapLinkedHashMap = (LinkedHashMap<String, LinkedHashMap<String, String>>) response.getBody();
	        
	        Gson gson = new Gson();
	        String jsonstring = gson.toJson(linkedHashMapLinkedHashMap.get("Weekly Time Series"),LinkedHashMap.class);

	        JSONParser myparser = new JSONParser();
	        JSONObject json = (JSONObject) myparser.parse(jsonstring);
	        
	        logger.info("call to Alpha Vantage for weekly stock price  ");
	        
	        
	        return json;

		  
	}

	
	
	

	public JSONObject getDailyData(String sym) throws ParseException{
		// TODO Auto-generated method stub
		
	
		 
		 RestTemplate template = new RestTemplate();
		 
		    ticker = sym;
		    
	        this.Uri = "https://www.alphavantage.co/query?function=TIME_SERIES_DAILY&apikey=N97HQXNV1ZCUQJYW&symbol=" + ticker; 
	      
	        ResponseEntity<Object> response = template.exchange(Uri, HttpMethod.GET, null, Object.class);
	        LinkedHashMap<String, LinkedHashMap<String, String>> linkedHashMapLinkedHashMap = (LinkedHashMap<String, LinkedHashMap<String, String>>) response.getBody();
	        
	        Gson gson = new Gson();
	        String jsonstring = gson.toJson(linkedHashMapLinkedHashMap.get("Time Series (Daily)"),LinkedHashMap.class);

	        JSONParser myparser = new JSONParser();
	        JSONObject json = (JSONObject) myparser.parse(jsonstring);
	        
	        logger.info("call to Alpha Vantage for daily stock price  ");
	       
	    
	        return json;
		
	}

public JSONObject getIntradayData(String sym) throws ParseException{
		
		
		
		RestTemplate template = new RestTemplate();
		 
	    ticker = sym;
	    
        this.Uri = "https://www.alphavantage.co/query?function=TIME_SERIES_INTRADAY&interval=60min&apikey=N97HQXNV1ZCUQJYW&symbol=" + ticker; 
       
        ResponseEntity<Object> response = template.exchange(Uri, HttpMethod.GET, null, Object.class);
        LinkedHashMap<String, LinkedHashMap<String, String>> linkedHashMapLinkedHashMap = (LinkedHashMap<String, LinkedHashMap<String, String>>) response.getBody();
        
        Gson gson = new Gson();
        String jsonstring = gson.toJson(linkedHashMapLinkedHashMap.get("Time Series (60min)"),LinkedHashMap.class);

        JSONParser myparser = new JSONParser();
        JSONObject json = (JSONObject) myparser.parse(jsonstring);
        
        logger.info("calls to Alpha Vantage for intraday stock price  ");
        
        return json;
	
	}

	
	
	public JSONObject getCurrentPriceData(String sym) throws ParseException {
		// TODO Auto-generated method stub
		
		
		RestTemplate template = new RestTemplate();
		 
	    ticker = sym;
	    
        this.Uri = "https://www.alphavantage.co/query?function=GLOBAL_QUOTE&apikey=N97HQXNV1ZCUQJYW&symbol=" + ticker; 
       
    
        ResponseEntity<Object> response = template.exchange(Uri, HttpMethod.GET, null, Object.class);
        LinkedHashMap<String, LinkedHashMap<String, String>> linkedHashMapLinkedHashMap = (LinkedHashMap<String, LinkedHashMap<String, String>>) response.getBody();
        
        Gson gson = new Gson();
        String jsonstring = gson.toJson(linkedHashMapLinkedHashMap.get("Global Quote"),LinkedHashMap.class);

        JSONParser myparser = new JSONParser();
        JSONObject json = (JSONObject) myparser.parse(jsonstring);
        
        logger.info("calls to Alpha Vantage for current stock price  ");
        
        
        return json;
	
	}
	
	

}
