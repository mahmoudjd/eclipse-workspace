package uebung8.aufgaben1und2;

import java.util.Date;

public class Pruefung {
	private Dozent pruefer;
	private Studierende student;
	private Date datum;
	private double note;

	private static final double[] GUELTIG_NOTEN;

	static {
		double[] gueltigNoten = { 1.0, 1.3, 1.7, 2.0, 2.3, 2.7, 3.0, 3.3, 3.7, 4.0, 5.0, 6.0 };
		GUELTIG_NOTEN = gueltigNoten;
	}

	public Pruefung(Studierende student, Dozent pruefer, Date datum, double note) {
		this.student = student;
		this.datum = datum;
		this.pruefer = pruefer;
		this.note = note;
	}
	
public Dozent getDozent() { 
		
		return this.pruefer;
	}

}
