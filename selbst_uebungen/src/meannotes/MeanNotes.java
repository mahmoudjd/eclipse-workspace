package meannotes;

import java.util.*;

public class MeanNotes {

	private List<Double> noteProModul = new ArrayList<>();
	private int akteuellPoints;

	public MeanNotes(int akteuellPoints) {
		this.akteuellPoints = akteuellPoints;
	}

	public void setNoten(String name, double note, int point) {
		noteProModul.add(note * point);
	}

	public double completNote() {
		double mean = 0;

		for (double value : noteProModul) {
			mean += value;
		}
		return mean / this.akteuellPoints;
	}

	public static void main(String[] args) {

		MeanNotes mn = new MeanNotes(125);
		mn.setNoten("comGraph", 1.0, 5); // 1

		mn.setNoten("oop-1", 1.3, 10); // 1

		mn.setNoten("TI", 1.7, 5); // 2
		mn.setNoten("SWMgmt", 1.7, 5);

		mn.setNoten("DB", 2.0, 5); // 2
		mn.setNoten("Tool&Plugin", 2.0, 5);

		mn.setNoten("logik", 2.3, 5); // 2
		mn.setNoten("webtech", 2.3, 5);

		mn.setNoten("DatAlg", 2.7, 5); // 7
		mn.setNoten("SWQS", 2.7, 5);
		mn.setNoten("GrundM", 2.7, 5);
		mn.setNoten("Math3", 2.7, 5);
		mn.setNoten("sysAdmin", 2.7, 5);
		mn.setNoten("Medrecht", 2.7, 5);
		mn.setNoten("CSharp", 2.7, 5);

		mn.setNoten("Mathe2", 3.0, 5); // 5
		mn.setNoten("wiss", 3.0, 5);
		mn.setNoten("BigData", 3.0, 5);
		mn.setNoten("THI", 3.0, 5);
		mn.setNoten("progpar", 3.0, 5);

		mn.setNoten("ITS", 3.3, 5); // 2
		mn.setNoten("SWE", 3.3, 5);

		mn.setNoten("OOP-2", 3.7, 5); // 2
		mn.setNoten("RN", 3.7, 5);

//		mn.setNoten("Visuallisierung", 1.0, 5);
//		mn.setNoten("Anf.Man.", 2.3, 5);
//		mn.setNoten("produktwirtschaft", 2.0, 5);
//		mn.setNoten("seminar", 2.0, 3);
//		mn.setNoten("Bs", 2.7, 5);
//		mn.setNoten("WebEntwicklung", 1.3, 5);
//		mn.setNoten("AlgoDisign", 2.0, 5);	
//		mn.setNoten("Teamproject", 1.7, 10);
//		mn.setNoten("AbschlussArbeit", 1.7, 12);

		System.out.println("Meine aktuelle Durchschnittspunkten: " + mn.completNote());

	}

}