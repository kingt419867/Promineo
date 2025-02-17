package bankAccountTest;
import java.io.*;
import java.util.*;
public class bankAccountTest {

	public static void main(String[] args) {
		
		double currentBalance = 0, depositAmount = 0, withdrawalAmount = 0;
		String formattedBalance = String.format("%.2f", currentBalance);
		String formattedDeposit = String.format("%.2f", depositAmount);
		String formattedWithdrawal = String.format("%.2f", withdrawalAmount);
		
		System.out.println("What is your starting balance? ");
		Scanner kb = new Scanner(System.in);
		currentBalance = kb.nextDouble();
		
		formattedBalance = String.format("%.2f", currentBalance);
		System.out.println("Your current balance is $" + formattedBalance);
		
		boolean runAgain = true;
		while (runAgain) {
			
		System.out.println("What would you like to do?  Please select the letter you want:");
			System.out.println("Press 1 to make a deposit.");
			System.out.println("Press 2 to make a withdrawal.");
			System.out.println("Press 3 to check your balance.");
			System.out.println("Press 4 to exit.");
			System.out.println("");
		int menuAnswer = 4;
		kb = new Scanner(System.in);
		menuAnswer = kb.nextInt();
		switch (menuAnswer) {
			case 1:
				System.out.println("How much would you like to deposit? ");
				depositAmount = kb.nextDouble();
				currentBalance = currentBalance  + depositAmount;
				formattedBalance = String.format("%.2f", currentBalance);
				System.out.println("Your new balance is $" + formattedBalance);
				break;
			case 2:
				System.out.println("How much would you like to withdraw? ");
				withdrawalAmount = kb.nextDouble();
				currentBalance = currentBalance - withdrawalAmount;
				formattedBalance = String.format("%.2f", currentBalance);
				System.out.println("Your new balance is $" + formattedBalance);
				break;
			case 3:
				formattedBalance = String.format("%.2f", currentBalance);
				System.out.println("Your current balance is $" + formattedBalance);
				break;
			case 4:
			default:
				kb.close();
				runAgain = false;
				break;
			}
		}
		System.out.println(currentBalance + ", " + depositAmount + ", " + withdrawalAmount);
	}
}
