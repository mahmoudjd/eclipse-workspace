package Abgabe6;

public class Main {
	public static void main(String[] args) {
		Auto car = new Auto(0,5,50,30);
		System.out.println(car.toString());
		car.fahren(300);
		car.info();
		car.tanken(25);
		car.info(); 
		OmniBus bus = new OmniBus(0,10,75,50,35);
		System.out.println(bus.toString());
	}
}
