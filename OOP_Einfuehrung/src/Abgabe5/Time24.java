package Abgabe5;

import utilities.TastaturEingabe;

public class Time24 {
	private int hour ; 
	private int minute;
	
	//Konstruktur mit 2 Argumente vom Type int  
	public Time24(int hour, int minute) {
		this.hour = hour; 
		this.minute = minute ; 
		normalizeTime();
	}
	
	//Standardkonstruktur mit dem Wert 0 initialisiert  
	public Time24() {
		this(0,0);
	}
	
	// Kopierkonstruktur mit Parameter vom Type Time24
	public Time24(Time24 time) {
		this.hour = time.hour;
		this.minute= time.minute;
		normalizeTime();
	}
	
	// Getters und Setters von hour und minute
	public int getHour() {
		return this.hour;
	}
	
	public void setHour(int hour) {
		this.hour = hour;
		normalizeTime();
	}
	
	public int getMinute() {
		return this.minute;
	}
	
	public void setMinute(int minute) {
		this.minute= minute;
		normalizeTime();
	}
	
	/*readTime Method mit Rückgabetype Time24
	 * public Time24 readTime() {
		  Time24 time =new Time24();
		  time.hour = TastaturEingabe.readInt("Bitte gib die Uhr ein : ");
	      time.minute=TastaturEingabe.readInt("Bitte gib die Min. ein: ");
	      normalizeTime();
		  return time;
       }
	*/
	
	
	public Time24 readTime() {
		this.hour = TastaturEingabe.readInt("Bitte gib die Uhr ein : ");
		this.minute =TastaturEingabe.readInt("Bitte gib die Min. ein : ");
		normalizeTime();
		return this;
	}
	
	// method writeTime gibt die Zeit in Form <h:m> 
	public void writeTime() {
		
		System.out.format("< %02d:%02d > \n",this.getHour(),this.getMinute());
		//System.out.println(this.toString());
	
	}
	
	@Override
	public String toString() {
		
		return "\" "+this.getHour()+" : "+ this.getMinute()+" \"";
	}


	public void addTime (int scale) {
		if (scale >= 0) {
			this.minute += scale ;
			normalizeTime();
		}	
		
	}
	
	
	private void normalizeTime() {
		if( this.getMinute() >= 60 ) {
			this.hour += this.minute/ 60 ;
			this.minute %= 60 ;
		}
		
		if (this.getHour() >= 24) {
			this.hour %= 24 ;
			
		}
	}

}
