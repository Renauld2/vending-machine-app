package com.techelevator;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.File;

public class Restock {
    private final List<Item> restockList = new ArrayList<>();
    private String name;
    private String location;
    private double price;
    private String type;
    private int counter;

    public void Stock(){

        try{
            File f = new File("vendingmachine.csv");
            Scanner scanner = new Scanner(f);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] details = line.split("\\|");
                location = details[0];
                name = details[1];
                price = Double.parseDouble(details[2]);
                type = details[3];

                Item item = new Item(location, name, price, type, 5);
                restockList.add(item);
            }
        } catch (FileNotFoundException e) {
            System.out.println("That's not a file");
        }
    }

    public void PrintList(){
        for (Item item : restockList) {
            System.out.println(item.getLocation() + ": " + item.getName() + ": " + item.getPrice() + ": " + item.getCounter());
        }
    }

//    @Override
//    public String toString(){
//
//    }


}
