package Abgabe6;

public class OmniBus extends Auto{
	private int anzSitze ;
	
	public OmniBus(int kmStand, double verbrauch, double tankVolumen, double kraftstoffVorrat, int anzSitze) {
		super(kmStand, verbrauch, tankVolumen, kraftstoffVorrat);
		this.anzSitze = anzSitze;
	}
	
    @Override
    public String toString() {
    	return super.toString()+"\n Anzahlsitze: "+this.anzSitze;
    }
}
