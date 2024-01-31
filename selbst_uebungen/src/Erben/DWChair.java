package Erben;

public class DWChair extends woodenChair{
 private DesignerAnnotation da;
 public DWChair(byte pices, float price, float weight ,byte tshape, byte tlegs,DesignerAnnotation da ) {
	 super(pices, price ,weight, tshape, tlegs );
	 this.da = da;
 }
 public String toString() {
	 return da.generateString(super.toString());
 }
}
