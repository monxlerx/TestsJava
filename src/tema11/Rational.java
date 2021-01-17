package tema11;



public class Rational {
	
	private int numerator;
	private int denominator;
	
	public Rational () {
		numerator = 0;
		denominator = 1;
	}
	
	public Rational (int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}

	public int getNumerator() {
		return numerator;
	}

	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}

	public int getDenominator() {
		return denominator;
	}

	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}
	
	public void printRational(int numerator, int denominator) {
		System.out.println(numerator + "/" + denominator);
	}

	@Override
	public String toString() {
		return "Rational [numerator=" + numerator + ", denominator=" + denominator + "]";
	}
	
	public void invertRational(int numerator, int denominator) {
		System.out.println(denominator + "/" + numerator);
	}
	
	public double toDouble(int numerator, int denominator) {
		return (numerator / denominator);
	}

}
