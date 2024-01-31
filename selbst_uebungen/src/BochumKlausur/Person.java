package BochumKlausur;

import java.util.ArrayList;
import java.util.Collections;

public class Person implements Comparable<Person> {
	
	public String vorname ; 
	public String nachname ; 
	public int gebjahr ;
	public static int anzahl = 0  ;
	
	public Person(String vorname, String nachname, int gebjahr){
		if(gebjahr / 10000 == 0 && gebjahr /1000 != 0) {
			if(gebjahr % 2 == 0) {
			
				this.vorname = vorname ;
				this.nachname= nachname;
				this.gebjahr = gebjahr ;
				anzahl ++; 
			}
		}
	}
	
	@Override
	public int compareTo ( Person p1 ) {
		
		if(this.gebjahr > p1.gebjahr)
			return 1 ; 
		else 
			return -1 ;
	}
	
	
	public String [][] setNamen() {
		String [] [] s = new String[1][2] ;
		
		for (int i=0  ; i< 1  ;i++) {		
			
			s[i][0] = this.vorname ;
			s[i][1] = this.nachname ;
		}
		return s ;
	}
	
	  public  void PrintNamen () {
			
		     String[] [] s = setNamen() ;
			for(int i = 0 ; i < s.length ; i ++ ) {
				for(int j = 0 ; j < s[i].length ; j++ )
					System.out.print(s[i][j] +" ");
				System.out.println();
			}
		}
	
	
//	@Override
//	public String toString() {
//		return "Person [vorname=" + vorname + ", nachname=" + nachname + ", gebjahr=" + gebjahr + "]";
//	}



	public static void main (String[] args) {
		
		ArrayList<Person> persons = new ArrayList<Person>() ;
		Person p1 = new Person ("Mahmoud","AlJarad",1994);
		persons.add(p1);
		Person p2 =new Person("Anas","AlJarad",2010);
		persons.add(p2);
		Person p3 = new Person ("Ahmad" , "AlJarad", 1998);
		persons.add(p3);
		
		Collections.sort(persons) ;
		//System.out.println(p1.toString());
		
	
			 for (Person p :persons)
				 p.PrintNamen();
		
		System.exit(0);
	}


}
