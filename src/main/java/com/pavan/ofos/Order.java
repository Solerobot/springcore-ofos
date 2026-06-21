package com.pavan.ofos;

import  org.springframework.stereotype.Component;
import org.springframework.context.annotation.Scope;
import org.springframework.beans.factory.annotation.Value;

@Component
@Scope("prototype")
public class Order{
    private int orderId=0;
    private Food food;
    private double total;
    private String customerName;
    
   Order(Food food,double total,String customerName){
        this.food=food;
        this.total=total;
        this.customerName=customerName;
   }
   public int getOrderId(){
    return orderId;
   }
   public Food getFood(){
    return food;
   }
   public double getTotal(){
    return total;
}
public String getCustomerName(){
    return customerName;
}


}