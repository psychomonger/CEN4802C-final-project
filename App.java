/***********************************************************************
 * George E. Mitchell
 * 202420 Software Integration, Configuration, and Testing CEN-4802C-24676
 * Final Project
 * 
 * This application prints some simple arithmetic calculations to the console.
***********************************************************************/
package package1;

public class App {
	
	public static void main(String args[]) {
		
		System.out.println("The square of 5 is " + square(5) + ".");
		System.out.println("The sum of 1 and 3 is " + sum(1,3) + ".");
		System.out.println("The difference of 5 and 2 is " + difference(5,2) + ".");
		
	}

	// This method returns the square root of the number.
	public static int square(int n) {
		return n * n;
	}
	
	// This method returns the sum of two integers.
	public static int sum(int a, int b) {
		return a + b;
	}
	
	// This method returns the difference of two integers.
	public static int difference(int a, int b) {
		return a - b;
	}
		
}
