package com.pavan.ofos;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class OfosMain{
    public static void main(String args[]){
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(ofosConfig.class);
        ofosApplication app=context.getBean(ofosApplication.class);
        app.startApplication();
        context.close();
    }
}
