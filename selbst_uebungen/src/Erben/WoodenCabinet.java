package Erben;

public class WoodenCabinet extends WoodFurniture {

	private byte cashape;
	private byte cafunc;
	
	public WoodenCabinet (byte pices, float price , float weight ,byte cashape ,byte cafunc) {
		super(pices, price, weight );
		this.cashape = cashape;
		this.cafunc = cafunc;
	}
	public String toString () {
		return "Cabinet with Shape "+cashape + "and "+ cafunc+", "+ super.toString();
	}
}
