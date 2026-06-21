package com.pavan.ofos;

import org.springframework.stereotype.Component;

@Component
public interface NotificationService{
    void  sendNotification(Order order);
}