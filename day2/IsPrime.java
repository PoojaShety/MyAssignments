package week1.day2;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Assignment 4: Print if the given number is prime
		 * 
		 * Goal: To understand the problem solving, looping and conditional statement
		 * 
		 * a) Create a class by name: IsPrime b) Create a main method using shortcut c)
		 * Write a logic to find if the given number is prime or not d) Print if it is
		 * prime or not
		 * 
		 * Hint: Iterate through all numbers from 2 to n-1 (input) and for every number
		 * check if it divides n (input). If we find any number that divides, print
		 * prime. If nothing divides, then print non-prime
		 */
		
		int n=57;
		boolean flag =true;
		for(int i=2;i<n;i++)
		{
			if (n%i==0) {
				flag=false;
				
			}
		}
		if(flag) {
			System.out.println("it is a prime no");
		}else {
			System.out.println("it is not prime no");
		}
		
	}

}
