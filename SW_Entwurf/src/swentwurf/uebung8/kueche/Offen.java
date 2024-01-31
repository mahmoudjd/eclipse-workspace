package swentwurf.uebung8.kueche;

public class Offen extends AbstarctKuechenGeraet implements HeizbarGeraet {

	public void einschaltenErweiterung() {

		heizEin();
	}

	public void ausschaltenErweiterung() {
		heizAus();
	}

	@Override
	public void heizEin() {
		System.out.println("Heiz wurde eingeschaltet!");

	}

	@Override
	public void heizAus() {
		System.out.println("Heiz wurde ausgeschaltet!");
	}

}
