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
			 System.out.println(firstInitial + ".");
			}
		
		
		
		
		
	}
}
