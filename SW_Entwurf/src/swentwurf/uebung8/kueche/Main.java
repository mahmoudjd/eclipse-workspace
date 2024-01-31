package swentwurf.uebung8.kueche;

public class Main {

	public static void main(String[] args) {
		System.out.println("Offen: --->");
		KuechenGeraet offen = new Offen();
		offen.einschalten();
		offen.ausschalten();
		
		System.out.println("Mixer: --->");
		KuechenGeraet mixer = new Mixer();
		mixer.einschalten();
		mixer.ausschalten();
	}
}
