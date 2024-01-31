package debugging;

public class BigInteger {

	public static void main(String[] args) {
		Integer a = 127;
		Integer b = 127;
		Integer c = 128;  
		Integer d = 128;

		System.out.println(a == b); // *true oder false? a.equals(B)
		System.out.println(c == d); // true oder *false? c.equals(d)
	}
}
