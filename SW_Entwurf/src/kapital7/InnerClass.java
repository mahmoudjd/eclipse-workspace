package kapital7;

class InnerClassTest {
	private int a;
	private static int b;

	class InnerClass {
		void doit() {
			setA(5); // darf auf private-Attribute zugreifen
			setB(7);
		}
	}

	static class StaticInnerClass {
		void doit() {
			// a = 5; // Fehler: static reference to non-static field
			setB(7); // ok
		}
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public static int getB() {
		return b;
	}

	public static void setB(int b) {
		InnerClassTest.b = b;
	}
}