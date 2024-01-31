package Integer1;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class INT {

	public static void main ( String [] args) { 
		
		ArrayList<Integer> values = new ArrayList <Integer>()  ; 
		values.add(7) ; 
		values.add(5) ; 
		values.add(3) ; 
		values.add(4) ;
		values.add(1) ; 
		values.add(2) ; 
		values.add(6) ; 
		values.add(8) ; 
		values.add(9) ; 
		
		Comparator<Integer> com = new Comparator <Integer>() {
			
			@Override
			public int compare (Integer x , Integer y ) {
				if (x > y )
					return 1 ; 
				else 
					return -1 ;
			}
		};
		
		values.sort(com);
		
		Iterator<Integer> i = values.iterator() ;
		
		while(i.hasNext())
			System.out.println(i.next());
		
		for ( Integer v : values ) {
			System.out.println(v);
		}
		
	}
}
