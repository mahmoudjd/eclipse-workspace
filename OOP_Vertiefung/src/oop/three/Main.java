package oop.three;

public class Main
{

    public static int i = 0;

    public static void m1()
    {
        m2(); // cs2
        m3(); // cs3
        m5(); // cs4
    }

    public static void m2()
    {
        m3(); // cs5
        m4(); // cs6
    }

    public static void m3()
    {
        m4(); // cs7
    }

    public static void m4()
    {
        i++;
        System.out.println("das ist der " + i + "te Aufruf vom Methode m4();");

//        new Exception().printStackTrace(System.out);
//        System.out.println("==================");
    }

    public static void m5()
    {
        m3(); // cs8
    }

    public static void main(String[] args)
    {
        m1(); // cs1

    }

}
