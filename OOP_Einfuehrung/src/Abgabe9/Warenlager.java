package Abgabe9;

public class Warenlager {
	
	private Artikel[] waren ;
	
	public Warenlager(int maxAnzahl) {
		this.waren= new Artikel[maxAnzahl];
	}
	
	public void einlagern(Artikel a, int anzahl ) {
		
		for ( int i = 0 ; i< waren.length ;i++  ) {
			
			
			
			if ( waren[i] == a ) {
				waren[i].einlagern(anzahl);
				break ;
			}
		
			if ( waren[i]== null ) {
				waren[i]= a; 
				waren[i].einlagern(anzahl);
				break ;
			}
			
					
		}
			
	}
	
	public void entnehmen(Artikel a, int anzahl) {
		
	}
	public void artikelPruefen(){
		
	}
	public void print() { 
		
	}
}
