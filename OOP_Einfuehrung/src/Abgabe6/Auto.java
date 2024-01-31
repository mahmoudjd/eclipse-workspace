package Abgabe6;

public class Auto {
	private int kmStand ; 
	private double verbrauch ;
	private double tankVolumen ; 
	private double kraftstoffVorrat ;
	
	public Auto (int kmStand ,double verbrauch ,double tankVolumen ,double kraftstoffVorrat) {
		assert(kraftstoffVorrat <= tankVolumen) ;
		this.kmStand= kmStand; 
		this.verbrauch = verbrauch/100 ; 
		this.tankVolumen = tankVolumen ; 
		this.kraftstoffVorrat = kraftstoffVorrat ;
		
	}
	
	public void info() {
		System.out.println("das Auto hat "+this.kmStand+ " Km gefahrn, "+
	                       "und es hat "+this.kraftstoffVorrat+" Liters von Kraftstoffvorrat");
	}
	
	
	
	public void fahren(int km ) {
		if (this.kraftstoffVorrat-(this.verbrauch*km)>= 0) {
			this.kmStand+= km;
			this.kraftstoffVorrat-= km * this.verbrauch;
		}
		else {
			this.kmStand+= this.kraftstoffVorrat /this.verbrauch;
			this.kraftstoffVorrat = 0.0;
		}
		
	}
	
	
	public void tanken (double liter) {
		if(this.kraftstoffVorrat+ liter <= this.tankVolumen) {
			this.kraftstoffVorrat+= liter ;
			double x = this.tankVolumen-this.kraftstoffVorrat;
			System.out.println("Es fehlt noch "+x+" Liters um den Tank vollig zu sein ");
		}
		else {
			double x = this.tankVolumen - this.kraftstoffVorrat;
			System.out.println("das Auto braucht nur "+x+ " liters ");
			this.kraftstoffVorrat= this.tankVolumen;
			//System.out.println("Der Autotank ist vollig !!");
		}
		
	}
	
	
	@Override
	public String toString() {
		return "Informationen des Autos :\n "
				+ "Km-Stand :"+ this.kmStand+ "\n Verbrauch : "+this.verbrauch +
				"\n Tankvolumen: "+ this.tankVolumen +"\n Krafftstofftank: "+this.kraftstoffVorrat ;
	}
	
	
	
}
