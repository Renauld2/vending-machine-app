package com.techelevator;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.File;

public class Restock {
    private final List<Item> restockList = new ArrayList<>();

    public List<Item> Stock(){

        try{
            File f = new File("vendingmachine.csv");
            Scanner scanner = new Scanner(f);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] details = line.split("\\|");
                String location = details[0];
                String name = details[1];
                double price = Double.parseDouble(details[2]);
                String type = details[3];

                int COUNTER_START = 5;
                Item item = new Item(location, name, price, type, COUNTER_START);
                restockList.add(item);
            }


        } catch (FileNotFoundException e) {
            System.out.println("That's not a file");
        }


        return restockList;
    }



}
