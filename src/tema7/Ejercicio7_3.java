package tema7;

public class Ejercicio7_3 {

	public static void main(String[] args) {

		int[] arrayNumbers = {4333,5,34443,1,444,5,666};
		
		System.out.println("The index of the biggest number is " + indexOfMax(arrayNumbers));
		
	}
	
	public static int indexOfMax (int[] numbers) {
		
		int index = 0;
		int highestNumber = 0;
		
		for (int i=0; i<numbers.length; i++) {
			if (numbers[i] > highestNumber) {
				highestNumber = numbers[i];
				index = i;
			}
		}
		
		return index;
	}

}
