package kapital10;

import java.util.*;

public class Aufgabe8 {

	public static void main(String args[]) {
		Map<String, Integer> num = new HashMap<>();
		num.put("zwei", 2);
		num.put("drei", 3);
		num.put(null, 4);
		System.out.println(num.get("zwei"));
		System.out.println(num.get(null));
		System.out.println(num.containsKey(null));
		System.out.println(num.containsKey("vier"));
	}
}
