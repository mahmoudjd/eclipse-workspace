package Abgabe7;

import utilities.TastaturEingabe;

public class Aufgabe1 {
	
	public static long reverseInt(long n) {

	    long zwergb = n ;
	    int zaehler = 0 ;
	    int faktorZehn = 1 ;
	    long umdrehteZahl = 0 ;

	    // Anzahl der Zifferen ermitteln

	    while (zwergb != 0 ){
	        zwergb /= 10 ;
	        zaehler++;
	    }

	    // Die 10_Potenz ermitteln

	    for(int i = 1 ; i< zaehler ; i++){
	        faktorZehn *= 10 ;
	    }

	    // die Zahl umdrehen

	    zwergb = n;
	    while (zwergb != 0){
	        umdrehteZahl = umdrehteZahl+ (zwergb % 10 ) *faktorZehn ;
	        zwergb /= 10 ;
	        faktorZehn /= 10 ;
	    }


	    return umdrehteZahl ;

	}

	
	public static void  main (String[] args ) {
		long x = TastaturEingabe.readLong("Gib eine Zahl umzudrehen ein : ");
		//long x = 1567 ;
		//long x= 1234 ;
		//long x= 17 ;
		//long x= 454 ;
		long y =reverseInt(x) ;
		
		System.out.println("die umgemdrehte Zahl ist : " +y);
	}

}
