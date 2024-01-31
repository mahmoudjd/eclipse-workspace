package oop.hugo.pauliene;

import java.util.HashMap ;

public class Hash2 {
	
	public static void main( String [] args) {
		
		HashMap <String , String> fun = new HashMap <String, String>();
		
		fun.put("bobbyJoe1996" , "FullyP0nies!");
		fun.put("helloKittyFan21" , "AloeVera?") ; 
		fun.put("coolguyswag", "password123") ; 
		
		System.out.println(fun.replace("bobbyJoe1996","b3tt3rP@ssword!"));
		System.out.println(fun.keySet());
		
	}

}
