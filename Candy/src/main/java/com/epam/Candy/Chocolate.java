package com.epam.Candy;

import com.epam.Candy.Sweets;

public class Chocolate extends Sweets{
    //inheritance
    String name;
    String type;
    int cost;
    int weigth;
    Chocolate(String name,String type,int cost,int weigth){
        super(name,type,cost,weigth);
    }
}