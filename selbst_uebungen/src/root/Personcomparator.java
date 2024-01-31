package root;

import java.util.Comparator;

public class Personcomparator implements Comparator<Person>{

	@Override
	public int compare (Person p1, Person p2) {
		if(p1.getPoints()<p2.getPoints())
			return -1;
		if (p1.getPoints()> p2.getPoints())
			return 1;
		else 
			return 0;
	}
}
