package Erben;

public class woodtable extends WoodFurniture  {
	
	private byte tshape ;
	private byte tlegs ;
	private byte tfunc;
	public woodtable(byte pices, float price, float weight, byte tshape ,byte tlegs, byte tfunc) {
		super (pices, price ,weight);
		this.tshape = tshape;
		this.tlegs = tlegs;
		this.tfunc = tfunc ;
	}
	
	public String toString() {
		return "table with shape "+ tshape + "and "+ tlegs + "func: "+tfunc +", "+super.toString();
	}

}
