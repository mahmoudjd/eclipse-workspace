package Abgabe5;

public class Main {

	public static void main(String[] args) {
		Time24 time1 = new Time24() ;
		time1.readTime();
		System.out.println("Die Zeit ist : " +time1.toString());
		time1.writeTime();
		
		
		Time24 time2 =new Time24(14,80);
		System.out.println("Die Zeit ist : " +time2.toString());
		time2.writeTime();
		
		Time24 time3 =new Time24(27,15);
		System.out.println("Die Zeit ist : " +time3.toString());
		time3.writeTime();
		
		Time24 time4 =new Time24(22,150);
		System.out.println("Die Zeit ist : " +time4.toString());
		time4.writeTime();
		System.out.println("die info über die Zeit in Sanfrancisco , Frankfort und Melborn");
		Time24 sanfrancisco= new Time24();
		sanfrancisco.readTime();
		Time24 frankfort =new Time24(sanfrancisco);
		frankfort.addTime(9*60);
		Time24 melborn =new Time24(sanfrancisco);
		melborn.addTime(17*60);
		
		System.out.println("die Zeit in Sanfrancisco ist : "+sanfrancisco.toString());
		System.out.println("die Zeit in Frankfort ist : "+frankfort.toString());
		System.out.println("die Zeit in Melborn ist : "+melborn.toString());
		
		
	}
}
