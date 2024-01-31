package kapital9;

interface Inter1
{
    public default void methode()
    {
        System.out.println("One");
    }
}

interface Inter2
{
    public void methode();
}

abstract class AbsKlass implements Inter2
{
    public abstract void m();

 }

public class Aufgabe3
{

}
