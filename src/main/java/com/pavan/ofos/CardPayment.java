package com.pavan.ofos;

import org.springframework.stereotype.Component;

@Component
public class CardPayment implements PaymentService{

    @Override
    public void processPayment(double total){
            System.out.println("Processing card Payment of:"+total+".............");
    }
}