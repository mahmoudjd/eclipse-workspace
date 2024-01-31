package generics;

import java.util.List;

interface Portable {
	public int getWeight();
}

public class SuperExample {

	public static void subList(List<? extends Portable> src, 
			/** List<? extends Portable> */ 
			List<? super Portable> dest, double maxWeight) {
		
		for (Portable portable: src) {
			if (portable.getWeight() < maxWeight) {
				// dest.add(portable); // SyntaxFehler
				dest.add(portable);
			}
		}
	}
}
