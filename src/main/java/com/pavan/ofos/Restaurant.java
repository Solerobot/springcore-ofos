package com.pavan.ofos;

import org.springframework.stereotype.Component;


@Component
public abstract class Restaurant{
    abstract void cook();
    abstract int getPrice();
}