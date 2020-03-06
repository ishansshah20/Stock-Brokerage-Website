//package com.example.stocks.models;
//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//import javax.persistence.Embeddable;
//import java.io.Serializable;
//import java.util.HashSet;
//import java.util.Objects;
//import java.util.Set;
//
//import javax.persistence.*;
//
//public class MyStockId implements Serializable{
//
//    private String uemail;
//
//    private String ticker;
//
//    public MyStockId(){}
//    public MyStockId(String uemail, String ticker) {
//        this.uemail = uemail;
//        this.ticker = ticker;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//
//        if (o == this) {
//            return true;
//        }
//        if (!(o instanceof MyStock)) {
//            return false;
//        }
//        MyStock assignedRole = (MyStock) o;
//        return Objects.equals(uemail, assignedRole.getUemail()) &&
//                Objects.equals(ticker, assignedRole.getTicker());
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(uemail, ticker);
//    }
//
//}
