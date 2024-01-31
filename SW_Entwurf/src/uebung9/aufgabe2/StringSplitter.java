package uebung9.aufgabe2;

import java.util.*;

public class StringSplitter implements Splitter1 <String, String >{

	@Override
	public List<String> split(String line) { 
		
		return Arrays.asList(line.split("\s+"));
	}
}
