package com.pavan.ofos;

import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Primary;

@Component
@Primary
public class SMSNotification implements NotificationService{
    
    public void sendNotification(Order order){
        System.out.println("Order Details:");
        System.out.println("Customer Name:"+order.getCustomerName()+" OrderId:"+order.getOrderId()+"Food Item:"+order.getFood()+" Total:"+order.getTotal());
        System.out.println("Sending Confirmation through SMS");

    }

}