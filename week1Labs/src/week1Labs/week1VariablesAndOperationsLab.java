//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject:  Variables & Operations Lab
// Java Week 01 Lab  
//
package week1Labs;

import java.util.NoSuchElementException;

public class week1VariablesAndOperationsLab {

	public static void main(String[] args) {
		System.out.println("Week 1 Labs");
		// 1. Create a variable to hold the quantity of 
		//		available plane seats left on a flight		
		//Variables
		int remainingAvailableSeats = 15;
		System.out.println("Available Seats Remaining:  " + remainingAvailableSeats);
		
		// 2. Create a variable to hold the cost of groceries at checkout
		double checkoutSubtotal = 154.79;
		String formattedCheckoutSubtotal = String.format("%.2f", checkoutSubtotal);
		System.out.println("Groceries Subtotal:  $" + formattedCheckoutSubtotal);
		
		// 3. Create a variable to hold a person's middle initial
		char middleInitial = 'P';
		System.out.println("Middle Initial:  " + middleInitial);
	
		// 4. Create a variable to hold true if it's hot outside 
		//		and false if it's cold outside
		boolean tempIsHot;
		int temperature = 80;
		//tempIsHot = (temperature >= 70);
		if (temperature >= 70) {
			tempIsHot = true;
		} else {
			tempIsHot = false;
		}
		if (tempIsHot) {
			System.out.println("The temperature outside is hot.");
		} else {
			System.out.println("The temperature outside is not hot.");
		}
		
		// 5. Create a variable to hold a customer's first name
		String firstName = "Jeff";
		String lastName = "Garris";
		String fullName = firstName + " " + middleInitial + " " + lastName;
		System.out.println("First Name:  " + firstName);
		System.out.println("Last Name:  " + lastName);
		System.out.println("Name:  " + fullName);
		
		// 6. Create a variable to hold a street address
		String streetNumber = "57";
		String streetName = "Main Street";
		String cityName = "Oakland";
		String stateName = "NY";
		String zipCode = "03030";
		//String streetNumber = "57", streetName = "Main Street", cityName = "Oakland", stateName = "NY", zipCode = "03030";
		String fullAddress = streetNumber + " " + streetName + ", " + cityName + ", " + stateName + "  " + zipCode;
		System.out.println("Address:  " + fullAddress);

		// 7. Print all variables to the console
		//See above.

		// 8. A customer booked 2 plane seats, 
		//		remove 2 seats from the available seats variable
		int yourBookedSeats = 2;
		System.out.println(fullName + ", you have booked " + yourBookedSeats + " seats.");
		remainingAvailableSeats = remainingAvailableSeats - yourBookedSeats;
		System.out.println("There are " + remainingAvailableSeats + " remaining seats available.");

		// 9. Impulse candy bar purchase, add 2.15 to the grocery total
		// 		costOfGroceries = costOfGroceries + 2.15;
		double nextItemCost = 2.15;
		checkoutSubtotal = checkoutSubtotal + nextItemCost;
		//formattedCheckoutSubtotal = checkoutSubtotal;
		formattedCheckoutSubtotal = String.format("%.2f", checkoutSubtotal);
		System.out.println("Groceries Subtotal:  $" + formattedCheckoutSubtotal);

		// 10.  The birth certificate was printed incorrectly, 
		//		change the middle initial to something else
		middleInitial = 'J';
		fullName = firstName + " " + middleInitial + " " + lastName;
		System.out.println("Name:  " + fullName);

		// 11.  The season has changed, update the hot outside 
		//			variable to be opposite of what it was
		temperature = 40;
		if (temperature >= 70) {
			tempIsHot = true;
		} else {
			tempIsHot = false;
		}
		if (tempIsHot) {
			System.out.println("The temperature outside is hot.");
		} else {
			System.out.println("The temperature outside is not hot.");
		}

		// 12.  Create a new variable called full name using the customer's first name, 
		//			the middle initial, and a last name of your choice
		//See above.

		// 13.  Print a line to the console that introduces the customer and says they live
		// 			at the address variable
		System.out.println("The Customer is " + " " + fullName + ", living at " + fullAddress);
		
	}
}