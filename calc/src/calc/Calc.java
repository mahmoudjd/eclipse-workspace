package calc;

public class Calc {
	
	public int plus(int x, int y) {
		int res = x + y;

		if (((res ^ x) & (res ^ y)) < 0) {
			throw new ArithmeticException();
		}
		return res;
	}
	
	public int minus(int x, int y) {
		if (x > 0 && y < 0){
			return plus(x,-y);
		}

		if (x < 0 && y < 0) {
			return plus(x, -y);
		}
		
		return plus(x,-y);
	}
	
	public int mult(int x , int y) {
		return x * y;
	}
	
	public int durch(int x, int y) {
		return x / y;
	}
	
	
}
