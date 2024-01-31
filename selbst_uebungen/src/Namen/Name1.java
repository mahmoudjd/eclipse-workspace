package Namen;

import java.util.Arrays;

import java.util.List;
import java.util.function.Consumer;

public class Name1 {

	public static void main(String[] args ) { 
		
		List <String> names = Arrays.asList("Mahmoud","Ahmad", "Anas") ; 
		
		//names.forEach(str->System.out.println(str));
	
		Consumer <String> con = new Consumer<>()
		{
			public void accept (String s) {
				System.out.println(s);
			}
		};
		names.forEach(con);
			
	}
	
}
