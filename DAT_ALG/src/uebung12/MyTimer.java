package uebung12;

import java.util.Random;

public class MyTimer {
	private static long start;

   public MyTimer() 
   {
	start = System.currentTimeMillis();
   }
	                         
   public static long getElapsed() 
   {
	   return System.currentTimeMillis() - start;
   }
	   
   public static long stop() 
   {
      return System.currentTimeMillis() - start;
   }
	   
   public static long go() 
   {
      start = System.currentTimeMillis();
      return start; 
   }
   public static void main(String[] args) 
   {
		Random zufalligeZahl = new Random(); 
		   int [] timer = new int [100000];
		   for (int i= 0 ; i< timer.length; i++ ) {
			   timer[i]=zufalligeZahl.nextInt(1000);
		   }
		   go();
		   Sort.insertionSort(timer);
		   stop() ;
		   System.out.println();
		   System.out.print( getElapsed());
		   
		   go();
		   Sort.selectionSort(timer);
		   stop() ;
		   System.out.println();
		   System.out.print( getElapsed());
		   
		   
	   
   }
}
