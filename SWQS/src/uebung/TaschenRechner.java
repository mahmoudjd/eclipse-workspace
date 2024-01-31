package uebung;

public class TaschenRechner {

	public static double Add(double x, double y) {
		return x + y ; 
	}
	
	public static double mult(double x, double y) { 
		return x * y;
	}
	
	public static double Potenz(double x, int n) {
		double result = 1; 
		
		if(n == 0 ) { 
			return result;
		}
		
		for (int i = 1; i<= n; i++) { 
			result *= x;
		}
		return result;
	}
	
	
}
