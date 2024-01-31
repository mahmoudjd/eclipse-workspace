package Erben;

public class DWTable extends woodtable {
	private DesignerAnnotation da ;
	
	public DWTable(byte pices, float price, float weight ,byte tshape, byte tlegs, byte tfunc,DesignerAnnotation da  ) {
		super(pices, price ,weight, tshape, tlegs ,tfunc);
		this.da = da;
	}
	
	public String toString () {
		return da.generateString(super.toString());
	}

}
