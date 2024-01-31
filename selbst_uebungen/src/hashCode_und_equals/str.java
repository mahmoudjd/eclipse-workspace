package hashCode_und_equals;

public final class str {

	private final byte[] values ;
	
	public str(byte ... values) {
		this.values= values;
	}

	@Override 
	public int hashCode() {
		final int prim = 29;
		int hash = 1; 
		for (byte b : values)
			hash = prim * hash +b;
		return hash ;
	}
	
	@Override 
	public boolean equals(Object obj) {
		if (this== obj)
			return true ;
		if (obj == null )
			return false;
		str other = (str)obj ;
		if (getClass()!= obj.getClass())
			return false;
		for(int i = 0; i<values.length;i++) {
		if(values[i]!= other.values[i])
			return false;
		}
		return true;
	}
	@Override 
	 public String toString() {
		return String.valueOf(values);
	}
}