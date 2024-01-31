package kapital7;

import java.util.Optional;

public class AnfangsWert {

	public void methode(int i) {
		methode(i, 5, 27); // Anfangswerte von j und k
	}

	public void methode(int i, int j, int k) {
		//
	}

	// andere methode um Anfangswert einzusetzen

	public void methode(int i, Optional<Integer> j, Optional<Integer> k) {
		int jj = j.orElse(5);
		int kk = k.orElse(27);
		System.out.println(jj+ ", "+kk);
		// mit i, jj, kk weiterrechnen
	}
	
}
