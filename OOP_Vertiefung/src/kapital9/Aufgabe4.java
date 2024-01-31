package kapital9;

interface Example {
	public int m(int i);
}

interface OtherExample {
	public int otherM(int i);
}

public class Aufgabe4 {
	public int method(Example e) {
		return e.m(10);
	}

	public int method(OtherExample o) {
		return o.otherM(100);
	}

	public static void main(String[] args) {
		// a
		Aufgabe4 a = new Aufgabe4();
		System.out.println(a.method((Example) (i -> i + 5))); // ohne Casting geht nicht
		

		// b

//		Example ex = s -> s + 1;
//		Object o = ex;
//		OtherExample oEx = (OtherExample) o;
//		oEx.otherM(17);

	}
}
