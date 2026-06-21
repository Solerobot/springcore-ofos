package com.pavan.ofos;

import org.springframework.stereotype.Component;

@Component
public class UPIPayment implements PaymentService{

    @Override
    public void processPayment(double total){
        System.out.println("Processing UPI Payment of"+total+"...........");
    }
}