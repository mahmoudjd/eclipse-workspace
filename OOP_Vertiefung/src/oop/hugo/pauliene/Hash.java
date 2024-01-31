package oop.hugo.pauliene;

import java.util.HashMap ; 

public class Hash {

	@SuppressWarnings("unchecked")
    public static void main(String [] args ) { 

//		int a = 10 ;
//		int b = 3 ; 
//		int c = 88 ; 
		
		@SuppressWarnings("rawtypes")
        HashMap<String, Integer> happy = new HashMap() ;
		
		happy.put("a", 10)  ; 
		happy .put ("b" , 3  ) ;
		happy.put("c" , 88) ; 
		
		System.out.println(happy.get("c")) ; 
		
		
	}
	
}
