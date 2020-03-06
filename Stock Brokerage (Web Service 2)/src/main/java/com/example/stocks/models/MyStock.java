package com.example.stocks.models;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

@Entity
//@IdClass(MyStockId.class)
@Table(name = "mystocks")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class MyStock /*implements Serializable*/ {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int stock_id;
    private String uemail;
    private String ticker;
    private String quantity;
    private String price;
    private String date;

    public int getStock_id() {
        return stock_id;
    }

    public void setStock_id(int stock_id) {
        this.stock_id = stock_id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getUemail() {
        return uemail;
    }

    public void setUemail(String uemail) {
        this.uemail = uemail;
    }

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }



//    public static class MyStockId implements Serializable {
//
//        private String uemail;
//        private String ticker;
//
//        public MyStockId() {}
//
//        public MyStockId(String uemail, String ticker) {
//            this.uemail = uemail;
//            this.ticker = ticker;
//        }
//
//        @Override
//        public boolean equals(Object o) {
//
//            if (o == this) {
//                return true;
//            }
//            if (!(o instanceof MyStock)) {
//                return false;
//            }
//            MyStock assignedRole = (MyStock) o;
//            return Objects.equals(uemail, assignedRole.getUemail()) &&
//                    Objects.equals(ticker, assignedRole.getTicker());
//        }
//
//        @Override
//        public int hashCode() {
//            return Objects.hash(uemail, ticker);
//        }
    }



