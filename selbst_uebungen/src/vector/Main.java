package vector;

public class Main {

	public static void main (String[] args) {
	
		//Aufgabe4
		Vec2 v = new Vec2(1.0,2.0);
		
		System.out.println("Die orginal: "+v);
		v.addAssign(2);
		System.out.println("Plus 2 :"+v);
		v.mulAssign(5);
		System.out.println("Mul  5 :"+v);
		Vec2 v1 = new Vec2(2.0,2.0);
		Vec2 v2 = new Vec2(5.0,5.0);
		v.addAssign(v1);
		System.out.println("Die Add mit v1: "+v);
		v.mulAssign(v2);
		System.out.println("Die Mul mit v2: "+v);
		
		
		//Method chaninig******* 
		//Afgabe5 
		//System.out.println(v.mulAssign1(5).addAssign1(v1));
		
		Vec2 v3 =v.clone();
		if (v3 ==v )
			System.out.println("Fehler, Klon ist identisch ");
		else if (v.equal(v3))
			System.out.println("Korrekt! klon ist gleich");
		else 
			System.out.println("Fehler, object ungleich");
			
		
	}

}
