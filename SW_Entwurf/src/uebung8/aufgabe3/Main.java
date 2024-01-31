package uebung8.aufgabe3;

class Mixer extends AbstractClassMotorGeraet {

}

public class Main {

	public static void main(String[] args) {

		Offen o = new Offen();
		o.einschalten();
		o.heizungEinschalten();

		Mixer m = new Mixer();
		m.einschalten();
		m.motorEinschalten();
		
	}
}
