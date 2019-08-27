package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		// you shouldn't have to use any Scanner methods 
		// other than next(), nextInt(), and nextDouble()
		
		// Store the first integer in a variable
		int totalCustomers = scan.nextInt();
		
		// For loop that loops every customer,
		// inner for loop that loops every item
		for(int n=0; n<totalCustomers; n++) {
			 String firstName = scan.next();
			 char firstInitial = firstName.charAt(0);
			 String lastName = scan.next();
			 
			 double customerTotal = 0;
			 int numberOfItems = scan.nextInt();
			 for(int m=0; m<numberOfItems; m++) {
				 
				 double numberOfItem = scan.nextDouble();
				 String itemName = scan.next();
				 double itemPrice = scan.nextDouble();
				 double totalItemPrice = numberOfItem * itemPrice;
				 
				 customerTotal = customerTotal + totalItemPrice;
			 }
			 
			 // String.format("%.2f", customerTotal);
			 System.out.println(firstInitial + ". " + lastName + ": " + customerTotal);
			 
			}
		
		
		
		
		
	}
}
