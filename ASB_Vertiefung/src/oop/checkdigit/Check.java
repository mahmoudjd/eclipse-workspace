package oop.checkdigit;

public class Check
{

    private static int querSumme(int x)
    {
        int result = 0;
        while (x != 0)
        {
            result += x % 10;
            x /= 10;
        }
        return result;
    }

    public static int transformToCheckedNumber(int value)
    {
        if (value < 0)
        {
            throw new IllegalArgumentException();
        }
        long y = value;
        if (y * 10 > Integer.MAX_VALUE)
        {
            throw new IllegalArgumentException();
        }
        int test = querSumme(value) % 10;
        if (test == 0)
        {
            value = (10 * value);
        }
        else
        {
            value = (10 - test) + (10 * value);
        }
        if (value < 0)
        {
            throw new IllegalArgumentException();
        }
        return value;
    }

    public static int transformToUncheckedNumber(int value)
    {
        if (value < 0)
        {
            throw new IllegalArgumentException();
        }
        if (querSumme(value) % 10 != 0)
        {
            throw new IllegalArgumentException();
        }
        return value / 10;
    }

    public static void main(String[] args)
    {
        int x = transformToCheckedNumber(1532);
        int y = transformToUncheckedNumber(15329);

        System.out.println(x);

        System.out.println(y);
    }
}
