package kapital10;

import java.util.*;

public class Aufgabe6 {

	public static void main(String[] args) {
		List<Number> list = new ArrayList<>();
		Set<Short> sSet = new LinkedHashSet<>();
		sSet.add((short) 1);
		sSet.add((short) 3);
		sSet.add((short) 2);
		sSet.add(null);

		Set<Integer> iSet = new LinkedHashSet<>();
		iSet.add(Integer.MAX_VALUE - 2);
		iSet.add(Integer.MAX_VALUE - 1);
		iSet.add(null);

		list.addAll(sSet);
		list.addAll(iSet);
		System.out.println(list);

		System.out.println("=".repeat(40));

		list.removeIf((obj) -> Objects.isNull(obj));
		System.out.println(list);

		System.out.println("=".repeat(40));
		list.replaceAll(s ->  111 );
		System.out.println("Ganze Liste: " + list);
	}
}
