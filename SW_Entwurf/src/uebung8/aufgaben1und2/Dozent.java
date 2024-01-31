package uebung8.aufgaben1und2;

import java.util.*;

enum Fachgebiet {
	Mathe, Informatik, Spele, Design
}

public class Dozent {
	private Set<Fachgebiet> fachgebiet;

	public Dozent(Fachgebiet fachgebiet) {
		this.fachgebiet = new HashSet<>();
		this.fachgebiet.add(fachgebiet);
	}

}
