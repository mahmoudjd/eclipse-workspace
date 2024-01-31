package Mobil;

public class Contact {
	int number ;
	String name;
	public Contact(int number, String name) {
		this.number= number;
		this.name =name;
	}
	public int getNum() {
		return number;
	}
	public String getName() {
		return name;
	}
	
	@Override
	public boolean equals(Object o) {
		if(!(o instanceof Contact))
			return false;
		Contact c = (Contact) o;
		return c.name.equals(this.name) && c.number == this.number;
	}
	@Override
	public int hashCode() {
		return this.number;
	}
}
