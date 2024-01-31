package debugging;

public class Klasse
{

    public static void main(String[] args)
    {

        int[] numbers = { 0, 2, 3, 5, 10, 17, 40, 44, 55, 99 };

        System.out.println(method(numbers, 0));
        System.out.println(method(numbers, 3));
        System.out.println(method(numbers, 5));
        System.out.println(method(numbers, 17));
        System.out.println(method(numbers, 18));
        System.out.println(method(numbers, 44));
        System.out.println(method(numbers, 55));
        System.out.println(method(numbers, 101));
    }

    // die Funktion methode() mit den zwei Parameters l0 und l4 liefert
    // den Index vom Wert l4, falls l4 im Array l0 gefunden ist und -1 ansonsten
    // Wobei der Array l0 sortiert ist
    // die Suche nach dem Index des Werts ist Suchbinary, d.h.Man teilt den
    // Suchbereich in der Mitte und stellt durch einen Vergleich fest,
    // ob sich das gesuchte Element im unteren oder oberen Intervall befindet,
    // sofern es überhaupt in dem Feld enthalten ist.

    public static int method(int[] l0, int l4)
    {

        int l3, l1 = 0; // l1 die erste index (left) und l3 (mitte)
        int l2 = l0.length - 1; // (right)

        while (l1 <= l2)
        {

            // l3 ist der index, der in der mitte vom Array liegt
            l3 = (l2 + l1) / 2;

            // l5 ist der Wert, der im Index l3 gefunden ist
            int l5 = l0[l3];

            // prüft, ob l4 im unteren Teil des Arrays ist
            if (l0[l3] > l4)
            {
                l2 = l3 - 1;
            }
            // prüft, ob l4 im oberen Teil des Arrays ist
            else if (l5 < l4)
            {
                l1 = l3 + 1;
            }
            if (l5 == l4)
            {
                return l3;
            }
        }

        // Der Wert l4 ist nicht gefunden
        return -1;
    }

}