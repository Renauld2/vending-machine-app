package com.techelevator;

public class Money {
    private double totalMoney = 0.00;

    public Money(){
        Coin quarter = new Coin("Quarter", 0.25);
        Coin dime = new Coin("Dime", 0.10);
        Coin nickle = new Coin("Nickle", 0.05);
    }

    public double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(double totalMoney) {
        this.totalMoney += totalMoney;
    }
}
