package MyClass;

import java.util.HashMap;

public class MyClass<T,V> {

	T ob1 ; 
	V ob2 ;
 	
	HashMap<T,V> map = new HashMap<>();
	
	MyClass (T ob1 , V ob2){
	
		this.ob1 = ob1 ;
		this.ob2 = ob2 ;

	}
	
	void showType() {
	
		System.out.println(ob1.getClass().getName());
		System.out.println(ob2.getClass().getName());

	}
	
	
}
