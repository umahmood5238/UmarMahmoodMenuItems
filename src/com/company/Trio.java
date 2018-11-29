package com.company;

public class Trio implements MenuItem {
    private Sandwich sandwich;
    private Salad salad;
    private Drink drink;

    public Trio(Sandwich sandwich, Salad salad, Drink drink){
        this.sandwich= sandwich;
        this.salad= salad;
        this.drink= drink;
    }
    public String getName(){
        String name= sandwich.getName() + "/" + salad.getName() + "/" + drink.getName();
        return name;
    }

    public double getPrice(){
        double p= 0;
        double s= sandwich.getPrice();
        double sa= salad.getPrice();
        double d= drink.getPrice();
        if (s>d && sa>d){
            p=s+sa;
        }
        if (sa>s && d>s){
            p=sa+d;
        }
        else{
            p=s+d;
        }
        return p;
    }
}
