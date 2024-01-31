package uebung8.aufgabe4;

import java.util.*;

public class AbschlussArbeit {

	public void abgabeTest() throws Exception {
		String thema;
		do {
			thema = themaErfragen();

		} while (!einverstanden(thema));

		if (voraussetzungPruefen()) {
			String plan;
			plan = plannen();

			List<String> arbeitsPakete = arbeitsAnmelden(plan);

			do {
				String zwischenergebnis = themaBearbeiten(arbeitsPakete);
				arbeitsBesprechen(zwischenergebnis);

			} while (!abgabeBereit(arbeitsPakete));
		}

	}

	private boolean einverstanden(String thema) {
		// TODO Auto-generated method stub
		return false;
	}

	private String themaErfragen() {
		// TODO Auto-generated method stub
		return null;
	}

	private boolean voraussetzungPruefen() {
		// TODO Auto-generated method stub
		return false;
	}

	private String plannen() {
		// TODO Auto-generated method stub
		return null;
	}

	private boolean abgabeBereit(List<String> arbeitsPakete) {
		// TODO Auto-generated method stub
		return false;
	}

	private List<String> arbeitsAnmelden(String plan) {
		// TODO Auto-generated method stub
		return new ArrayList<>();
	}

	private String themaBearbeiten(List<String> arbeitsPakete) throws Exception {
		// TODO Auto-generated method stub
		return "Thema wurde bearbeitet und bereit zum Zwischenergebnis";
	}

	private List<String> arbeitsBesprechen(String zwischenergebnis) {
		// TODO Auto-generated method stub
		return new ArrayList<>();
	}

}
