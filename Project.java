

package myfirstjavaapplication ;
import java.time.LocalTime;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Project {
			//to generate random elements in a string array
			// to access words we make it static
			static String[] words = {"bat","ball","mobiles","enchanted","food","fox","red","dog","jump","zebra","lays"};

			public static void main(String[] args) throws InterruptedException {
				//we are throwing the exception because TimeUnit.SECONDS.sleep() may cause errors
				
		System.out.println("3");//to let the user know when to start typing
		TimeUnit.SECONDS.sleep(1);// to get one second interval between the print statements
		System.out.println("2");
		TimeUnit.SECONDS.sleep(1);
		System.out.println("1");
		TimeUnit.SECONDS.sleep(1);
		Random ran=new Random();//random number generator to start getting random elements
		for(int i=0;i<11;i++) {// we are using for loop to get a bunch of random numbers
			System.out.print(words[ran.nextInt(10)]+ "  "); /*will generate a random number 
			between 0 and 10 because 10 is our maximum index */ 	
		}
		System.out.println();
		double t1 = LocalTime.now().toNanoOfDay();//to get nano seconds of the day at present time
		Scanner sc=new Scanner(System.in);// to take input from the user
		String userWords=sc.nextLine();/* it gives the next entire line until the user 
		 hits enter and stores it as a string in userWords*/
		double t2 = LocalTime.now().toNanoOfDay();/*to get nano seconds of the day at present time after user
		  hits enter*/
		// System.out.println(userWords);
		double escapeTime=t2-t1;//elapsed time
		double seconds= escapeTime/1000000000.0;//to convert nanoseconds to seconds
		 //reSystem.out.println(seconds);
		int nChars=userWords.length();// to get the number of characters the user entered 
		 //Words per Minute formula is (x characters/5)/1min=y WPM
		int wpm=(int)((((double)nChars/5)/seconds)*60);/*5 is the average length of the word.
		  TYpecasting to double to get the accurate answer of the division and then typecasting again to integer to match the wpm 
		  .Multiplying with 60 to get the time in mins*/
		System.out.println("words per minute is " + wpm );	
		
	}

}
