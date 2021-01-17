package tema11;

public class Tile {
	
	private char letter;
	private int value;
	
	public Tile (char letter, int value) {
		this.letter = letter;
		this.value = value;
	}

	public char getLetter() {
		return letter;
	}

	public void setLetter(char letter) {
		this.letter = letter;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	public static void printTile (Tile tile) {
		System.out.println("Your letter is " + tile.letter + " and the value is " + tile.value);
	}

	@Override
	public String toString() {
		return "Tile [letter=" + letter + ", value=" + value + "]";
	}

	
}