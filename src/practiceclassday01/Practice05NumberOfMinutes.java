package practiceclassday01;

import java.util.Scanner;

public class Practice05NumberOfMinutes {

	public static void main(String[] args) {
		/* Ask user to enter minutes,
	       * Write a Java program to convert minutes into a number of years and days.
	       * Input: number of minutes 3456789
	       * Output: 3456789 minutes is approximately 6 years and 210 days
	       */
		 Scanner scan=new Scanner(System.in);
		   System.out.println("Please enter number of minutes");
		   
		   long minutes=scan.nextLong();
		   long years=minutes/(60*24*365);
		   long days=(minutes/60/24)%365;
		   
		   System.out.println(days);
		   scan.close();
		   System.out.println(minutes+" minutes is approximately "+years+" "
		   		+ "and "+days+" days");
		
		
	}

}
