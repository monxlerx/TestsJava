package tema3;

import java.util.Scanner;

public class Ejercicio3_3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number of seconds");
		long numberSeconds = sc.nextInt();
		int hours = 0, minutes = 0, seconds = 0;
		
		if (numberSeconds < 3600) {
			hours = 0;
			minutes = (int) (numberSeconds / 60);
			seconds = (int) (numberSeconds - (minutes * 60));
		} else if (numberSeconds > 3600) {
			if(numberSeconds % 3600 == 0) {
				hours = (int) (numberSeconds / 60);
				minutes = 0;
				seconds = 0;
			} if (numberSeconds % 3600 != 0) {
				hours = (int) (numberSeconds / 3600);
				if (numberSeconds - ((int) hours * 60) % 60 == 0) {
					minutes = (int) (numberSeconds - ((int) hours * 60) / 60);
				} if (numberSeconds - ((int) minutes * 60) % 60 == 0) {
					seconds = (int) (numberSeconds - ((int) hours * 60) / 60);
				}
			}
			
		}
		
		System.out.println(hours + " hours" + minutes + " minutes" + seconds + " seconds");
		
	}

}
