package test02_conditionals;
import java.io.*;
import java.util.*;
import java.lang.Math;
public class BasicLooping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int i;
//		for (i=0; i<=100; i = (i*2 +1)) {
//			System.out.println(i);
//		}
		
//        int userValue = 2;
//        for (i = 1; i <= 100; i += userValue) {
//            System.out.println(i);
//        }
        
   //     int i;
//        for (i = 10; i > 0; i--) {
//            System.out.println(i);
//        }
        
//        int base = 2;
//        int power = 5;
//        int test;
//        int result;
//        test = (int) Math.pow(base, power);
//        System.out.println(test);
//        for (result = 1; result <= (int) Math.pow(base, power); result = (result *= base)) {
//        	System.out.println(result);
//        	//System.out.println(2^5);
//        }
//        
//        int counter = 0;
//        for (i = 1; i < 100; i += 2) {
//            counter++;
//            System.out.println(counter); //This will end at 50.
//        }
//        System.out.println("Enter a number:  ");
//        Scanner kb = new Scanner(System.in);
//        int userNumber = kb.nextInt();
//
//        // WRITE YOUR CODE HERE 
//        if (userNumber < 1 || userNumber > 100) {
//        	System.out.println("Your number was not between 1 and 100.");
//    	} else {
//        	while (userNumber > 0 && userNumber <= 100) {
//        		System.out.println(userNumber);
//        		System.out.println("Enter another number: ");
//        		userNumber = kb.nextInt();
//        	}
//    	}
    	
//    	int num = 1;
//    	int opr;
//    	int result;
//    	for (opr = 1; opr <= 10; opr++ ) {
//    		result = num * opr;
//    		System.out.println(num + " x " + opr + " = " + result);
//    	}

//        Scanner in = new Scanner(System.in);
//        int numToAdd = in.nextInt();
//        int howManyTimes = in.nextInt();
//        int sumResult = 0;
///****** DO NOT CHANGE THE CODE ABOVE THIS LINE ******/
//
//        // WRITE YOUR CODE HERE 
//        int i = 0;
//       do {
//           sumResult += numToAdd;
//           i++;
//       } while (i < howManyTimes);
//       
//       System.out.println(sumResult);
//		int countDown=10;
//        if (countDown <= 10 && countDown >= 3) {
//            for (int i = countDown; i >= 1; i--) {
//                System.out.println(i + "...");
//            }
//        }
//        System.out.println("We have life off!");
		
		
		
//		int x = 100;
//		int y = 5;
//
//		if(x <= 100 && y > 1){
//		    while(x > y){
//		        System.out.println(x);
//		        x--;  
//		    }
//		} else{
//		    System.out.println("Your loop did not run.");
//		}

//		boolean test = (false || false);
//		System.out.println(test);
//		
		
		  String name = "Tommy";
		  int age = 52;
		  if (name == "Tommy") {
		    System.out.println("Hi, Tommy!");
		  } else if (age == 52) {
		    System.out.println("52 years old.");
		  }
		  System.out.println("Out of conditional.");
		
		
		
		
		
	}
}
