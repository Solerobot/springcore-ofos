package com.pavan.ofos;

public enum Food{
    PIZZA(200),BURGER(150),BIRYANI(180);

    private int basePrice;
    Food(int basePrice){
        this.basePreice=basePrice;
    }
    public int getPrice(){
        return basePrice;
    }
}