package AltKlausur;

public class Fibunacci {

    public static long fib1 (int  n) {
        long n1, n2, i, tmp;
        n1 = n2 = i = tmp = 1;
        if (n < 2)
            return tmp;
        do {
            i += 1;
            tmp = n1 + n2;
            n1 = n2;
            n2 = tmp;
        } while (i <= n);
        return n1 ;
    }

    public static int fibR(int n){
        if (n< 0)
            throw new IllegalArgumentException("Nigative Zahl");
        if (n< 2)
            return 1 ;
        return fibR(n-2)+fibR(n-1);
    }

    public static void main (String[] args){
        /*
        int i= -1 , j = -1;
        short s=-1 ;
        j = j>>>31 ;
        i = i>>> 32 ;
        s >>= 16 ;
        int a = -1, b = 8, c = 3;

        System.out.println ( "nicht a : " + (~a == (a^a )));
        //System.out.println ( "modulo  : " + (b | c) % (b & c));  Error division by zero
        System.out.println ( j);
        System.out.println ( i);
        System.out.println ( s);
        */
        System.out.println ("Fib " + fib1(3));
        System.out.println ("Fib " + fibR(5));
        //System.out.println ("Fib " + fibR(-5));
    }
}
