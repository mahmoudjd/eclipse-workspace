package generics;

public class GenericsMethods {
	public static <T extends CharSequence> T random(T m, T n) {
		return Math.random() > 0.5 ? m : n;
	}

	public static void main(String[] args) {
		String random1 = random("hallo", "huhu");
		CharSequence random2 = random("hallo", new StringBuilder("huhu"));
		System.out.println(random1 + " - " + random2);
	}
}
