package HelloWorldPackage;
import java.io.*;
import java.util.*;
public class hwClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//This is different, below, than System.out.print(), because the 'ln' generates a line feed.
		System.out.println("Hello, World");
		
//		int num1 = 10;
//	       int num2 = 3;
//	       int num3 = 5;
//	       int num4 = 6;
//	       int answer = ((num1 * num2) / num3) % num4;
//	       System.out.println(answer);
	       
       Scanner kb = new Scanner(System.in);
			double num1, num2, num3;
			System.out.println("Hit ENTER, and then input 3 numbers, hitting ENTER after each.");
			num1 = kb.nextDouble();
			num2 = kb.nextDouble();
			num3 = kb.nextDouble();
			System.out.println("This is what you inputted:  " + num1 + " " + num2 + " " + num3);
	}

}
