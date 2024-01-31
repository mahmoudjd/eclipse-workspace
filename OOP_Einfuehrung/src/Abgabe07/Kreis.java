package Abgabe07;

/****
 * Aufgabe_3 b)
 *****/

public class Kreis extends GeomObjekt
{
    @SuppressWarnings("unused")
    private double d;

    Kreis(double x, double y, double d)
    {
        super(x, y);
        this.d = d;
    }

    void print()
    {
        System.out.println("Kreis");
    }
}
