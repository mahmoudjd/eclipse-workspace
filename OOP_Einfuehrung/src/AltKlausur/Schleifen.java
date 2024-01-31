package AltKlausur;

public class Schleifen {
    public static void main(String [] args){
        int i = 0;
        int j = 0 ;
        for ( i = 0 , j= 1 ; i < 10 ; i++) {
         System.out.println("1: "+ j);
            j += j;
            System.out.println("2: " +j);
        }
        System.out.println(j);

        for (j=0 ; j<10 ; j++)
            j+=j;
        System.out.println("Zweite Schleife : " +j);
    }



}
