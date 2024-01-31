package uebung8.aufgabe3;

public class AbstractClassMotorGeraet extends AbstractClassKuechenGeraet implements motorGeraet {

	private boolean motorStatus;
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
	public void motorEinschalten() {
		// motor einschalten => motorStatus = true
		motorStatus = true;
		System.out.println("Motor einschalten");

	}

	@Override
	public void motorAusschalten() {
		// motor ausschalten => MotorStatus = false
		motorStatus = false;
		System.out.println("Motor ausschalten");
	}

}
