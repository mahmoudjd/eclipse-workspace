
package Rnge;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.ArrayList;

public class Range1 implements Iterable<Integer>{
	private final int begin ,end;
	private final ArrayList<Integer> removed =new ArrayList<>();
	
	public Range1(int begin, int end ) {
		assert(begin <= end);
		this.begin = begin ;
		this.end = end;
	}
	@Override 
	public Iterator<Integer> iterator(){
		return new Range1Iterator(begin , end, removed);
		
	}
	
	private static final class Range1Iterator implements Iterator<Integer>{
		private int pos;
		private final int end; 
		private final ArrayList<Integer> removed;
		private boolean removable= false;
		
		public Range1Iterator(int begin , int end , ArrayList<Integer > removed) {
			this.pos= begin ;
			this.end =end;
			this.removed= removed;
		}
		@Override 
		public boolean hasNext() {
			if( this.pos >= this.end)
				return false ;
			int removIndex= removed.indexOf(this.pos);
			if (removIndex == -1)
				return true;
			return removed.size()-removIndex != this.end -this.pos;
		}
		@Override 
		public Integer next() {
			if (!this.hasNext())
				throw new NoSuchElementException();
			removable=true;
			while (removed.contains(this.pos))
				this.pos++;
			return this.pos++;
			
		}
		@Override 
		public void remove() {
			if (!this.removable )
				throw new UnsupportedOperationException();
			removable = false;
			removed.add(pos-1);
			removed.sort(Integer:: compareTo);
		}
	}
	
	public static void main (String [] args) {
		Range range = new Range (1 , 10);
		
		 Iterator <Integer> iterator = range.iterator();
		 Integer curr ;
		 while ( iterator.hasNext ()) 
		 {
	       curr = iterator.next();
	        if ( curr % 2 == 0)
		           iterator.remove();
		 }
		
		 for ( Integer current : range ) {
		      System.out.println(current);
		 }
	
	}
}