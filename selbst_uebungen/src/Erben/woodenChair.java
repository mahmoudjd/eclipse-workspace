package Erben;

public class woodenChair extends WoodFurniture {
	private byte chshape;
	private byte chlegs;
	
	public woodenChair(byte pices, float price , float weight , byte chshape, byte chlegs) {
		super (pices, price ,weight);
		this.chshape =chshape;
		this.chlegs = chlegs;
	}
	public String toString () {
		return "chair with shape "+chshape+ "and "+chlegs+ ", "+super.toString();
		
	}

}
