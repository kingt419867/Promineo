package ScannerTest;
import java.io.*;
import java.util.*;
public class scannerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter your First and Last Name:");
		Scanner kb = new Scanner(System.in);
		String firstName, lastName;
		firstName = kb.next();
		lastName = kb.next();
		System.out.println("Your name is " + firstName  + " " + lastName + ".");
		
		int moneyInBank = 1500, rentDue = 1000, carPayment = 350, food = 200;
		int billSum = (rentDue + carPayment + food);
        if (moneyInBank > billSum) {
            System.out.println("You have enough money this week.");
        } else {
            System.out.println("You may need to borrow some money.");
        }
        
        System.out.println((-2 < -1) || ((10 > 3) && false));
	}

}
