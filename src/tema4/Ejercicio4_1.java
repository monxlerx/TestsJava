package tema4;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Ejercicio4_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int day = 0;
		int month = 0;
		int year = 0;
		
		System.out.println("Enter a day");
		day = sc.nextInt();
		System.out.println("Enter a month");
		month = sc.nextInt();
		System.out.println("Enter a year");
		year = sc.nextInt();
		Calendar americanDate = printAmericanDate(day, month, year);
		System.out.println(americanDate.get(Calendar.MONTH) + " "
				+ americanDate.get(Calendar.DAY_OF_MONTH) + " "  
				+ americanDate.get(Calendar.YEAR));
		
	}
	
	public static Calendar printAmericanDate (int day, int month, int year) {

		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month);
		cal.set(Calendar.DAY_OF_MONTH, day);
		
		return cal;
		
		
	}

}
