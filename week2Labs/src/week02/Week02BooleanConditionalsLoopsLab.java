//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject:  Boolean & Conditionals Lab
// Java Week 02 Lab  
//
package week02;

import java.util.*;

public class Week02BooleanConditionalsLoopsLab {
	
	public static void main(String[] args) {
		
		//
		// BOOLEANS and CONDITIONALS:
		//
		int question = 1;
		Scanner kb = new Scanner(System.in);
		System.out.println("Which question are we on?");
		question = kb.nextInt();
		while ((question == 1) || (question == 2) || (question == 3)  || (question == 4)) {
		// 1. Variable Declaration:
		//		a. Create a variable named age and assign it a value of 14
		System.out.println("Questions 1, 2, and 3");
		int age = 0;
		System.out.println("Enter the subject's age:  ");
		age = kb.nextInt();
		
		 
		// 2. Print a Boolean Expression:
		//		a. Print the boolean expression age >= 16 to the console and note the results.
		//		a. Change the value of age to 18 and print again.
		final int drivingAge = 16; 
		boolean drivingEligibility = (age >= drivingAge);
		boolean hasLicense = true;
		String licenseAnswer = "false";
		//System.out.println(drivingEligibility);
		
		
		
		
		// 3. Can you drive?
		//		a. Using a conditional, print one of the following:
		//				i. "You can drive" if age is greater than or equal to 16
		//				ii. "You cannot drive" otherwise
		//
		//		a. Change the value of age and rerun to see the result
		
		if (!drivingEligibility) {
			int yearsToGo = (drivingAge - age);
			System.out.println("You are not eligible to drive for " + yearsToGo + " more years.");
		} else {
			System.out.println("Do you already have a driver's license? (true/false)");
			licenseAnswer = kb.next();
			hasLicense = Boolean.valueOf(licenseAnswer);
			if (hasLicense) {
				System.out.println("You are eligible to drive.");
			} else {
				System.out.println("You are old enough to drive, but you still need to take the Driver's Test to get your license.");
				} //hasLicense if statement
			} //drivingEligibility if statement
		break;
		} //question 1 and 2 and 3 and 4
		
		// 4. Update Solution to Question 3 as follows:
		//		a. Add a new variable called hasLicense before the conditional.
		//		b. Change the boolean expression in the conditional to additionally 
		//				include the need for hasLicense to be true.
		//		c. Try changing the values of age and hasLicense and note the different results.
		// See above.
		
		while (question == 5) {
		// 5. Milk?
		//		a. Create two new variables - costOfMilk and thirstLevel
		//		b. Create a new conditional that prints "Milk Please" if costOfMilk is less than 2.50 
		//				or if thirstLevel is greater than 6 and prints "No Thanks" otherwise.
		//		c. Change the values and note the different results.
		int thirstLevel;
		double costOfMilk;
		System.out.print("What is the cost of milk?");
		costOfMilk = kb.nextDouble();
		System.out.println("On a scale of 1-10, what is your thirst level?");
		thirstLevel = kb.nextInt();
		
		if (thirstLevel > 6) {
			System.out.println("I'm buying milk, regardless of cost.");
		} else if (costOfMilk < 2.50) {
			System.out.println("I'll have milk.");
		} else {
			System.out.println("I'll have water, thanks.");
		} // thirstLevel if's
		break;
		} // question 5
		
		
		while (question == 6) {
		// 6. Cookie Distribution: 
		//			Note:  You will evenly distribute all of the cookies to the children 
		//					and as the adult you get to keep the remaining cookies for yourself.
		//
		//		a. Create two variables called numberOfCookies and numberOfChildren.
		//		b. Initialize the two variables to integer values.
		//		b. Use a conditional to print the following based on the following conditions:
		//				i. If there are 0 cookies remaining, print "Sad Face"
		//				ii. If there are less than 2 cookies, print "Yes!"
		//				iii. If there are less than 5 cookies, print "Whoohoooo!"
		//				iv. If there are 5 or more cookies, print "Jackpot!"
		int numberOfCookies;
		int numberOfChildren;
		int myCookies;
		System.out.println("How many children are there?");
		numberOfChildren = kb.nextInt();
		System.out.println("How many cookies are there?");
		numberOfCookies = kb.nextInt();
		myCookies = (numberOfCookies % numberOfChildren);
		if (myCookies >= 5) {
			System.out.println("Jackpot!");
		} else if (myCookies == 0) {
			System.out.println("Sad face");
		} else if ((myCookies > 0) && (myCookies <= 2)) {
			System.out.println("Yes!");
		} else {
			System.out.println("WooHoo!");
		} //cookies
		break;
		} // question 6
		
		while ((question == 7) || (question == 8)) {
			System.out.println("Question 7 and 8");
		// 7.  Loyalty Member Program:
		//		a. Create a variable called loyaltyMemberStatus and assign the value "SILVER"
		//		b. Create a variable called loyaltyMemberDiscount and assign the value 0.0
		//		c. Using a switch, set the value of loyaltyMemberDiscount based on 
		//				the following loyaltyMemberStatus scale: 
		//				i. "SILVER" is 0.10
		//				ii. "GOLD" is 0.15
		//				iii. "PLATINUM" is 0.25
		System.out.println("Enter your Loyalty Member Status:  ");
		String loyaltyMemberStatus = kb.next();
		System.out.println("Enter your total bill:  $");
		double billTotal = kb.nextDouble();
		double loyaltyMemberDiscount = 0.0;
		switch (loyaltyMemberStatus) {
		case "SILVER":
			loyaltyMemberDiscount = .1;
			break;
		case "GOLD":
			loyaltyMemberDiscount = .15;
			break;
		case "PLATINUM":
			loyaltyMemberDiscount = .25;
			break;
		}
		double percentLoyaltyMemberDiscount = loyaltyMemberDiscount * 100;	
		String formattedDiscount = String.format("%.0f", percentLoyaltyMemberDiscount);
		System.out.println(formattedDiscount  + "% is your " + loyaltyMemberStatus + " discount!");
		
		
		// 8. Using the Loyalty Member Program variables from Question 7, do the following:
		//		a. Create a variable called billTotal and assign a value
		//		b. Create a variable called adjustedTotal and assign it the billTotal minus 
		//				the loyaltyMemberDiscount percent of the billTotal
		//		c. If the adjustedBillTotal is greater than $500 upgrade the 
		//				loyaltyMemberStatus from SILVER to GOLD or from GOLD to PLATINUM
		double adjustedTotal = billTotal - (billTotal * loyaltyMemberDiscount);
		String formattedAdjustedTotal = String.format("%.2f", adjustedTotal);
		System.out.println("Your new, adjusted, bill total is $" + formattedAdjustedTotal);
			if (adjustedTotal >= 500) {
				switch (loyaltyMemberStatus) {
				case "SILVER":
					loyaltyMemberStatus = "GOLD";
					System.out.println("Congratulations!  Your Loyalty Member Status has been upgraded to:  " + loyaltyMemberStatus);
					break;
				case "GOLD":
					loyaltyMemberStatus = "PLATINUM";
					System.out.println("Congratulations!  Your Loyalty Member Status has been upgraded to:  " + loyaltyMemberStatus);
					break;
				default:
					break;
				}
		}// adjustedTotal if statement
		
			break;
			} // question 7	and 8

		while (question == 9) {
			System.out.println("Question 9");
		// 9. Login -- username & password:
		//		a. Create two variables, username and password
		//		b. Create a conditional that prints one of the following:
		//				i. "login successful" if the username is "Tommy123" and the password is "12345"
		//				ii. "access denied" otherwise
			
		String tommysUsername = "Tommy123", tommysPassword = "drowssap123";
		int loginCount = 0;
		do {
		System.out.println("Line 199");
		System.out.println("Enter your Username: ");
		String username = kb.next();
		System.out.println("Enter your Password: ");
		String password = kb.next();
		if ((tommysUsername.equals(username)) && (tommysPassword.equals(password))) {
			System.out.println("Login Successful!");
			loginCount = 6;
		} else {
			System.out.println("Login Failed.  Please try again.");
			loginCount++;
			System.out.println(loginCount);
		}
		} while (loginCount < 5);
		if (loginCount == 5) {
			System.out.println("Access Denied!");
		}
		
		break;
		} //question 9
		
		//
		// LOOPS:
		//
		while (question == 10) {
			System.out.println("Question 10");
		// 10. Write a for loop that prints each number from 0 to 9
		for (int i=0; i < 10; i++) {
			System.out.println(i);
		}
		
		// 11. Write a for loop that prints each number from 10 to 0 backwards
		for (int i=10; i > -1; i--) {
			System.out.println(i);
		}
		
		
		// 12. Write a for loop that prints every other number from 0 to 100
		for (int i=0; i < 100; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		
		
		// 13. Write a for loop that iterates from 0 to 100 and prints 
		//			"EVEN" if the number is even and "ODD" if it's odd
		for (int i=0; i < 100; i++) {
			if (i % 2 == 0) {
				System.out.println(i + " " +  "EVEN");
			} else {
				System.out.println(i + " " + "ODD");
			}
		}
		
		
		// 14. Write a while loop that starts at 100 and iterates backwards by 1 until it reaches 0
		//			within the loop, divide each number by 3 and print the remainder to the console.
		int i = 100;
		do {
			System.out.println((i / 3) + " R" + (i % 3));
			i--;
		} while (i > -1);

		break;
		//System.out.println( "hello world".charAt(0) != 'H'); // This is COOL!  << Note:  This allows you to test particular characters in a string.
		} //Question 10
		
	}

}