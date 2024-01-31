package reverseInteger;

public class ReversedInteger {

	public static int reverse(int x) {
		int INT_MAX = Integer.MAX_VALUE;

		if (x == 0) {
			return 0;
		}

		boolean sign = (x < 0) ? true : false;
		x = Math.abs(x);

		int reversedX = 0;
		while (x != 0) {
			int digit = x % 10;
			x /= 10;

			// Check for overflow
			if (reversedX > (INT_MAX - digit) / 10) {
				return 0;
			}

			reversedX = reversedX * 10 + digit;
		}

		return sign ? -reversedX : reversedX;
	}

	public static void main(String[] args) {
		// Test cases
		System.out.println(reverse(1982733699)); // reverse over MAX_INT => return 0
		System.out.println(reverse(123)); // Output: 321
		System.out.println(reverse(-123)); // Output: -321
		System.out.println(reverse(120)); // Output: 21
	}
}
