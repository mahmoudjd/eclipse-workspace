package uebung9.aufgabe2;

import java.util.*;

public class IntSplitter implements Splitter1<Integer, Integer> {
	
	@Override
	public List<Integer> split(Integer number) {
		List<Integer> ziffern = new ArrayList<>();
		int rest = number; 
		do { 
			ziffern.add(rest % 10); 
			rest /=  10;
		}while(rest >  0);
		
		return ziffern;
	}

}
