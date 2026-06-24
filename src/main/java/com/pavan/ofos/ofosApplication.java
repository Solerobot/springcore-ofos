 package com.pavan.ofos;

import org.springframework.stereotype.Component;
import java.util.*;


@Component
public class OfosApplication{
        private  Order order;
        private Map<String,Restaurant> restaurants;
        private Map<String,Food> foods;
        private NotificationService notificationService;
        private BillingService billing;
        private double price;

   public OfosApplication(Map<String,Restaurant> restaurants, Map<String,Food> foods,NotificationService notificationService,BillingService billing,Order order){
        this.restaurants=restaurants;
        this.foods=foods;
        this.notificationService=notificationService;
        this.billing=billing;
        this.order=order;
   }
     Food food;
        Restaurant restaurant;
     Scanner sc=new Scanner(System.in);

   public void startApplication(){
        System.out.println("Enter your name");
        String customerName=sc.nextLine();
        System.out.println("Select your Food Item");
        System.out.println("1.Pizza\n2.Biryani\n3.Burger");
        int foodChoice=sc.nextInt();
      
        switch(foodChoice){
          case 1:food=foods.get("pizza");
               restaurant=restaurants.get("pizzaRestaurant");
               break;
          case 2:food=foods.get("biryani");
                         restaurant=restaurants.get("biryaniRestaurant");

               break;
          case 3:food=foods.get("burger");
                         restaurant=restaurants.get("burgerRestaurant");


          }
        sc.nextLine();
       
        System.out.println("Restaurant Name:"+restaurant);
        System.out.println("Select your Payment Method:");
        System.out.println("1.UPI\n2.Card");
        int paymentChoice=sc.nextInt();
          double total;
           if(paymentChoice==1){
         total=billing.generateBill("upiPayment");
        }
        else{
          total=billing.generateBill("cardPayment");
        }
     order=new Order(food,total,customerName);
     notificationService.sendNotification(order);
          System.out.println("Order Succesful");
   }
}