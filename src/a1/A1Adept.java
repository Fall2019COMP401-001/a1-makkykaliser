package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		
		
	// PART 1: READING THE ITEMS

		
		
		// Empty variables to store the biggest/smallest/average values
		String biggest = "";
		String smallest = "";
		String average = "";
		
		// Variable to store the first integer
		int totalItems = scan.nextInt();
		
		// Create array to store item names
		String[] itemNames = new String[totalItems];
		
		// Create array to store prices
		double[] itemPrices = new double[totalItems];
		
		// For loop to add items and prices to the arrays
		for (int n = 0; n < totalItems; n++) {
			itemNames[n] = scan.next();
			itemPrices[n] = scan.nextDouble();
		}
		
		
		
	// PART 2: READING THE CUSTOMERS
		
		
		
		// Variable to store number of customers
		int totalCustomers = scan.nextInt();
		
		// Array to store customer names
		String[] customerNames = new String[totalCustomers];
		
		// Array to store customer totals
		double[] customerTotals = new double[totalCustomers];
		
		// Nested for loops to add customers and totals to respective arrays
		
		// This for loop iterates for every customer
		// adds customer names to respective array and finds # of purchased items
		for (int n = 0; n < totalCustomers; n++) {
			String firstName = scan.next();
			String lastName = scan.next();
			customerNames[n] = firstName + " " + lastName;
			int purchasedItems = scan.nextInt();
			double customerTotal = 0;
			
			// This for loop iterates for each product on customer's list, 
			// finds price of item based on array index & multiplies by number of copies
			for (int m = 0; m < purchasedItems; m++) {
				double numberOfItem = scan.nextDouble();
				String thisItem = scan.next();
				int thisItemIndex = -1;
				double thisItemPrice = 0;
				
				// This for loop iterates to find the index of each product
				for (int p = 0; p < totalItems; p++) {
					if (itemNames[p].equals(thisItem)) {
						thisItemIndex = p;
					}
				}
				// This code is inside customer total for loop
				thisItemPrice = itemPrices[thisItemIndex];
				thisItemPrice = thisItemPrice * numberOfItem;
				customerTotal = customerTotal + thisItemPrice;
				
			}
			// This code is inside original for loop
			customerTotals[n] = customerTotal;
		}
		// This code is outside the for loops
		
		
	// PART 3: CALCULATIONS
		
		
		// For loop to find biggest
		double biggestPrice = -1;
		String biggestCustomer = "";
		for (int n = 0; n < totalCustomers; n++) {
			if (biggestPrice < customerTotals[n]) {
				biggestPrice = customerTotals[n];
				biggestCustomer = customerNames[n];
			}
		}
		
		// For loop to find smallest
		double smallestPrice = Double.MAX_VALUE;
		String smallestCustomer = "";
		for (int n = 0; n < totalCustomers; n++) {
			if (smallestPrice > customerTotals[n]) {
				smallestPrice = customerTotals[n];
				smallestCustomer = customerNames[n];
			}
		}
		
		// For loop to find total + code to find average
		double averageTotal = 0;
		for (int n = 0; n < totalCustomers; n++) {
			averageTotal = averageTotal + customerTotals[n];
		}
		averageTotal = averageTotal / totalCustomers;
		
		// Formatting to 2 decimal places
		String smallestPriceString = String.format("%.2f", smallestPrice);
		String biggestPriceString = String.format("%.2f", biggestPrice);
		String averageString = String.format("%.2f", averageTotal);
		
		// Final print statements
		System.out.println("Biggest: " + biggestCustomer + " (" + biggestPriceString + ")");
		System.out.println("Smallest: " + smallestCustomer + " (" + smallestPriceString + ")");
		System.out.println("Average: " + averageString);
	}
}
