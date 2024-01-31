
package color ;
public class Color {
	
	public int red , green ,blaue;
	
	public void incRed(Color color) {
		color.red++;
	}
	
	public void incValue(int value) {
		value ++;
	}
	
	public Color(int red, int green , int blaue) {
		this.red = red;
		this.green = green ; 
		this.blaue= blaue ;
	}
	
	
	public static void main (String[] args) {
		
		Color color = new Color(0,0,0);
		
		color.incRed(color);
		color.incValue(color.green);
	
		System.out.println(color.red);
		System.out.println(color.green);
	
	}
}
