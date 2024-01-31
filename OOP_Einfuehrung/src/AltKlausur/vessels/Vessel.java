package AltKlausur.vessels;

public abstract class Vessel {
    private int torpedos;
    private double torpedoStrength;
    private int warp ;
    private int integrity ;
    private final String id;

    public Vessel (int  torpedos, double torpedoStrength, int warp, int integrity,String id) {
        this.torpedos =torpedos;
        this.torpedoStrength = torpedoStrength ;
        this.warp = warp ;
        this.integrity= integrity ;
        this.id = id;
    }

    public void hit (Vessel v ){
        this.integrity= this.integrity - (int) (10 * torpedoStrength) ;
    }

    protected void setIntegrity(int  integrity ){
        this.integrity = integrity ;
    }
    public String toString() {
        return "Torpedos : "+this.torpedos + " ,Torpedo Stärke: "+this.torpedoStrength +" ,Geschwendigkeit: "
                + this.warp + " ,Integrität: "+this.integrity +" ID: " +this.id ;
    }
}
