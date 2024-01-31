package BufferedReader;

public class Person {
	private String name;
	private String addr;
	private String phone;
	private int point;
	public Person (String name, String addr,String phone,int point) {
		this.name = name;
		this.addr= addr;
		this.phone= phone;
		this.point= point;
	}
	public String getName() {
		return name;
	}
	public String getAddr() {
		return addr;
	}
	public String getPhone() {
		return phone;
	}
	public int getPoint() {
		return point;
	}
	public String toString() {
		return this.name +this.addr+this.phone+this.point;
	}
	
}
