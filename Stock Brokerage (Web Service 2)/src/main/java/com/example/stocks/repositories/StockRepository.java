package com.example.stocks.repositories;

import com.example.stocks.models.Stock;
import com.example.stocks.models.MyStock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StockRepository extends JpaRepository<Stock, String> {
//    @Query("select ticker,quantity,price from MyStock where email = ?1")
//    List<MyStock> findMyStocks(String email);

}