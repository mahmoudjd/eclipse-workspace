package Mobil;

public class SmartPhone extends Mobilphone{

	int apps;
	
	public SmartPhone(int contacts, int number ,int apps) {
		super(contacts, number);
		this.apps= apps;
		this.battery = 800;
	}
	
	public void installApps() {
		apps ++;
		battery -=5;
	}
	public void deinstallApps() {
		apps --;
		battery -=5;
	}
}
