package MainPackage;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Hello World!");
		//System.out.println("This is my first Java Program!");
		
		//Variables
		double savingsAccountBalance = 29.00;
		double depositAmount = 100.00;
		double withdrawalAmount = 50.00;
		double newSavingsAccountBalance = 0.00;
		String formattedNumber = String.format("%.2f", savingsAccountBalance);
		
		//Operations
		System.out.println("The balance in your account is:  $" + formattedNumber);
		//System.in.read("Enter the amount you want to depostit:  $" + depositAmount);
		//Scanner in = new Scanner(System.in);
		formattedNumber = String.format("%.2f", depositAmount);
		System.out.println("You want to deposit $" + formattedNumber);
		savingsAccountBalance = savingsAccountBalance + depositAmount;
		formattedNumber = String.format("%.2f", savingsAccountBalance);
		System.out.println("Your new balance is $" + formattedNumber);
	}

}
