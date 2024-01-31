package uebung8.aufgabe3;

public abstract class AbstractClassHeizGeräte extends AbstractClassKuechenGeraet implements heizbarGeraet {

	private boolean heizstatus;
	private boolean signalstatus;

	@Override
	public void einschalten() {
		// Geraet einschalten => signalStatus = true
		signalstatus = true;
		System.out.println("Geraet eingschaltet");
	}

	@Override
	public void ausschalten() {
		// Geraet ausschalten => signalStatus = false
		signalstatus = false;
		System.out.println("Geraet ausgschaltet");

	}

	@Override
	public void heizungEinschalten() {
		// heizung einschalten => heizstatus = true
		heizstatus = true;
		System.out.println("Heizung einschalten");
	}

	@Override
	public void heizungAusschalten() {
		// heizung ausschalten => heizstatus = false
		heizstatus = false;
		System.out.println("Heizung ausschalten");
	}

}
