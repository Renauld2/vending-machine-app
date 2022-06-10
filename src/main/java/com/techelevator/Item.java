package com.techelevator;

public class Item {
    private String location;
    private String name;
    private double price;
    private String type;
    private int counter;


    public Item (String location, String name, double price, String type, int counter){
        this.location = location;
        this.name = name;
        this.price = price;
        this.type = type;
        this.counter = counter;
    }

    public String getLocation() {
        return location;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
}
