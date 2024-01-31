package Abgabe9;

import utilities.Datum ;

public class Milchprodukt extends Artikel{
	private Datum verfallsDatum; 
	private double maxLagerTemperatur ;
	
	public Milchprodukt(String bezeichnung , double preis, Datum verfallsDatum , double maxLagerTemperatur) {
		super(bezeichnung, preis);
		this.verfallsDatum= verfallsDatum;
		this.maxLagerTemperatur= maxLagerTemperatur ;
	}
	
	public boolean istWareOk() {
		Datum heute = new Datum() ;
		if (heute.vor(verfallsDatum))
			return true; 
		return false ; 
	}
	
	public String toString() {
		return super.toString()+ "verfallsDatum : "+ this.verfallsDatum 
				+" maxLagerTemperatur: "+ this.maxLagerTemperatur ;
	}
	
}
