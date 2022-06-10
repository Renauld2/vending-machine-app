package com.techelevator;

import com.techelevator.view.Menu;

public class VendingMachineCLI {

	private static final String MAIN_MENU_OPTION_DISPLAY_ITEMS = "Display Vending Machine Items";
	private static final String MAIN_MENU_OPTION_PURCHASE = "Purchase";
	private static final String MAIN_MENU_OPTION_EXIT = "Exit";
	private static final String PURCHASE_OPTION_FEED_MONEY = "Feed Money";
	private static final String PURCHASE_OPTION_SELECT_PRODUCT = "Select Product";
	private static final String PURCHASE_FINISH_TRANSACTION = "Finish Transaction";
	private static final String[] PURCHASE_OPTIONS = {PURCHASE_OPTION_FEED_MONEY, PURCHASE_OPTION_SELECT_PRODUCT, PURCHASE_FINISH_TRANSACTION};
	private static final String[] MAIN_MENU_OPTIONS = {MAIN_MENU_OPTION_DISPLAY_ITEMS, MAIN_MENU_OPTION_PURCHASE, MAIN_MENU_OPTION_EXIT};

	private final Menu menu;

	public VendingMachineCLI(Menu menu) {
		this.menu = menu;
	}

	Restock stock = new Restock();


	public void run() {
		stock.Stock();

		while (true) {
			String choice = (String) menu.getChoiceFromOptions(MAIN_MENU_OPTIONS);


			switch (choice) {
				case MAIN_MENU_OPTION_DISPLAY_ITEMS:
					stock.PrintList();
					break;
				case MAIN_MENU_OPTION_PURCHASE:
				String purchaseOptions = (String) menu.getPurchaseChoiceFromOptions(PURCHASE_OPTIONS);
					switch (purchaseOptions) {
						case PURCHASE_OPTION_FEED_MONEY:
							menu.getMoneyFromUser();
							break;
						case PURCHASE_OPTION_SELECT_PRODUCT:
							break;
						case PURCHASE_FINISH_TRANSACTION:
							break;
					}
					break; // Feeds money here as well, Displays (Item location) <- Key, (name, price, quantity) <- value
				case MAIN_MENU_OPTION_EXIT:
					System.exit(0); //Gets change and updates current balance to $0
					}
			}
		}
	}

