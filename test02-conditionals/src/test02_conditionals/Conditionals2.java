package test02_conditionals;
import java.io.*;
import java.util.*;
public class Conditionals2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Type the name of a day, here:  ");
		Scanner kb = new Scanner(System.in);
        String day = kb.nextLine();
      
      // WRITE YOUR CODE HERE
        
        String dayTest = day.toLowerCase();
        //System.out.println(day + ", " + dayTest);
        boolean weekEnd = false; 
        boolean weekDay = false;
        //System.out.println(dayTest);
        if (dayTest.equals("monday") || dayTest.equals("tuesday") || dayTest.equals("wednesday") || dayTest.equals("thursday") || dayTest.equals("friday")) {
        	weekDay = true;
        	//System.out.println(weekDay);
        } else if (dayTest.equals("saturday") || dayTest.equals("sunday")) {
        	weekEnd = true;
        }
        //Syntactically, the below should work, but they don't see the actual equality, so they never flip the booleans.
        //boolean weekDay = (dayTest == "monday" || dayTest == "tuesday" || dayTest == "wednesday" || dayTest == "thursday" || dayTest == "friday");
        //boolean weekEnd = (dayTest == "saturday" || dayTest == "sunday");
        //System.out.println(weekDay + " " + weekEnd);
        if (weekDay) {
            System.out.println(day + " is a weekday.");
        } else if (weekEnd) {
            System.out.println(day + " is a weekend day.");
        } else
            System.out.println("Invalid day!");

	}

}
