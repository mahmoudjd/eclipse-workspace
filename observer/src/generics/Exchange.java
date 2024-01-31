package generics;

public class Exchange /* <T> */ {

	public static <T> void exchange(GenericClass<T> o1, GenericClass<T> o2) {
		T content1 = o1.getContent();
		T content2 = o2.getContent();

		o1.setContent(content2);
		o2.setContent(content1);
	}

	public static void main(String[] args) {
		GenericClass<String> hallo = new GenericClass<String>();
		hallo.setContent("hallo");
		GenericClass<String> welt = new GenericClass<String>();
		welt.setContent("welt");
//		Exchange<String> eString = new Exchange<String>();
//		eString.exchange(hallo, welt);
//		GenericClass<Integer> i1 = new GenericClass<Integer>();
//		i1.setContent(47);
//		GenericClass<Integer> i2 = new GenericClass<Integer>();
//		i2.setContent(11);
//		Exchange<Integer> eInteger = new Exchange<Integer>();
//		eInteger.exchange(i1, i2);

		GenericClass<Integer> i1 = new GenericClass<Integer>();
		i1.setContent(47);
		GenericClass<Integer> i2 = new GenericClass<Integer>();
		i2.setContent(11);
		// Exchange e = new Exchange();
		Exchange.exchange(hallo, welt);
		Exchange.exchange(i1, i2);
	}
}
