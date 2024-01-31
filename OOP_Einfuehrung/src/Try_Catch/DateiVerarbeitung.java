package Try_Catch;

import utilities.TastaturEingabe;

public class DateiVerarbeitung
{

    public static void main(String[] args)
    {

        int zahl1, zahl2, zahl3;

        try
        {

            zahl1 = TastaturEingabe.readInt("Gib eine Zahl ein: ");
            zahl2 = TastaturEingabe.readInt("Gib eine Zahl ein: ");
            zahl3 = zahl1 + zahl2;

            System.out.println("Das Ergebnis ist : " + zahl3);

        }

        catch (Exception e)
        {

            System.out.println("Die Eingabe hat nicht funktioniert " + e.toString());

        }

    }

}
