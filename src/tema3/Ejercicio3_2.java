package tema3;

import java.util.Scanner;

public class Ejercicio3_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a temperature in Celsius");
		double temperatureCelsius = sc.nextDouble();
		
		double temperatureFarenheit = (temperatureCelsius * 9/5) + 32;
		
		System.out.println("The temperature in Farenheit is " + temperatureFarenheit + " F");
		
	}

}
