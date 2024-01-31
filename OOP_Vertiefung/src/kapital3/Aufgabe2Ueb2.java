package kapital3;

public class Aufgabe2Ueb2
{
    public static int plus(int a, int b)
    {
        return a + b;
    }

    public static int minus(int a, int b)
    {
        int result = a - b;
        return result;
    }

    public static int times(int a, int b)
    {
        int x = a;
        int y = b;
        int result = x * y;
        return result;
    }

    // computes (a + b)**2
    public static int binom1(int a, int b)
    {
        int sum = plus(a, b);
        int result = times(sum, sum);
        return result;
    }

    // computes a**2 + 2*a*b + b**2
    public static int binom2(int a, int b)
    {
        int aSquare = times(a, a); // cs3
        int bSquare = times(b, b); // cs4
        int ab = times(a, b); // cs5
        int abDouble = times(ab, 2);// cs6
        int result = plus(aSquare, abDouble);// cs7
        result = plus(result, bSquare);// cs8
        return result;
    }

    public static void main(String[] args)
    {
        int x = 5;
        int y = 6;
        int r1 = binom1(x, y); // cs1
        System.out.println("Ergebnis von binom1(" + x + ", " + y + "): " + r1);
        int r2 = binom2(x, y); // cs2
        System.out.println("Ergebnis von binom2(" + x + ", " + y + "): " + r2);
        int fak = times(times(times(times(times(1, 2), 3), 4), 5), 6);
        System.out.println(" 6! = " + fak);
    }
}
