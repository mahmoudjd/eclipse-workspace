package Abgabe7;

/****
 * Aufgabe_3 a)
 *****/

public abstract class GeomObjekt
{
    @SuppressWarnings("unused")
    private double x, y;

    GeomObjekt(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    abstract void print();
}
