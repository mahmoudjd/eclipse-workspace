package vector;

public class Rectangle {

	private Vec2 topleft;
	private Vec2 botright;
	public Rectangle(Vec2 tl, Vec2 br) {
		this.topleft= tl.clone();
		this.botright= br.clone();
		
	}
	
	public Vec2 getTL() {
		return topleft.clone();
		
	}
	public Vec2 getBR() {
		return botright.clone();
		
	}
	
	public static void main(String[] args) {
		Vec2 v = new Vec2(1.0,2.0);
		Vec2 w = new Vec2(3.0,4.0);
		Rectangle r= new Rectangle(v,w);
		System.out.println(r);
		v.setX(10.0);
		System.out.println(r);
		r.getTL().setX(10.0);
		System.out.println(r);
	}
	@Override
	public String toString() {
		return "Rectangle"+ this.topleft+ "to "+ this.botright;
	}

}
