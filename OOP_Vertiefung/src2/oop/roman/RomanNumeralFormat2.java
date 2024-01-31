package oop.roman;

public class RomanNumeralFormat2
{
    public static String toString(int x)
    {

        if (x <= 0 || x >= 4000)
        {
            throw new NumberFormatException();
        }

        String[] romZahlen =
        { "I", "V", "X", "L", "C", "D", "M" };
        String ergebnis = "";

        if (x >= 1000)
        {
            if (x > 1000)
            {
                x -= 1000;
                ergebnis = romZahlen[6] + toString(x);
            }
            else
            {
                ergebnis = romZahlen[6];
            }
        }
        else if (x >= 900)
        {
            if (x > 900)
            {
                x -= 900;
                ergebnis = romZahlen[4] + romZahlen[6] + toString(x);
            }
            else
            {
                ergebnis = romZahlen[4] + romZahlen[6];
            }
        }
        else if (x >= 500)
        {
            if (x > 500)
            {
                x -= 500;
                ergebnis = romZahlen[5] + toString(x);
            }
            else
            {
                ergebnis = romZahlen[5];
            }
        }
        else if (x >= 400)
        {
            if (x > 400)
            {
                x -= 400;
                ergebnis = romZahlen[4] + romZahlen[5] + toString(x);
            }
            else
            {
                ergebnis = romZahlen[4] + romZahlen[5];
            }
        }
        else if (x >= 100)
        {
            if (x > 100)
            {
                x -= 100;
                ergebnis = romZahlen[4] + toString(x);
            }
            else
            {
                ergebnis += romZahlen[4];
            }
        }
        else if (x >= 90)
        {
            if (x > 90)
            {
                x -= 90;
                ergebnis = romZahlen[2] + romZahlen[4] + toString(x);
            }
            else
            {
                ergebnis = romZahlen[2] + romZahlen[4];
            }
        }
        else if (x >= 50)
        {
            if (x > 50)
            {
                x -= 50;
                ergebnis = romZahlen[3] + toString(x);
            }
            else
            {
                ergebnis = romZahlen[3];
            }
        }
        else if (x >= 40)
        {
            if (x > 40)
            {
                x -= 40;
                ergebnis = romZahlen[2] + romZahlen[3] + toString(x);
            }
            else
            {
                ergebnis = romZahlen[2] + romZahlen[3];
            }
        }
        else if (x >= 10)
        {
            if (x > 10)
            {
                x -= 10;
                ergebnis = romZahlen[2] + toString(x);
            }
            else
            {
                ergebnis += romZahlen[2];
            }
        }
        else if (x >= 9)
        {
            if (x > 9)
            {
                x -= 9;
                ergebnis = romZahlen[0] + romZahlen[2] + toString(x);
            }
            else
            {
                ergebnis = romZahlen[0] + romZahlen[2];
            }
        }
        else if (x >= 5)
        {
            if (x > 5)
            {
                x -= 5;
                ergebnis = romZahlen[1] + toString(x);
            }
            else
            {
                ergebnis = romZahlen[1];
            }
        }
        else if (x >= 4)
        {
            if (x > 4)
            {
                x -= 4;
                ergebnis = romZahlen[0] + romZahlen[1] + toString(x);
            }
            else
            {
                ergebnis = romZahlen[0] + romZahlen[1];
            }
        }
        else if (x >= 1)
        {
            if (x > 1)
            {
                x -= 1;
                ergebnis = romZahlen[0] + toString(x);
            }
            else
            {
                ergebnis = romZahlen[0];
            }
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
                    if((x> 1000) && lastChar == 'C' )
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

        System.out.println(RomanNumeralFormat2.toString(3333));
        System.out.println(RomanNumeralFormat2.parse("MMMCCCXXXIII"));

    }

}
