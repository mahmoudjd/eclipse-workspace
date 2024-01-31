package oop.wordnumerals;

public class WordNumeralFormat1 {

	public static String toString(int x) {

		String s = "";
		String s1 = "";

		if (x < 0) {
			s1 = "- ";
			x *= -1;
		}

		// eine Zahl basteht aus einem Ziffer

		if (x == 0) {
			s = "null";
		}
		if (x == 1) {
			s = "eins";
		}
		if (x == 2) {
			s = "zwei";
		}
		if (x == 3) {
			s = "drei";
		}
		if (x == 4) {
			s = "vier";
		}
		if (x == 5) {
			s = "fünf";
		}
		if (x == 6) {
			s = "sechs";
		}
		if (x == 7) {
			s = "sieben";
		}
		if (x == 8) {
			s = "acht";
		}
		if (x == 9) {
			s = "neun";
		}

		// die Zahl besteht aus mehrere Ziffern

		if (x >= 10) {
			while (x != 0) {
				String s2 = "";
				int y = x % 10;
				if (y < 0 && y > 9) {
					throw new IllegalArgumentException("Nicht Dezimalzahl");
				}
				switch (y) {
				case 0:
					s2 = "null";
					break;
				case 1:
					s2 = "eins";
					break;
				case 2:
					s2 = "zwei";
					break;
				case 3:
					s2 = "drei";
					break;
				case 4:
					s2 = "vier";
					break;
				case 5:
					s2 = "fünf";
					break;
				case 6:
					s2 = "sechs";
					break;
				case 7:
					s2 = "sieben";
					break;
				case 8:
					s2 = "acht";
					break;
				case 9:
					s2 = "neun";
					break;
				default:
					continue;
				}
				if (s.equals("")) {
					s = s2 + s;
				} else {
					s = s2 + " " + s;
				}
				x /= 10;
			}
		}

		if (s1.equals("- ")) {
			s = s1 + s;
		}
		return s;
	}

	public static int parse(String s) {
		int x = 0;

		int y = 1;

		String[] words = s.split(" ");
		int[] arr = new int[words.length];
		if (s.equals("")) {
			throw new NumberFormatException();
		}
		for (int i = 0; i < words.length; i++) {

			arr[i] = 0;

			if (words[i].equals("null")) {
				arr[i] = 0;
			} else if (words[i].equals("eins")) {
				arr[i] = 1;
			} else if (words[i].equals("zwei")) {
				arr[i] = 2;
			} else if (words[i].equals("drei")) {
				arr[i] = 3;
			} else if (words[i].equals("vier")) {
				arr[i] = 4;
			} else if (words[i].equals("fünf")) {
				arr[i] = 5;
			} else if (words[i].equals("sechs")) {
				arr[i] = 6;
			} else if (words[i].equals("sieben")) {
				arr[i] = 7;
			} else if (words[i].equals("acht")) {
				arr[i] = 8;
			} else if (words[i].equals("neun")) {
				arr[i] = 9;
			} else if (words[i].equals("-")) {
				y = -1;
			} else {
				throw new NumberFormatException();
			}
		}

		for (int j = 0; j < arr.length; j++) {

			if ((x * 10) + arr[j] < 0) {
				throw new NumberFormatException();
			} else {
				x = (x * 10) + arr[j];
			}

		}

		if (y == -1) {
			x = x * -1;

		}

		return x;
	}

	public static void main(String[] args) {
		System.out.println(WordNumeralFormat1.toString(0));
		System.out.println(WordNumeralFormat1.parse("zwei vier sieben vier acht drei sechs vier sieben null"));

	}
}
