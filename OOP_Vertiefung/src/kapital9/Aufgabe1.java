package kapital9;

//-----Aufgabe1------//

interface I1
{
    public default void m()
    {
        System.out.println("Default- Methode in Interface");
    }
}

class Klasse1
{
    public void m()
    {
        System.out.println("Normal- Method in Class");
    }
}

public class Aufgabe1 extends Klasse1 implements I1
{
    public static void main(String[] args)
    {
        Aufgabe1 k = new Aufgabe1();
        k.m();
    }
}
