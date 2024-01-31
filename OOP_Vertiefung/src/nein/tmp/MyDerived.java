package nein.tmp;

interface MyInt
{
    public default void m()
    {
        System.out.println("Hallo");
    }

}

interface MyInt2 // extends MyInt
{
    public default void m()
    {
        System.out.println("Heiße ist es.");
    }
    // public abstract void m(); // mit extends geht ohne Fehler

}

abstract class AbsClass implements MyInt
{

    public abstract void m();
}

class MyBase
{
    public void m()
    {
        System.out.println("Huhu");
    }
}

public class MyDerived /* extends MyBase */ implements MyInt, MyInt2
{
    public void m()
    {
        System.out.println("Moin");
        // super.m();
        MyInt.super.m();
        MyInt2.super.m();
    }

    public static void main(String[] args)
    {
        MyDerived der = new MyDerived();
        der.m();
    }

}
