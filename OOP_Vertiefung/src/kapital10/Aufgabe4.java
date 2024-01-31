package kapital10;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Aufgabe4 {

	public static void main(String[] args) {
	
		List<String> list = new LinkedList<>();
		list.add("One");
		list.add("Two");
		Collections.addAll(list, "Three","Four","Four","Five");
		for(int i = 0 ; i <list.size() ; i++)
		{
			String s = list.get(i);
			if(s.equals("Four"))
			{
				list.remove(i);
				//i--; // next Element in the index i because array.length -= 1
			}
			
		}
		
		System.out.println("=".repeat(40));
		System.out.println(list);
		System.out.println("=".repeat(40));
		
		System.out.println("Einfügen::::");
		
		for (int i = 0 ; i <list.size(); i++)
		{
			String s = list.get(i);
			if(s.equals("Two")) {
				//i++; // um endlose Schleife zu vermeiden
				list.add(i, "einhanlb");
			}
		}
		System.out.println("=".repeat(40));
		System.out.println(list);
		System.out.println("=".repeat(40));
		

	}

}

class Aufgabe4TeilB{
	public static void main(String[] args) {
		List <String> list = new LinkedList<>();
		Collections.addAll(list, "One","Two", "Three", "Four","Four","Five");
	
			for(Iterator<String> iter = list.iterator(); iter.hasNext();)
			{
				String s= iter.next();
				System.out.println(s);
				if(s.equals("Four"))
				{
					iter.remove();
				}
			}

			System.out.println("=".repeat(40));
			System.out.println(list);
			System.out.println("=".repeat(40));
			
	}
}
