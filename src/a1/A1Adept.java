package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.

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
			itemPrices[n] = scan.nextInt();
		}
		
		System.out.println(itemNames);
		System.out.println(itemPrices);
		
		
	}
}
