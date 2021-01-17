package tema6;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Abecederian {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String word;
		
		System.out.println("Enter a word doubloon");
		word = sc.nextLine();
		
		if (isDoubloon(word)) {
			System.out.println("It´s doubloon");
		} else {
			System.out.println("NOOOO!!!! It is not doubloon");
		}

	}
	
	
	public static boolean isAbecedarian (String word) {
		
		boolean isAbecedarian = false;
		char[] arrayLetters = word.toCharArray();
		char controlChar = Character.toUpperCase('a');
		
		for (int i=0; i<arrayLetters.length; i++) {
			if (Character.compare(Character.toUpperCase(arrayLetters[i]), controlChar) >= 0) {
				controlChar = Character.toUpperCase(arrayLetters[i]);
				isAbecedarian = true;
			} else {
				isAbecedarian = false;
				break;
			}
		}
		
		return isAbecedarian;	
	}
	
	public static boolean isDoubloon (String word) {
		
		boolean isDoubloon = false;
		char[] arrayLetters = word.toCharArray();
		Map<Character, Integer> mapCharacters = new HashMap<Character, Integer>();
		char character; 
		
		for (int i=0; i<arrayLetters.length; i++) {			
			character = arrayLetters[i];
			if (mapCharacters.containsKey(character)) {
				mapCharacters.put(character, mapCharacters.get(character) + 1);
			} else {
				mapCharacters.put(character, 1);
			}
		}
		
		for (Integer repLetter : mapCharacters.values()) {
			if (repLetter != 2) {
				isDoubloon = false;
				break;
			} else {
				isDoubloon = true;
			}
		}
	
		return isDoubloon;
	}

}
