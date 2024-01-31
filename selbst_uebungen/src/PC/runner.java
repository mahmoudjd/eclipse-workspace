package PC;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List ;
public class runner {
	
	public static void main(String [] args) {
		
		List<Laptop> laps = new ArrayList<>() ;
		laps.add(new Laptop("Hp", 16, 1400)) ;
		laps.add(new Laptop("Dell", 8, 1300 )) ;
		laps.add(new Laptop("Apple",32,2000)) ; 
		
		//Collections.sort(laps) ;
		Comparator<Laptop> com = new Comparator<Laptop>() 
		{
			public int compare ( Laptop l1 , Laptop l2) {
				if (l1.getPrice() > l2.getPrice())
					return 1 ; 
				else 
					return -1 ; 
			}
		}; 
		
		Collections.sort(laps, com);
		
		
		
		for (Laptop l : laps) {
			System.out.println(l);
		}
		
	}

}
