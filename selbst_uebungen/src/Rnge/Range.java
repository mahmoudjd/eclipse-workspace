package Rnge;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Range implements Iterable<Integer>{
	private final int begin , end ;
	
	public Range (int begin , int end ) {
		assert begin <= end;
		this.begin = begin ; 
		this.end= end;
	}
	@Override 
	public Iterator <Integer > iterator(){
		return new RangeIterator(begin,end);
		
	}
	private static final class RangeIterator implements Iterator<Integer>{
		private int position;
		private final int end ;
		public RangeIterator (int begin , int end) {
			this.position= begin;
			this.end = end;
		}
		@Override 
		public boolean hasNext() {
			return this.position < this.end;
		}
		@Override 
		public Integer next() {
			if (!this.hasNext())
				throw new NoSuchElementException();
			return this.position++;
		}
	}
	public static void main(String[] args) {
		Range r = new Range (1,10);
		for(Integer curr : r)
			System.out.println(curr);
	}
}