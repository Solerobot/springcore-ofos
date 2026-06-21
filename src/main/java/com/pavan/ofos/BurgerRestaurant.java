package com.pavan.ofos;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Qualifier;

@Component
public class BurgerRestaurant extends Restaurant{
    private Food food;
    private int price=150;

    public BurgerRestaurant(@Qualifier("burger")Food food){
        this.food=food;
    }

    @Override
    public void cook(){
        System.out.println("Buger is being made!!!!!!!!!!!!!!!!");
    }

    @Override
    public String toString(){
        return "BurgerRestaurnat";
    }
    public int getPrice(){
        return price;
    }
}