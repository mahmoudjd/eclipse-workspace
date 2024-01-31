package First;

public class Overflow1
{
    public static void main(String[] argv)
    {
        int x, y;
        int r;
        x = (int) (-Math.pow(2, 31));
        y = x;
        r = x + y;

        System.out.println("Ausgabe 1: x = " + x);
        // Integer.MIN_VALUE;
        System.out.println("Ausgabe 2: y = " + y);
        // Integer.MIN_VALUE;
        System.out.println("Ausgabe 3: r = " + r + 1);
        // 01 weil es Keine Klammern gibt r = 0 und (+ als Konkatination)
        System.out.println("Ausgabe 4: r = " + (r + 1));
        // 1 , da r = 0 ; und (r + 1 ) = 1

        // Beispiel zur Erklärung
        System.out.println("Hallo" + " " + 1 + " " + 2);
        System.out.println("Hallo" + " " + (1 + 2));
    }
}
