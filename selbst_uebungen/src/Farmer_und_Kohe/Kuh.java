package Farmer_und_Kohe;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Kuh implements Comparable<Object> {

	private String name = "";
	private int fa;
	
	public Kuh (String name, int fa) {
		assert name != null;
		this.name = name ;
		 this.fa = fa ;
	}
	
	@Override 
	public int hashCode() {
		return name.hashCode() * 31 + fa;
	}
	@Override 
	public boolean equals(Object ob) {
		if (this == ob)
			return true;
		if (!( ob instanceof Kuh))
			return false ;
		Kuh k = (Kuh)ob;
		return this.name.equals(k.name)&& this.fa == k.fa; 
	}



	@Override
	public int compareTo(Object o) {
		if(! (o instanceof Kuh))
			throw new IllegalArgumentException();
		Kuh kuh = (Kuh) o;
		if (fa == kuh.fa)
			return name.compareTo(kuh.name);
		return fa- kuh.fa;
	}
	
	public Kuh doppelteKuh (List<Kuh> kuehe) {
		Collections.sort(kuehe);
		for(int i =1 ; i < kuehe.size(); i++)
			if (kuehe.get(i).equals(kuehe.get(i-1)))
				return kuehe.get(i);
		return null;
	}
	public Kuh effizient(List<Kuh> kuehe) {
		Set<Kuh> set = new HashSet<>();
		for(Kuh kuh : kuehe) {
			if(set.contains(kuh))
				return kuh;
			set.add(kuh);
		}
		return null;
	}
}
