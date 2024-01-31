package Mobil;

import java.util.ArrayList;
import java.util.HashSet;

public class SmartPhoneC  extends MobilphoneC{
	HashSet<String> apps;
	
	public SmartPhoneC(ArrayList<Contact> contacts, int number, HashSet<String>apps) {
		super(contacts, number);
		this.battery= 800;
		this.apps= apps;
	}
	
	public void installApps(String app) {
		apps.add(app);
		battery -=5;
	}
	public void deinstallApp(String app) {
		apps.remove(app);
		battery -=5;
	}
}
