package Integer1;

import java.util.ArrayList ;
import java.util.List ;

public class INT2 {
	
	public static void main (String[] args ) {
		
		List<Integer> values = new ArrayList <Integer>();

		for( int i = 1 ; i <= 10 ; i++ )
			values.add(i);
	
		
		
		values.stream().forEach(System.out::println );
		
	//  values.forEach(System.out::println);
		
	
	}
	

}
