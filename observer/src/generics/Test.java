package generics;

import java.util.ArrayList;

class A{
	
}

interface I1{
	
}

interface I2{
	
}

class B {
	
}

class C {
	public void m(ArrayList<A> list) { 
		
	}
//  Error m(ArrayList<> list)
//	public void m(ArrayList<B> list) { 
//		
//	}

}

// after & must be interface
class GenericC1 <T extends A & I1 & I2> {
	
}

class D<T1, T2>{
	
}

public class Test {

}
