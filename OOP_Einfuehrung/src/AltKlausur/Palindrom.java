package AltKlausur;

public class Palindrom
{
    public static boolean istPalindrom(String str)
    {
        int n = str.length() - 1;

        for (int i = 0, j = n; i < j; i++, j--)
        {
            if (str.charAt(i) != str.charAt(j))
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args)
    {
        double a = 3 / 2;
        // boolean f = (2>1) || (2<1) & false ;
        // int s = 3 & 1;
        // int d = 0b0011 & 0b0001;
        System.out.println(a);
        // System.out.println(f);
        System.out.println(istPalindrom("otto"));
    }
}
