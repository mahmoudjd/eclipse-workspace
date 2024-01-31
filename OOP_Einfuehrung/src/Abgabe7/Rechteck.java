package Abgabe7;

/****
 * Aufgabe_3 c)
 *****/

public class Rechteck extends GeomObjekt
{
    @SuppressWarnings("unused")
    private double l, b;

    Rechteck(double x, double y, double l, double b)
    {
        super(x, y);
        this.b = b;
        this.l = l;
    }

    void print()
    {
        System.out.println("Recheck");
    }

}
