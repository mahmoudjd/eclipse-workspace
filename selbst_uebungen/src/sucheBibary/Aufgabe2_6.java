package sucheBibary;


import java.util.Scanner;

public class Aufgabe2_6 {

    public static int vergleich;

     public static int binarysearch(int[] arr, int x){
        int len = arr.length;
        int right = len -1;
        int left = 0;
        int mitte;

        while ( right >= left){
           mitte = left +((right -left)/2);
           if ( x == arr[mitte]){
               vergleich++;
               return mitte;
           }
           else if ( arr[mitte]> x){
               vergleich++;
               right = mitte -1;
           }
           else{
               vergleich++;
               left = mitte +1;
           }
       }

       vergleich++;
       return -1;
     }

     public  static int Binaryrec(int[] arr , int x, int left, int right  ){

         int mitte ;
         if(left>right){
             vergleich++;
             return -1;
         }

         mitte= (right +left)/2;

         if (x == arr[mitte]){
             vergleich++;
             return mitte;
         }

         else if (x< arr[mitte]){
             vergleich++;
             return Binaryrec(arr,x,left,mitte-1);
         }

         else {
             vergleich++;
             return Binaryrec(arr, x,mitte+1,right);
         }

     }

     @SuppressWarnings("resource")
    public static void main(String args[]) {
        Scanner s = new Scanner (System.in);
        System.out.println("Gib deinen  Suchwert ein : ");
         int x = s.nextInt();

        int[] array = {1, 2, 3, 5, 6, 7, 8,9,10,100,1000};

        int iter = binarysearch(array,x);

        if(iter!= -1)
           System.out.println("**(Iterativ)**Der Wert ist im Index: "+iter);
        
        else
            System.out.println ("**(Iterativ)**Der Wert wurde nicht gefunden ");

        System.out.println("Die Anzahl der Vergleichsoperationen (Iterativ) : "+vergleich);

        vergleich= 0;

        int recursiv = Binaryrec(array, x,0,array.length-1);

        if(recursiv!= -1)
            System.out.println("**(Rikursiv)**der Wert ist im Index :"+recursiv);
        else
            System.out.println ("**(Rikursiv)**Der Wert wurde nicht gefunden ");

        System.out.println("Die Anzahl der Vergleichsoperationen (Rikursiv) : "+vergleich);
        System.exit(0);
    }
}
