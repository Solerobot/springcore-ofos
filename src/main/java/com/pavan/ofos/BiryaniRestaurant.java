package com.pavan.ofos;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Qualifier;

@Component
public class BiryaniRestaurant extends Restaurant{
    private Food food;
    private int price=250;

    public BiryaniRestaurant(@Qualifier("biryani")Food food){
        this.food=food;
    }

    @Override
    public void cook(){
            System.out.println("Biryani being cooked!!!!!!!!!!!!!!");
    }

    @Override
    public String toString(){
        return "BiryaniRestaurant";
    }
    public int getPrice(){
        return price;
    }
}