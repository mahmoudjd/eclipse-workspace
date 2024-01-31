package BufferedReader;

import java.util.Comparator;

public class PersonCmp implements Comparator<Person>{
	
	@Override
	public int compare(Person p1, Person p2) {
		if(p1.getPoint()< p2.getPoint())
			return -1;
		if(p1.getPoint()> p2.getPoint())
			return 1;
		return 0;
	}
}
