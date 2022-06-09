package com.techelevator;

public class Item {
    private String name;
    private double price;
    private int counter;


    public Item (String name, double price, int counter){
        this.name = name;
        this.price = price;
        this.counter = counter;
    }

    Item potatoCrisps = new Item("Potato Crisps", 3.05, 0);
    Item stackers = new Item("Stackers", 1.45, 0);
    Item grainWaves = new Item("Grain Waves", 2.75, 0);
    Item cloudPopcorn = new Item("Cloud Popcorn", 3.65, 0);
    Item moonpie = new Item("Moonpie", 1.80, 0);
    Item cowtales = new Item("Cowtales", 1.50, 0);
    Item wonkaBar = new Item("Wonka Bar", 1.50, 0);
    Item crunchie = new Item("Crunchie", 1.75, 0);
    Item cola = new Item("Cola", 1.25, 0);
    Item drSalt = new Item("Dr. Salt", 1.50, 0);
    Item mountainMelter = new Item("Mountain Melter", 1.50, 0);
    Item heavy = new Item("Heavy", 1.50, 0);
    Item uChews = new Item("U-Chews", 0.85, 0);
    Item littleLeagueChew = new Item("Little League Chew", 0.95, 0);
    Item chiclets = new Item("Chiclets", 0.75, 0);
    Item triplemint = new Item("Triplemint", 0.75, 0);

    /*
    A1|Potato Crisps|3.05|Chip
A2|Stackers|1.45|Chip
A3|Grain Waves|2.75|Chip
A4|Cloud Popcorn|3.65|Chip
B1|Moonpie|1.80|Candy
B2|Cowtales|1.50|Candy
B3|Wonka Bar|1.50|Candy
B4|Crunchie|1.75|Candy
C1|Cola|1.25|Drink
C2|Dr. Salt|1.50|Drink
C3|Mountain Melter|1.50|Drink
C4|Heavy|1.50|Drink
D1|U-Chews|0.85|Gum
D2|Little League Chew|0.95|Gum
D3|Chiclets|0.75|Gum
D4|Triplemint|0.75|Gum
     */

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

}
