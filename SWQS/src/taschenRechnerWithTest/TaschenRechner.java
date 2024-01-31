package taschenRechnerWithTest;

/**
 * Die Klasse implementiert einfache arithmetische Operationen.
 * 
 * @author mahmoud
 */

public class TaschenRechner {

	/**
	 * Die Methode berechnet die Summe von zwei Zahlen, die von int type sind
	 * 
	 * @param x int erste Zahl
	 * @param y int zweite Zahl
	 * @return x + y
	 */
	public int add(int x, int y) {
		if (x == 0) {
			return y;
		}

		if (y == 0) {
			return x;
		}

		int res = x + y;

		if (((res ^ x) & (res ^ y)) < 0) {
			throw new ArithmeticException();
		}

		return res;
	}

	/**
	 * Die Methode berechet das Ergebnis der Subtraktion von zwei ganzen Zahlen
	 * 
	 * @param x
	 * @param y
	 * @return x -y
	 */
	public int sub(int x, int y) {
		if (x == 0) {
			return -y;
		}
		int res = x - y;

		if ((x < 0 && y > 0 && res > 0) || (x > 0 && y < 0 && res < 0)) {
			throw new ArithmeticException();
		}

		return res;
	}

	/**
	 * Die Methode berechet das Ergebnis der Multiplikation von zwei ganzen Zahlen
	 * 
	 * @param x
	 * @param y
	 * @return x*Y
	 */
	public int mult(int x, int y) {
		if (x == 0 || y == 0)
			return 0;
		if (x == 1) {
			return y;
		}
		if (y == 1) {
			return x;
		}
		int result = Math.multiplyExact(x, y);

		return result;
	}

	/**
	 * Die Methode berechet das Ergebnis der Division von zwei ganzen Zahlen
	 * 
	 * @param x
	 * @param y
	 * @return x/y
	 */
	public int divide(int x, int y) {
		if (x == 0 && y != 0) {
			return 0;
		}
		if (y == 0) {
			throw new ArithmeticException();
		}
		if (y == 1) {
			return x;
		}

		return x / y;
	}

	public double percent(int value, int percentage) {
		// jede 100 hat percentage
		// jede value hat result => result =(value * percentage) / 100.0

		if (value == 0) {
			return 0.0;
		}
		if (percentage < 0) {
			throw new ArithmeticException();
		}
		if (percentage == 100) {
			return (double) value;
		}

		double result = value * (percentage / 100.0);

		return result;

	}

	public double mwst(int value) {
		// if (value < 0)
		// {
		// throw new ArithmeticException();
		// }

		return percent(value, 19);
	}
}
