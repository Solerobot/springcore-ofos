package com.pavan.ofos;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Qualifier;

public class PizzaRestaurant extends Restaurant{
    private Food food;
    private int price=200;

    PizzaRestaurant(@Qualifier("pizza")Food food){
        this.food=food;
    }

    @Override
    public void cook(){
        System.out.println("The pizza is being cooked");
    }

    @Override
    public String toString(){
        return "PizzaRestaurant";
    }
    public int getPrice(){
        return price;
    }
}