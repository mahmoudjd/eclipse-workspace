package First;

import java.math.BigInteger;

public class Overflow
{
    public static int addExact(int x, int y)
    {
        int r = x + y;

        if (((x ^ r) & (y ^ r)) < 0)
        {
            throw new ArithmeticException("My own Integer overflow");
        }

        return r;
    }

    public static void main(String[] argc)
    {
        // Mathematisch gesehen gilt folgendes:
        // a * a / a = a, also 100.000 * 100.000 /100.000 = 100.000
        int a = 100000;
        System.out.println("Ergebnis: " + (a * (a /a) ));
        System.out.println();
        System.out.println("---------------");
        System.out.println();
        int value;
        value = Integer.MAX_VALUE - 1;          
        for (int i = 0; i < 4; i++, value++)     
        {
            System.out.println(value);
        }
        System.out.println("---------------");
        BigInteger largeValue = new BigInteger(Integer.MAX_VALUE + "");
        for (int i = 0; i < 4; i++)
        {
            System.out.println(largeValue);
            largeValue = largeValue.add(BigInteger.ONE);
        }
        System.out.println("---------------");
        value = Integer.MAX_VALUE - 1;
        for (int i = 0; i < 4; i++)
        {
            System.out.println(value);
            value = addExact(value, 1);
            
        }
    }

}
