package AltKlausur.GeomObjekt;

public class Rechteck extends GeomObjekt
{
    @SuppressWarnings("unused")
    private double l, b;

    public Rechteck(double x, double y, double l, double b)
    {
        super(x, y);
        this.l = l;
        this.b = b;
    }

    public void Print()
    {
        System.out.println("Recheck");
    }
}
