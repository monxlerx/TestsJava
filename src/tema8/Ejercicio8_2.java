package tema8;

import java.util.Scanner;

public class Ejercicio8_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
//		System.out.println("Enter a number");
//		int number = sc.nextInt();
//
//		System.out.println("The sum is " + oddSum(number));
//		System.out.println("The power is " + power(5,3));
		
		int[] numbers = {33,55,2,189,55,66,77,88,44,33,20};
		System.out.println(maxInRange(numbers, 7, 10));

		
	}
	
	public static int oddSum (int oddNumber) {
		
		int sum = 0;
		for (int i=0; i <= oddNumber; i++) {
			sum += i;
		}
		
		return sum;
	}
	
	public static double power (double base, int exponent) {
		return Math.pow(base, exponent);
	}
	
	public static int maxInRange(int[] numbers, int lowIndex, int maxIndex) {
		
		int max = 0;
		
		if (lowIndex - maxIndex == -1 || maxIndex - lowIndex == 1) {
			return maxIndex;
		} else { 
			for(int i=0; i<numbers.length; i++) {
				if (i >= lowIndex && i <= maxIndex) {
					if (numbers[i] > max) {
						max = numbers[i];
					}
				}
			}
		}
		
		return max; 
	}
	
	
	/**
	 * Returns the first character of the given String.
	 */
	public static char first(String s) {
	return s.charAt(0);
	}
	/**
	* Returns all but the first letter of the given String.
	*/
	public static String rest(String s) {
	    return s.substring(1);
	}
	/**
	 * Returns all but the first and last letter of the String.
	 */
	public static String middle(String s) {
	    return s.substring(1, s.length() - 1);
	}
	/**
	 * Returns the length of the given String.
	 */
	public static int length(String s) {
	    return s.length();
	}
	

}
