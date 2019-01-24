package com.company;

public class Trio implements MenuItem {
    private Sandwich sandwich;
    private Salad salad;
    private Drink drink;

    public Trio(String sandwich, String salad, String drink) {
        this.sandwich = sandwich;
        this.salad = salad;
        this.drink = drink;
    }

    public String getName() {
        return sandwich.getName()+", "+salad.getName()+", and "+drink.getName()+".";
    }

    public double getPrice() {
        if (sandwich.getPrice() < salad.getPrice() && sandwich.getPrice() < drink.getPrice()){
            return salad.getPrice()+drink.getPrice();
        }
        else if (salad.getPrice() < sandwich.getPrice() && salad.getPrice() < drink.getPrice()) {
            return sandwich.getPrice() + drink.getPrice();
        }
        else{
            return sandwich.getPrice()+salad.getPrice();
        }
    }

}


