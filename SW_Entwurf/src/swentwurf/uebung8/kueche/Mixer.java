package swentwurf.uebung8.kueche;

public class Mixer extends AbstarctKuechenGeraet implements MotorGeraet {

	public void einschaltenErweiterung() {
		motorEin();
	}

	public void ausschaltenErweiterung() {
		motorAus();
	}

	@Override
	public void motorEin() {
		System.out.println("Motor wurde eingeschaltet!");

	}

	@Override
	public void motorAus() {
		System.out.println("Motor wurde ausgeschaltet!");
	}

}
