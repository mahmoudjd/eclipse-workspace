package Abgabe9;

public class Haushaltsgeraet extends Artikel{
	private double anschlussLeistung ;
	private double gewicht ; 
	
	public Haushaltsgeraet( String bezeichnung, double preis , double anschlussLeistung ,double gewicht) {
		super (bezeichnung, preis);
		this.anschlussLeistung = anschlussLeistung; 
		this.gewicht = gewicht;
	}
	
	
	public String toString() {
		return super.toString() + " ,AnschlussLeistung : "+ this.anschlussLeistung
				+" , das Gewicht : "+this.gewicht ;
	}

}
