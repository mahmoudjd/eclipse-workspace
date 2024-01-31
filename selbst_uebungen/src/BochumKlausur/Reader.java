package BochumKlausur;

import java.io.*;
import java.util.ArrayList;
// import java.util.Scanner;

public class Reader {
	
	private static ArrayList<String> arrs = new ArrayList<>();

	public static ArrayList<String> leseGeburtsdatum() {
//		
//		BufferedReader br;
//		try {
//			br = new BufferedReader(new FileReader("PersonGeburtsdatum.txt"));
//			try {
//				String zeile = br.readLine();
//				for(int i = 0 ; !zeile.isEmpty(); i++)
//					arrs [i] = Integer.parseInt(zeile) ;
//				
//				
//			}catch( IOException e) {
//				e.getStackTrace();
//			}
//		
//		} catch (FileNotFoundException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
//		
//		Scanner scan = null;
//		try {
//		    scan = new Scanner(new File("PersonGeburtsdatum.txt"));
//		} catch (FileNotFoundException e) {
//		    e.printStackTrace();
//		}
//		for (int i = 0 ; scan.hasNext() ; i++) {
//		   arrs[i] =Integer.parseInt(scan.nextLine());
//		}
//		scan.close();
//		
//		return arrs;
		
		try {
			
			BufferedReader br = new BufferedReader ( new FileReader ("PersonGeburtsdatum.txt"));
			
			String line = br.readLine();
		
			while ( line != null ) {
				
				arrs.add(line);
				
				line = br.readLine();

			}
			br.close ();
		} 
		catch ( IOException e ) {
		
			System.out.println(" Datei  konnte  nicht  gelesen  werden ! ");
		}
		
		return arrs;
	}

	public static void gibGeburtsdatumAus(ArrayList<String> gebDatumZeichen) {
		
		for ( String a : gebDatumZeichen) {
			if (a != null) {
				
				System.out.println(a);
				
			}
		}
	
	}
	
/*	 private static void ladeDatei(String datName) {

	        File file = new File(datName);

	        if (!file.canRead() || !file.isFile())
	            System.exit(0);

	            BufferedReader in = null;
	        try { 
	            in = new BufferedReader(new FileReader(datName));
	            String zeile = null;
	            while ((zeile = in.readLine()) != null) {
	                System.out.println("Gelesene Zeile: " + zeile);
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        } finally {
	            if (in != null)
	                try {
	                    in.close();
	                } catch (IOException e) {
	                }
	        }
	    }
	    */

	public static void main (String[] args) { 
		
			ArrayList<String> gebDatumZeichen = leseGeburtsdatum();
			
			gibGeburtsdatumAus(gebDatumZeichen);

			
//		ladeDatei("./PersonGeburtsdatum.txt");
//		System.exit(0);
		
	}
	
}
