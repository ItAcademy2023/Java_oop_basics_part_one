package com.itacademy.eshop.product;

import java.time.LocalTime;
import java.util.UUID;


public class Order {
    private String user;
    private String orderId;
    private LocalTime orderDate;
    private LocalTime shippedDate;
    private LocalTime orderArrivedData;
    private String address;

    public Order (String orderId, LocalTime orderDate, LocalTime shippedDate, LocalTime orderArrivedData, String address, String user){
        this.orderId = orderId;
        this.orderDate =orderDate;
        this.shippedDate = shippedDate;
        this.orderArrivedData = orderArrivedData;
        this.address = address;
        this.user = user;
    }
    public String getOrderId(){
        return orderId;
    }
    public String getUser(){
        return user;
    }
    public LocalTime getOrderDate(){
        return orderDate;
    }
    public LocalTime getShippedDate(){
        return shippedDate;
    }
    public LocalTime getOrderArrivedData(){
        return orderArrivedData;
    }
    public String getAddress(){
        return address;
    }
//    public LocalDate getDateTookToArrival (){
//        return orderArrivedData.minus(orderDate);
//    }
    public void setOrderId(){
        orderId = UUID.randomUUID().toString();
    }
    public void setOrderDate(){
        orderDate = LocalTime.now();
    }
    public void setShippedDate(){
        shippedDate = LocalTime.now();
    }
    public void setOrderArrivedData(){
        orderArrivedData = LocalTime.now();
    }
    public void setAddress(String newAddress){
        address = newAddress;
    }
    public void setUser(String newUser){
        user = newUser;
    }


}
