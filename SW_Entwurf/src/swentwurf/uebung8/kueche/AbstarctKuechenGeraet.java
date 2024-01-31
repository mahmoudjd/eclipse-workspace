package swentwurf.uebung8.kueche;

public class AbstarctKuechenGeraet implements KuechenGeraet {

	private boolean signalLeuchte;

	@Override
	public void einschalten() {
		signalLeuchte = true;
		System.out.println("Das Geraet wurde eingeschaltet !");
		einschaltenErweiterung();
	}

	@Override
	public void ausschalten() {
		signalLeuchte = false;
		System.out.println("Das Geraet wurde ausgeschaltet !");
		ausschaltenErweiterung();
	}

	protected void einschaltenErweiterung() {

	}

	protected void ausschaltenErweiterung() {

	}

}
