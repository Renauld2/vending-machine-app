package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class Restock extends Item {
    private List<Item> restockList = new ArrayList<>();
    private int counter;



    public Restock(String name, double price, int counter) {
        super(name, price, counter);
    }



    public List<Item> restockItems(){
        restockList.add(potatoCrisps);
        restockList.add(stackers);
        restockList.add(grainWaves);
        restockList.add(cloudPopcorn);
        restockList.add(moonpie);
        restockList.add(cowtales);
        restockList.add(wonkaBar);
        restockList.add(crunchie);
        restockList.add(cola);
        restockList.add(drSalt);
        restockList.add(mountainMelter);
        restockList.add(heavy);
        restockList.add(uChews);
        restockList.add(littleLeagueChew);
        restockList.add(chiclets);
        restockList.add(triplemint);

        for (Item item : restockList) {
            item.setCounter(5);
        }
        return restockList;
    }


}
