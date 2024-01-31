package kapital10;

import java.util.*;

class Element {
	private int i;

	public Element(int i) {
		this.i = i;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	@Override
	public String toString() {
		return "" + i;
	}

	@Override
	public boolean equals(Object o) {
		if (o == null) {
			return false;
		}
		if (!(o instanceof Element)) {
			return false;
		}
		/*
		 * oder strenger: if(this.getClass() != o.getClass()) { return false; }
		 */
		Element other = (Element) o;
		return this.i == other.i;
	}

	@Override
	public int hashCode() {
		return Objects.hash(i);
	}
}

public class Aufgabe7 {

	public static void main(String[] args) {
//		Set<Element> sSet = new HashSet<>();
//		Set<Element> sSet = new LinkedHashSet<>();
		Set<Element> sSet = new TreeSet<>((e1, e2) -> e1.getI() - e2.getI());
		Element e1 = null;
		for (int i = 0; i <= 9; i++) {
			if (i == 5) {
				e1 = new Element(5);
				sSet.add(e1);
			}

			sSet.add(new Element(i));
		}

		System.out.println(sSet);
		System.out.println(sSet.contains(e1));

		e1.setI(50);
		System.out.println(sSet);
		System.out.println(sSet.contains(e1));

	}
}
