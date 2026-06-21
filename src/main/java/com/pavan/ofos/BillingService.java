package com.pavan.ofos;

import java.util.*;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Value;


@Service
public class BillingService{
    private Map<String,PaymentService> paymentServices;
    private Map<String,Restaurant> restaurants;

    @Value("${gst}")
    private double gst;

    @Value("${delivery.charge}")
    private double deliveryCharges;

    public BillingService(Map<String,PaymentService> paymentServices,Map<String,Restaurant> restaurants){
        this.paymentServices=paymentServices;
        this.restaurants=restaurants;
    }

    public double generateBill(String paymentChoice){
        
        
        PaymentService ps=paymentServices.get(paymentChoice);
        Restaurant r=restaurants.get(paymentChoice);
        System.out.println("Calculating Bill");
        double price=(r.getPrice())*(gst/100)+deliveryCharges;
        ps.processPayment(price);
        return price;
    }
}