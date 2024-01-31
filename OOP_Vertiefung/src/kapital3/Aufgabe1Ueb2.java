package kapital3;

public class Aufgabe1Ueb2
{

    public static void m1()
    {
        m2();
        m3();
        m5();
    }

    public static void m2()
    {
        m3();
        m4();
    }

    public static void m3()
    {
        m4();
    }

    public static void m4()
    {
        new Exception().printStackTrace(System.out);
        System.out.println("===========");
    }

    public static void m5()
    {
        m3();
    }

    public static void main(String[] args)
    {
        m1();
    }
}
