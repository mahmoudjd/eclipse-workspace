package uebung8.aufgabe3;

public abstract class AbstractClassKuechenGeraet implements KuechenGeraet {

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

}
