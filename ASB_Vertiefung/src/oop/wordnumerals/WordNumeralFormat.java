package oop.wordnumerals;

public class WordNumeralFormat {
	public static String toString(int x) {
		String res = "";
		String zwerg = "";
		String minus = "";
		if (x == 0) {
			return "null";
		}
		if (x < 0) {
			x *= -1;
			minus = "-";
		}
		while (x != 0) {
			int y = x % 10;
			switch (y) {
			case 0:
				zwerg = "null";
				break;
			case 1:
				zwerg = "eins";
				break;
			case 2:
				zwerg = "zwei";
				break;
			case 3:
				zwerg = "drei";
				break;
			case 4:
				zwerg = "vier";
				break;
			case 5:
				zwerg = "fünf";
				break;
			case 6:
				zwerg = "sechs";
				break;
			case 7:
				zwerg = "sieben";
				break;
			case 8:
				zwerg = "acht";
				break;
			case 9:
				zwerg = "neun";
				break;
			default:
				throw new NumberFormatException();
			}

			if (res.equals("")) {
				res = zwerg + res;
			} else {
				res = zwerg + " " + res;
			}
			x /= 10;
		}

		if (minus.equals("-")) {
			res = minus + " " + res;
		}
		return res;

	}

	public static int parse(String s) {
		int x = 0;

		int z = 0;
		String[] words = s.split(" ");

		int[] zwergArr = new int[words.length];

		for (int i = 0; i < words.length; i++) {
			switch (words[i]) {
			case "null":
				zwergArr[i] = 0;
				break;
			case "eins":
				zwergArr[i] = 1;
				break;
			case "zwei":
				zwergArr[i] = 2;
				break;
			case "drei":
				zwergArr[i] = 3;
				break;
			case "vier":
				zwergArr[i] = 4;
				break;
			case "fünf":
				zwergArr[i] = 5;
				break;
			case "sechs":
				zwergArr[i] = 6;
				break;
			case "sieben":
				zwergArr[i] = 7;
				break;
			case "acht":
				zwergArr[i] = 8;
				break;
			case "neun":
				zwergArr[i] = 9;
				break;
			case "-":
				z = -1;
				break;
			default:
				throw new NumberFormatException();
			}
			x = (x * 10) + zwergArr[i];

		}
		int n = 0;
		for (int i = 0; i < zwergArr.length; i++) {
			if ((n * 10) + zwergArr[i] < 0) {
				throw new NumberFormatException("Die Zahl ist nicht Element von den ganzen Zahlen!");
			} else {
				n = (n * 10) + zwergArr[i];
			}
		}
		if (z == -1) {
			return -x;
		}

		return x;
	}

	public static void main(String[] args) {
		System.out.println(WordNumeralFormat.toString(-59));
		System.out.println(WordNumeralFormat.parse("zwei eins vier sieben vier acht drei sechs vier sechs null"));
	}
}