package oop.three;

public class Main2
{
    public static int times(int a, int b)
    {
        int x = a;
        int y = b;
        int result = x * y;
        return result;
    }
    
    public static void main(String [] args)
    {
        int r =times(2,10);
        System.out.println("Ergebnis: "+r);
    }

}
