package Abgabe07;

/****
 * Aufgabe_3 a)
 *****/

public abstract class GeomObjekt
{
    @SuppressWarnings("unused")
    private double x, y; // private ist zu einschränkend, x und y sind in Kreis
                         // und Rechteck nicht mehr sichtbar

    GeomObjekt(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    abstract void print();
}
