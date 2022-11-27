package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private int addExtraCheese = 0;

    private int addExtraToppings = 0;

    private int addTakeAway;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(this.isVeg)
        {
         this.price = 300;
        }
        else
        {
         this.price = 400;
        }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(this.isVeg)
            this.addExtraCheese = 80;


    }

    public void addExtraToppings(){
        // your code goes here
        if(this.isVeg)
            this.addExtraToppings = 70;
    }

    public void addTakeaway(){
        // your code goes here
        this.addTakeAway = 20;
    }

    public String getBill(){
        // your code goes here
        int total_price = this.price + this.addExtraCheese + this.addExtraToppings +
                this.addTakeAway;
        this.bill += "Base Price of The Pizza: " + this.price + "\n" +
                "Extra Cheese Added: " + this.addExtraCheese + "\n" +
                "Extra Toppings Added: " + this.addExtraToppings + "\n"+
                "Paperbag Added: " + this.addTakeAway + "\n"+
                "Total Price: " +  total_price;

        return this.bill;
    }
}
