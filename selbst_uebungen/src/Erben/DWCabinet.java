package Erben;

public class DWCabinet extends WoodenCabinet{
private DesignerAnnotation da;
	public DWCabinet(byte pices, float price, float weight, byte cashape, byte cafunc, DesignerAnnotation da) {
		super(pices, price, weight, cashape, cafunc);
		this.da = da;
	}

	public String toString() {
		return da.generateString(super.toString());
	}
}
