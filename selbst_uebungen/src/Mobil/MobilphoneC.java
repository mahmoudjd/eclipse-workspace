package Mobil;
import java.util.ArrayList;

public class MobilphoneC {
 
	ArrayList<Contact> contacts;
	int number;
	int battery;
	
	public MobilphoneC (ArrayList<Contact> contacts, int number ) {
		this.contacts = contacts; 
		this.number= number;
		this.battery= 1500;
	}
	
	public void AddConatct(Contact contact) {
		for(Contact c : contacts) {
			if (c.equals(contact))
				return;
		}
		contacts.equals((Contact)contact);
		battery -=2;
	}
	public void removeContact(Contact contact) {
		contacts.remove(contact);
		battery -=2;
	}
}
