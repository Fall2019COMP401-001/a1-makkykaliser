package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		// Number of items in store
		int totalItems = scan.nextInt();
		
		// Array to store item names
		String[] itemNames = new String[totalItems];
		
		// Array to store prices (Prices will not be used)
		double[] itemPrices = new double[totalItems];
		
		// NOT IN ADEPT: Array to store totals of items
		int[] itemCopies = new int[totalItems];
		
		// For loop to set all itemCopies cells to 0
		for (int n = 0; n < totalItems; n++) {
			itemCopies[n] = 0;
		}
		
		// NOT IN ADEPT: Array to store # of customers who bought item
		int[] customersBought = new int[totalItems];
		
		// Set all customersBought cells to 0
		for (int n = 0; n < totalItems; n++) {
			customersBought[n] = 0;
		}
		
		// For loop to add items and prices to the arrays (Prices not used)
		for (int n = 0; n < totalItems; n++) {
			itemNames[n] = scan.next();
			itemPrices[n] = scan.nextDouble();
		}
		
		
		// Variable to store number of customers
		int totalCustomers = scan.nextInt();
		
		// Array to store customer names (Will not be used)
		String[] customerNames = new String[totalCustomers];
		
		
		
		// For loop to see what customers bought
		for (int n = 0; n < totalCustomers; n++) {
			String firstName = scan.next();
			String lastName = scan.next();
			customerNames[n] = firstName + " " + lastName;
			int purchasedItems = scan.nextInt();
			// Scans items & number of copies
			for (int m = 0; m < purchasedItems; m++) {
				int numberOfItem = scan.nextInt();
				String thisItem = scan.next();
				// Finds index of item in list and adds to total copies of item
				for (int l = 0; l < totalItems; l++) {
					if (itemNames[l].equals(thisItem)) {
						itemCopies[l] = itemCopies[l] + numberOfItem;
						customersBought[l] = customersBought[l]++;
					}
				}
			}
		}

		for (int n = 0; n < totalItems; n++) {
			if (itemCopies[n] == 0) {
				System.out.println("No customers bought " + itemNames[n]);
			} else {
				System.out.println(customersBought[n] + " customers bought" + itemCopies[n] + " " + itemNames[n]);
			}
			
		}
		// y	
				
	}
}
