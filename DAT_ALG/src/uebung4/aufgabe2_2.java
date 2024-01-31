package uebung4;

import  utilities.TastaturEingabe;

public class aufgabe2_2 {
	

	    public static int f(int x,int y)
	    {
	        if (x == 0)
	            return y;
	        
	        else
	            return 1 + f(x-1,y);

	    }

	    public static int g(int x ,int y)
	    {
	        if (x ==0 || y == 0)
	            return 0;
	        else
	            return x +g(x,y-1);
	    }
	    
	    public static void main ( String[] args){
	        
	    	int x = TastaturEingabe.readInt("Gib deinen ersten Wert ein : ");
	         
	        int y = TastaturEingabe.readInt("Gib deinen zweiten Wert ein: ") ;
	        int add =f(x,y);
	        int mul =g(x,y);
	        System.out.println("Die Result von der Addition von "+x+" und "+y+" ist = "+add);
	        System.out.println("Die Result der Multiplikation von "+x+" und "+y+" ist = "+mul);
	    }

	
}
