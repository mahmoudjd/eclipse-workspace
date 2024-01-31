package uebung8.aufgaben1und2;

import java.util.*;

public class Vorlesung {
	private String titel;
	private int nr;
	private Set<Dozent> dozenten;
	private Set<Studierende> studenten;
	private Set<Pruefung> pruefungen;

	public Vorlesung(String titel, int nr, Set<Studierende> studenten, Set<Dozent> dozenten, Set<Pruefung> pruefungen) {
		this.titel = titel;
		this.nr = nr;
		this.studenten = new HashSet<>();
		this.dozenten = new HashSet<>();

		assert (studenten.size() <= 100 && studenten.size() >= 5);
		assert (dozenten.size() >= 1);

		this.dozenten.addAll(dozenten);
		this.studenten.addAll(studenten);
		this.pruefungen = new HashSet<>();
		this.pruefungen.addAll(pruefungen);
	}


	public Set<Pruefung> getPruefungen() { 
		
		return pruefungen;
	}
	
	
}
