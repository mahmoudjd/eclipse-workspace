package Abgabe9;

public class Artikel
{

    private static int aktuelleNummer = 0;

    private int nummer;

    private String bezeichnung;

    private double preis;

    private int anzahl = 0;

    public Artikel(String bezeichnung, double preis)
    {
        this.bezeichnung = bezeichnung;
        this.preis = preis;
    }

    public int getNummer()
    {
        return this.nummer;
    }

    public String getBezeichnung()
    {
        return this.bezeichnung;
    }

    public double getPreis()
    {
        return this.preis;
    }

    public int getAnzahl()
    {
        return this.anzahl;
    }

    public void einlagern(int anzahl)
    {
        this.anzahl += anzahl;
    }

    public void entnehmen(int anzahl)
    {
        if (this.anzahl >= anzahl)
            this.anzahl -= anzahl;
        else
            // throw new IllegalArgumentException("Die Menge ist nicht
            // genuegend!");
            System.out.println("Die Menge ist nicht genuegend!");
    }

    public boolean istWareOk()
    {
        return true;
    }

    public void print()
    {
        System.out.println("Artikelnummer : " + this.getNummer() + " ,Artikelbezeichnung : " + this.getBezeichnung() + " ,Die vorhandene Menge : " + this.getAnzahl());
    }

    public String toString()
    {
        return "Aktuelle Nummer: " + aktuelleNummer + " ,Artikelnummer:  " + this.getNummer() + " ,Artikelbezeichnung: " + this.getBezeichnung() + " ,Die Preis: " + this.preis + ", die anzahl: " + this.anzahl;
    }
}
