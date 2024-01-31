package AltKlausur;

public class DemoKlasse {
    private int wert;
    public DemoKlasse(int wert){
        this.wert = wert ;
    }
    public int getWert(){
        return this.wert;
    }
    public void setWert(int wert){
        this.wert=wert;
    }
    public DemoKlasse addieren(DemoKlasse obj){
        return new DemoKlasse(this.getWert()+obj.getWert());
    }
    public static void main (String[] args){
        DemoKlasse d1 = new DemoKlasse(4);
        DemoKlasse d2 = new DemoKlasse(2);
        DemoKlasse d3 = d1.addieren(d2);
        System.out.println( d3.getWert());
    }
}
