package AltKlausur.GeomObjekt;

public class Kreis extends GeomObjekt
{
    @SuppressWarnings("unused")
    private double d;

    public Kreis(double x, double y, double d)
    {
        super(x, y);
        this.d = d;
    }

    public void Print()
    {
        System.out.println("Kreis");
    }
}
