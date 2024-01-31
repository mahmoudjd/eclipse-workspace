package Erben;

public class Main {
	public static int sumOfPrice (WoodFurniture[] fu ) {
		int res = 0;
		for (WoodFurniture x : fu ) {
			res += x.getPecies();
		}
		return res ;
	}

	public static void main (String[] args) {
		
		WoodFurniture [] myfur= new WoodFurniture [3];
		
		myfur[0] = new woodtable((byte )1,15.0f,2.0f,(byte)1,(byte )4,(byte)2);
		myfur[1]= new woodenChair((byte)1, 33.0f, 5.0f, (byte)3, (byte)1);
		myfur[2]= new DWCabinet((byte)0,1000.0f,3.1467f,(byte)0,(byte)2,new DesignerAnnotation("Brilly"));
	
	System.out.println("My Furniture : ");
	for(WoodFurniture f: myfur) {
		System.out.println(f);
	}
	System.out.println("Prices for all: " +sumOfPrice(myfur));
	}

}
