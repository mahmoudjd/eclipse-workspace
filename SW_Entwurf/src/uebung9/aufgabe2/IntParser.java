package uebung9.aufgabe2;

public class IntParser implements Parser<Integer> {

	@Override
	public Integer parse(String line) {
		
		return Integer.valueOf(line);
	}

	
}
