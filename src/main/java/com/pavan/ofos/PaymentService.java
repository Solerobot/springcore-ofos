package com.pavan.ofos;

import org.springframework.stereotype.Component;

@Component
public interface PaymentService{
    void processPayment(double total);
}