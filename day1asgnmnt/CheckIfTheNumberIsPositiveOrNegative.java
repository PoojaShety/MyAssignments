package week1.day1asgnmnt;

public class CheckIfTheNumberIsPositiveOrNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Problem statement: Check if the number is positive or negative
		/*Pseudocode
		 * : ---------- 
		 * 1. Initialize a number, say, int number= 35; 
		 * 
		 * 2. If a number is positive, print "The number is positive" 
		 * 
		 * If a number is negative, print "The number is negative" 
		 * 
		 * If it nether negative nor positive, print as
		 * 
		 * "The number is neither positive nor negative"
		 */
	
		int num=49;
		if (num>0)
		{
			System.out.println("The number is positive" );
		}else if(num<0)
		{
			System.out.println("The number is negative" );
		}
		else
		{
			System.out.println( "The number is neither positive nor negative");
		}

	}

}
