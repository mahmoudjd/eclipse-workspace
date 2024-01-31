package vector;
//5.5 Übungsblatt5 
//Aufgabe1:
public class Vec2 {
	
	private double x;
	private double y;
	
	public Vec2(double x, double y) {
		this.x = x;
		this.y = y;
		
	}
	
	//Aufgabe2:
	@Override 
	public String toString() {
		return "( " + x +", " + y + ")";
	}
	
	//Aufgabe 3
	public void setX(double x) {
		this.x = x;
	}
	public double getX() {
		return this.x;
	}
	
	public void setY(double y) {
		this.y= y;
	}
	public double getY() {
		return this.y ;
	}
	public boolean equal(Object o) {
		if (!(o instanceof Vec2))
			return false;
		Vec2 v =  (Vec2)o;
		return v.getX()==getX() && v.getY()== getY();
	}
	
	//Aufgabe5
	public void addAssign(double scalar) {
		this.x += scalar;
		this.y += scalar;
	}
	public void addAssign (final Vec2 point) {
		this.x += point.x;
		this.y += point.y;
	}
	public void  mulAssign(double scalar) {
		this.x *= scalar;
		this.y *= scalar;
	}
	public void mulAssign(final Vec2 point) {
		this.x *= point.x;
		this.y *= point.y;
	}
	
	//*******
	//Aufgabe6
	//Method_chinig 
	//*******
	
	public Vec2 addAssign1(double scalar) {
	this.x += scalar;
	this.y += scalar;
	return this;
	}
	public Vec2 addAssign1(final Vec2 point) {
		this.x += point.x;
		this.y += point.y;
		return this;
	}
	public Vec2 mulAssign1(double scalar) {
		this.x *= scalar;
		this.y *= scalar;
		return this;
	}
	public Vec2 mulAssign1(final Vec2 point) {
		this.x *= point.x;
		this.y *= point.y;
		return this;
	}
	//Aufgabe7
	@Override 
	protected Vec2 clone() {
		return new Vec2(this.x,this.y);
	}

}
