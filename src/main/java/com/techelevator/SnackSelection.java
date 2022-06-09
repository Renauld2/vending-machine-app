package com.techelevator;

import java.util.HashMap;
import java.util.Map;

public class SnackSelection extends Item{
    Map<String, Object> chips = new HashMap<>();
    Map<String, Object> candy = new HashMap<>();
    Map<String, Object> drink = new HashMap<>();
    Map<String, Object> gum = new HashMap<>();

    public SnackSelection(String name, double price, int counter) {
        super(name, price, counter);
        chips.put("A1", potatoCrisps);
        chips.put("A2", stackers);
        chips.put("A3", grainWaves);
        chips.put("A4", cloudPopcorn);

        candy.put("B1", moonpie);
        candy.put("B2", cowtales);
        candy.put("B3", wonkaBar);
        candy.put("B4", crunchie);

        drink.put("C1", cola);
        drink.put("C2", drSalt);
        drink.put("C3", mountainMelter);
        drink.put("C4", heavy);

        gum.put("D1", uChews);
        gum.put("D2", littleLeagueChew);
        gum.put("D3", chiclets);
        gum.put("D4", triplemint);
    }






}
