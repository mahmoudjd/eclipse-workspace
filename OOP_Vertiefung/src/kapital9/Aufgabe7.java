package kapital9;

interface Funktion<T, R> {

	R apply(T t);

	default <V> Funktion<T, V> andThen(Funktion<? super R, ? extends V> fun) {
		return (T t) -> fun.apply(apply(t));
	}

	default <V> Funktion<V, R> compose(Funktion<? super V, ? extends T> fun) {

		return (V v) -> apply(fun.apply(v));
	}

}

public class Aufgabe7 {

	public static void main(String[] args) {

		Funktion<Integer, Integer> f1 = ss -> ss + 1;
		Funktion<Integer, Integer> f2 = ss -> ss * 10;
		Funktion<Integer, Integer> f3 = f1.andThen(f2);
		Funktion<Integer, Integer> f4 = f1.compose(f2); // f1 andThen f2

		System.out.println(f3.apply(1));
		System.out.println(f4.apply(1));
	}

}
