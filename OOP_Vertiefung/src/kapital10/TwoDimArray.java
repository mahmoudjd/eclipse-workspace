package kapital10;

import java.util.Iterator;

public class TwoDimArray implements Iterable<Integer> {

	int indexI;
	int[][] feld;

	public TwoDimArray(int[][] feld) {

		this.feld = new int[feld.length][];

		for (int i = 0; i < feld.length; i++) {
			this.feld[i] = feld[i].clone();
		}

	}

	@Override
	public Iterator<Integer> iterator() {
		return new ElementsArray(this.feld[indexI], indexI);
	}

	public static void main(String[] args) {
		
	
	}
}

class ElementsArray implements Iterator<Integer> {
	private int index;
	int[] array;

	public ElementsArray(int[] array, int index) {
		this.index = index;

		this.array = new int[array.length];

	}

	@Override
	public boolean hasNext() {

		return index <= array.length - 1;
	}

	@Override
	public Integer next() {
		// TODO Auto-generated method stub
		return index++;
	}
}
