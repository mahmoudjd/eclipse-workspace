package root;

public class Person {

	private String name;
	private String addr;
	private String numm;
	private int points;
	
	public Person (String name , String addr, String numm, int points) {
		this.name= name;
		this.addr= addr;
		this.numm= numm;
		this.points = points;
	}
	public String getName () {
		return name ;
	}
	public String getAddr() {
		return addr;
	}
	public String getNumm() {
		return numm;
	}
	public int getPoints() {
		return points;
	}
	
	public String toString() {
		return this.name +"Wohnt in "+ addr+ "und seine Telefonnummer: "+numm+"und hat :"+points;
	}
}
