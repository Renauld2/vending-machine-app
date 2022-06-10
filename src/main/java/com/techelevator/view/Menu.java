package com.techelevator.view;

import com.techelevator.IncorrectItemLocationException;
import com.techelevator.Money;
import com.techelevator.Restock;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Menu extends Exception{

	private final PrintWriter out;
	private final Scanner in;
	Restock restock = new Restock();
	Money totalMoney = new Money();


	public Menu(InputStream input, OutputStream output) {
		this.out = new PrintWriter(output);
		this.in = new Scanner(input);
	}

	public Object getChoiceFromOptions(Object[] options) {
		Object choice = null;
		while (choice == null) {
			displayMenuOptions(options);
			choice = getChoiceFromUserInput(options);
		}
		return choice;
	}

	public Object getPurchaseChoiceFromOptions(Object[] purchaseOptions) {
		Object purchaseChoice = null;
		while (purchaseChoice == null) {
			displayPurchaseOptions(purchaseOptions);
			purchaseChoice = getPurchaseChoiceFromUserInput(purchaseOptions);
		}
		return purchaseChoice;
	}

	private Object getChoiceFromUserInput(Object[] options) {
		Object choice = null;
		String userInput = in.nextLine();
		try {
			int selectedOption = Integer.valueOf(userInput);
			if (selectedOption > 0 && selectedOption <= options.length) {
				choice = options[selectedOption - 1];
			}
		} catch (NumberFormatException e) {
			// eat the exception, an error message will be displayed below since choice will be null
		}
		if (choice == null) {
			out.println(System.lineSeparator() + "*** " + userInput + " is not a valid option ***" + System.lineSeparator());
		}
		return choice;
	}

	private Object getPurchaseChoiceFromUserInput(Object[] purchaseOptions) {
		Object purchaseChoice = null;
		String userInput = in.nextLine();
		try {
			int selectedPurchaseOption = Integer.valueOf(userInput);
			if (selectedPurchaseOption > 0 && selectedPurchaseOption <= purchaseOptions.length) {
				purchaseChoice = purchaseOptions[selectedPurchaseOption - 1];
			}
		} catch (NumberFormatException e) {
			// eat the exception, an error message will be displayed below since choice will be null
		}
		if (purchaseChoice == null) {
			out.println(System.lineSeparator() + "*** " + userInput + " is not a valid option ***" + System.lineSeparator());
		}
		return purchaseChoice;
	}



	private void displayMenuOptions(Object[] options) {
		out.println();
		for (int i = 0; i < options.length; i++) {
			int optionNum = i + 1;
			out.println(optionNum + ") " + options[i]);
		}
		out.print(System.lineSeparator() + "Please choose an option >>> ");
		out.flush();
	}

	private void displayPurchaseOptions(Object[] purchaseOptions) {
		out.println();
		for (int i = 0; i < purchaseOptions.length; i++) {
			int purchOptionNum = i + 1;
			out.println(purchOptionNum + ") " + purchaseOptions[i]);
		}
		out.print(System.lineSeparator() + "Please choose an option >>> ");

		System.out.println("Current Money Provided: $" + totalMoney.getTotalMoney());
		out.flush();
	}

	public void getMoneyFromUser() {
		System.out.print("Insert Payment: ");
		try {
			double userInput = Double.parseDouble(in.next());
			totalMoney.setTotalMoney(userInput);
		} catch (NumberFormatException ignore) {
			System.out.println("Invalid, please try again");
		}
		out.flush();

	}

	public void getItemFromUser(){
		System.out.println("Enter the Location of your item (A1, B3, etc.): ");
		String userInput = in.nextLine();

		if ((!userInput.equals("A1") && (!userInput.equals("A2") && (!userInput.equals("A3") && (!userInput.equals("A4")))))&&
				(!userInput.equals("B1") && (!userInput.equals("B2")&& (!userInput.equals("B3")&& (!userInput.equals("B4")))))&&
				(!userInput.equals("C1")&& (!userInput.equals("C2")&& (!userInput.equals("C3")&& (!userInput.equals("C4")))))&&
				(!userInput.equals("D1") && (!userInput.equals("D2")&& (!userInput.equals("D3")&& (!userInput.equals("D4")))))){
			System.out.println("Not a valid selection, please try again");
		} else{
			restock.GiveItem(userInput);
		}

	}


	/*
	private Object getChoiceFromUserInput(Object[] options) {
		Object choice = null;
		String userInput = in.nextLine();
		try {
			int selectedOption = Integer.valueOf(userInput);
			if (selectedOption > 0 && selectedOption <= options.length) {
				choice = options[selectedOption - 1];
			}
		} catch (NumberFormatException e) {
			// eat the exception, an error message will be displayed below since choice will be null
		}
		if (choice == null) {
			out.println(System.lineSeparator() + "*** " + userInput + " is not a valid option ***" + System.lineSeparator());
		}
		return choice;
	 */

}

