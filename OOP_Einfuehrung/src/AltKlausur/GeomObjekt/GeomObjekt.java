package AltKlausur.GeomObjekt;

public abstract class GeomObjekt {
    protected double x , y ;
    public GeomObjekt(double x, double y) {
        this.x= x;
        this.y = y ;
    }
    abstract void Print();

}
