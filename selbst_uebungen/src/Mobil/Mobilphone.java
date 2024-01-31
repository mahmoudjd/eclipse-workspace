package Mobil;

public class Mobilphone {
	int contacts;
	int number;
	int battery;
	
	public Mobilphone(int contacts, int number) {
		this.contacts = contacts;
		this.number= number;
		this.battery= 1500;
	}
	public void addContact() {
		contacts ++;
		battery -= 2;
	}
	public void removeContact() {
		contacts --; 
		battery-= 2;
	}
}
