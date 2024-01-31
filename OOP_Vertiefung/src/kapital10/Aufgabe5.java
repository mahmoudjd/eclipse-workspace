package kapital10;

import java.util.*;
public class Aufgabe5 {

	public static void main(String[] args) {
		
		List <Integer > list = new LinkedList<>();
		
		Collections.addAll(list, 1,2,3,4,5,6,7);
		List<Integer> subList = list.subList(0, 3);
		System.out.println("List : " +list);
		System.out.println("Sub List: "+subList);
		subList.add(12);
		System.out.println("=".repeat(20));
		System.out.println("List : " +list);
		System.out.println("Sub List: "+subList);
		
		subList.set(2, 33);
		System.out.println("=".repeat(20));
		System.out.println("List : " +list);
		System.out.println("Sub List: "+subList);
		
		subList.remove(2);
		System.out.println("=".repeat(20));
		System.out.println("List : " +list);
		System.out.println("Sub List: "+subList);
	}
}
