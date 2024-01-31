package generics;

class S1 {
}

class S2 extends S1 {
}

class S3 extends S2 {
}

public class Test3 {
	public static void main(String[] args) {
		GenericClass<? super S2> gc;
		gc = new GenericClass<S1>(); // okay
		gc = new GenericClass<S2>();
		
		// gc = new GenericClass<S3>(); // Syntax Error
	
	}
}
