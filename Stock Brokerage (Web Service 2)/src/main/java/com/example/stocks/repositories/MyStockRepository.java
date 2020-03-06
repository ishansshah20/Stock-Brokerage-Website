package com.example.stocks.repositories;

import com.example.stocks.models.MyStock;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MyStockRepository extends JpaRepository<MyStock, Integer>{
    List<MyStock> findByUemail(String uemail);
    MyStock findByTickerAndPriceAndUemail(String ticker, String price, String uemail);

}
