package uebung2;

public class Suchelinear
{
    // Aufgabe 2.5 - Lineare Suche

    public static int vergleiche = 0;

    public static int sucheLinear(int[] a, int gesucht)
    {
        int n = a.length;
        int i = 0;
        while (i < n && a[i] != gesucht)
        {
            i++;
            vergleiche++;
        }
        if (i < n)
        {

            // Element gefunden
            System.out.println("Element gefunden an Stelle " + i);
            vergleiche++;
            return i;
        }
        else
        {
            // Element nicht gefunden
            System.out.println("Element nicht gefunden");
            return -1;
        }
    }

    public static void main(String args[])
    {

        int b[] = new int[1000];
        for (int i = 0; i < b.length; i++)
            b[i] = 2 * i;

        int zahl = Integer.parseInt(args[0]);

        vergleiche = 0;
        sucheLinear(b, zahl);
        System.out.println("Anzahl Vergleiche bei linearer Suche: " + vergleiche + "\n");
    }

}
