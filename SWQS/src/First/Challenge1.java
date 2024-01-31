package First;

public class Challenge1
{

    /**
     * Der Gleitkommatyp in Java ist standardmäßig doppelt so hoch, und sowohl
     * 2.00 als auch 1.10 werden im Computer für die binäre Speicherung
     * konvertiert, was Datengenauigkeit beinhaltet. Der Grund für dieses
     * Phänomen ist die Genauigkeit von Gleitkommadaten
     * 
     * Endliche Genauigkeit in der Zahldarstellung
     * 
     * Je mehr größer die zahl ist, desto mehr wird die Genauigkeit verloren 
     */
    public static void main(String[] args)
    {
        System.out.println("Ergebnis 1: " + (2.0 - 1.10));
        // 0.8999999999999999
        double ergebnis2 = 2.0 - 1.10;
        System.out.println("Ergebnis 2: " + ergebnis2);
        // 0.8999999999999999

        float ergebnis3 = (float) (2.00 - 1.10);
        System.out.println("Ergebnis3 : " + ergebnis3);
        //0.9 nicht genau soll 0.90

        int ergebnis4 = 200 - 110;
        System.out.println("Ergebnis4: " + ergebnis4 + " Cent");
        // 90 Cent
    }
}
