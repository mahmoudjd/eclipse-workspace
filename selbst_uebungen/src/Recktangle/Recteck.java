package Recktangle;

public class Recteck {

	public static void main(String[] args) {

		reckt room1 = new reckt(10, 50);
		reckt room2 = new reckt(30, 70);
		room2 = room1;
		// System.out.println(room1.get_len());
		// System.out.println(room2.get_wid());
		if (room1.isEqual(room2)) {
			System.out.println("The oject are equal");
		} else {
			System.out.println("The objects are not equal");
		}
	}

}
