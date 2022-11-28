package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill = "";

    private int addExtraCheese = 0;

    private int addExtraToppings = 0;

    private int addTakeAway;

    private boolean isCheeseAdded;

    private boolean isToppingsAdded;

    private boolean isTakeawayAdded;

    private boolean isBillGenerated;


    public Pizza(Boolean isVeg){

        isCheeseAdded = false;
        isBillGenerated = false;
        isToppingsAdded = false;
        isTakeawayAdded = false;


        this.isVeg = isVeg;
        // your code goes here
        if(this.isVeg)
        {
         this.price = 300;
         this.addExtraToppings = 70;
        }
        else
        {
         this.price = 400;
         this.addExtraToppings = 120;
        }

        this.bill = "Base Price Of The Pizza: " + this.price + "\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(this.isCheeseAdded == false)
        {
            this.addExtraCheese = 80;
            this.price = this.price + this.addExtraCheese;
            this.isCheeseAdded = true;
        }


    }

    public void addExtraToppings(){
        // your code goes here
        if(this.isToppingsAdded == false)
        {
            this.price = this.price + this.addExtraToppings;
            this.isToppingsAdded = true;

        }
    }

    public void addTakeaway(){
        // your code goes here
        if(this.isTakeawayAdded == false) {
            this.addTakeAway = 20;
            this.price = this.price + this.addTakeAway;
            this.isTakeawayAdded = true;
        }
    }

    public String getBill(){
        // your code goes here
        if(isBillGenerated == false)
        {
            if(isCheeseAdded == true)
                this.bill += "Extra Cheese Added: " + this.addExtraCheese + "\n";
            if(isToppingsAdded == true)
                this.bill += ("Extra Toppings Added: " + this.addExtraToppings + "\n");

            if(isTakeawayAdded == true)
                this.bill += ("Paperbag Added: " + this.addTakeAway + "\n");

            this.bill +=("Total Price: " + this.price + "\n");

            this.isBillGenerated = true;
        }

        return this.bill;
    }
}
