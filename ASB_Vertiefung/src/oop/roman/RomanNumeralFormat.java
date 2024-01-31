package oop.roman;

public class RomanNumeralFormat
{

    public static String toString(int wert)
    {
        if (wert <= 0 || wert >= 4000)
        {
            throw new NumberFormatException();
        }
        String ergebnis = "";

        String[] romZahlen =
        { "I", "V", "X", "L", "C", "D", "M" };

        int test = wert;
        for (; test >= 1000; test -= 1000)
        {
            ergebnis += romZahlen[6];
        }
        for (; test >= 900; test -= 900)
        {
            ergebnis += romZahlen[4] + romZahlen[6];
        }
        for (; test >= 500; test -= 500)
        {
            ergebnis += romZahlen[5];
        }
        for (; test >= 400; test -= 400)
        {
            ergebnis += romZahlen[4] + romZahlen[5];
        }
        for (; test >= 100; test -= 100)
        {
            ergebnis += romZahlen[4];
        }
        for (; test >= 90; test -= 90)
        {
            ergebnis += romZahlen[2] + romZahlen[4];
        }
        for (; test >= 50; test -= 50)
        {
            ergebnis += romZahlen[3];
        }
        for (; test >= 40; test -= 40)
        {
            ergebnis += romZahlen[2] + romZahlen[3];
        }
        for (; test >= 10; test -= 10)
        {
            ergebnis += romZahlen[2];
        }
        for (; test >= 9; test -= 9)
        {
            ergebnis += romZahlen[0] + romZahlen[2];
        }
        for (; test >= 5; test -= 5)
        {
            ergebnis += romZahlen[1];
        }
        for (; test >= 4; test -= 4)
        {
            ergebnis += romZahlen[0] + romZahlen[1];
        }
        for (; test >= 1; test -= 1)
        {
            ergebnis += romZahlen[0];
        }
        return ergebnis;
    }

    public static int parse(String s)
    {
        int x = 0;

        char lastChar = ' ';

        for (int i = s.length() - 1; i >= 0; i--)
        {

            switch (s.charAt(i))
            {
                case 'I':
                    if (lastChar == 'X' || lastChar == 'V')
                    {
                        x -= 1;
                    }
                    else if (lastChar == 'M' || lastChar == 'D' || lastChar == 'C' || lastChar == 'L')
                    {

                        throw new NumberFormatException();
                    }
                    else if (x % 10 == 3 && lastChar == 'I')
                    {
                        throw new NumberFormatException();
                    }
                    else
                    {
                        x += 1;
                    }
                    break;
                case 'V':
                    x += 5;
                    break;
                case 'X':
                    if (lastChar == 'C' || lastChar == 'L')
                    {
                        x -= 10;
                    }
                    else if (lastChar == 'M' || lastChar == 'D')
                    {

                        throw new NumberFormatException();
                    }
                    else if (x % 100 >= 30 && lastChar == 'X')
                    {
                        throw new NumberFormatException();
                    }
                    else
                    {
                        x += 10;
                    }
                    break;
                case 'L':
                    x += 50;
                    break;
                case 'C':
                    if (lastChar == 'M' || lastChar == 'D')
                    {
                        x -= 100;
                    }
                    else if (x % 1000 >= 300 && lastChar == 'C')
                    {
                        throw new NumberFormatException();
                    }
                    else
                    {
                        x += 100;
                    }
                    break;
                case 'D':
                    x += 500;
                    break;
                case 'M':
                    if ((x % 10000 >= 3000) && lastChar == 'M')
                    {
                        throw new NumberFormatException();
                    }
                    if ((x > 1000) && lastChar == 'C')
                    {
                        throw new NumberFormatException();
                    }
                    x += 1000;
                    break;

                default:
                    throw new NumberFormatException();
            }

            lastChar = s.charAt(i);
        }

        return x;

    }

    public static void main(String[] args)
    {

        long startTime = System.currentTimeMillis();
        for (int i = 1; i < 4000; i++)
        {
            System.out.println("Roman: " + RomanNumeralFormat.toString(i)); //
            // MMMCMXCIX

            System.out.println("Arabic: " + RomanNumeralFormat.parse(toString(i)));

        }
        long endTime = System.currentTimeMillis();
        long elapsed = endTime - startTime;
        System.out.println("====Time : " + elapsed + "ms");
    }
}
