package hashCode_und_equals;

public class Fraction {
	private final int numirator, denominator;
	public Fraction(int numirator, int denominator) {
		if (denominator == 0)
			throw new IllegalArgumentException();
		this.numirator= numirator;
		this.denominator= denominator;
		
	}
	public int getNuminator () {
		return numirator;
	}
	public int getDenominator() {
		return denominator ;
	}
	@Override 
	public int hashCode () {
		int gcd = computeGcd (numirator,denominator);
		return numirator/gcd +(denominator/gcd)* 31;
	}
	private static int computeGcd(int a, int b) {
		return b==0?a:computeGcd(b,a % b);
	}
	@Override 
	public boolean equals(Object obj) {
		if (! (obj instanceof Fraction))
			return false;
		Fraction f = (Fraction) obj;
		return this.numirator * f.denominator == f.numirator* this.denominator;
	}
	
}
