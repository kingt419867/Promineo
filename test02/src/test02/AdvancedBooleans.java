package test02;
import java.io.*;
import java.util.*;

public class AdvancedBooleans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		      
		    //public static void aeiou(char letter) {          
		       
		        // WRITE YOUR CODE HERE 
		    
			//public static void main(String[] args) {
//				Scanner in = new Scanner(System.in);
//				char a;
//				a = in.nextLine().charAt(0);
//			    aeiou(a);
//			    
//			    if ((letter == 'a') || (letter == 'e') || (letter == 'i') || (letter == 'o') || (letter == 'u')) {
//			        System.out.println("It's a vowel!");
//			    } else {
//			        System.out.println("It's a consonant!");
//			    }
			
		
//			int wordLength;
//	        wordLength = randomWord.length();
//	        if (wordLength >= 10) {
//	            System.out.println("That is a really long word!");
//	        } else {
//	            System.out.println("Your word is not that long.");
//	        }
		System.out.println("Enter the temperature highs for Sunday, Monday, and Tuesday:  ");
		Scanner kb = new Scanner(System.in);
		double sundayTemp, mondayTemp, tuesdayTemp;
		sundayTemp = kb.nextDouble();
		mondayTemp = kb.nextDouble();
		tuesdayTemp = kb.nextDouble();
		int theHottestDay1;
        int theHottestDay2;
        int theHottestDay3;
        //First test
        if (sundayTemp > mondayTemp) {
            theHottestDay1 = (int) sundayTemp;
        } else {
            theHottestDay1 = (int) mondayTemp;
        }
        System.out.println(theHottestDay1 + " is the hottest of Sunday or Monday.");
        //2nd test
        if (mondayTemp > tuesdayTemp) {
            theHottestDay2 = (int) mondayTemp;
        } else {
            theHottestDay2 = (int) tuesdayTemp;
        }
        System.out.println(theHottestDay2 + " is the hottest of Monday or Tuesday.");
        //3rd test
        if (theHottestDay1 > theHottestDay2) {
            theHottestDay3 = theHottestDay1;
        } else {
            theHottestDay3 = theHottestDay2;
        }
//        String formattedTemp;
//        formattedTemp = String.format("%.0f", theHottestDay3);
//        System.out.println(formattedTemp + " is the hottest temp.");
        
        
        if (theHottestDay3 == sundayTemp) {			//Type mismatch:  Cannot convert from Double to Boolean.
            System.out.println("Sunday");
        } else if (theHottestDay3 == mondayTemp) {  //Type mismatch:  Cannot convert from Double to Boolean.
            System.out.println("Monday");
        } else {
            System.out.println("Tuesday");
        }
	
        //This works, too:
        if (sundayTemp > mondayTemp && sundayTemp > tuesdayTemp) {
		    System.out.println("Sunday");
		    
		} else if (mondayTemp > sundayTemp && mondayTemp > tuesdayTemp) {
		    System.out.println("Monday");
		    
		} else {
		    System.out.println("Tuesday");
		}
        
        int personOneAge,personTwoAge, personThreeAge;
		personOneAge = kb.nextInt();
		personTwoAge = kb.nextInt();
		personThreeAge = kb.nextInt();
		
		// WRITE YOUR CODE HERE
		if (personOneAge > personTwoAge && personOneAge > personThreeAge) {
		    System.out.println("Person one is the oldest.");
		} else if (personTwoAge > personOneAge && personTwoAge > personThreeAge) {
		    System.out.println("Person two is the oldest.");
		} else 
		    System.out.println("Person three is the oldest.");
        
		
		
	}
}
