package Abgabe07;
/*** Aufgabe_2***/
public class DemoKlasse {
	private int wert ;
	
	DemoKlasse(int wert ){
		this.wert = wert ;
	}
	public int getWert() {
		return this.wert;
	}
	public void setWert(int wert) {
		this.wert = wert ;
	}
	public DemoKlasse Addieren(DemoKlasse obj) {
		
		return new DemoKlasse(this.getWert()+obj.getWert());
	}
	public static void main(String[] args) {
		DemoKlasse s = new DemoKlasse(1);
		DemoKlasse x =new DemoKlasse(2);
		DemoKlasse sume = s.Addieren(x);
		System.out.println(sume.getWert());
		
	}
}
