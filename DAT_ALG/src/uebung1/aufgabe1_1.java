package uebung1;

public class aufgabe1_1
{

    public static int schleife1(int n)
    {
        int count = 0;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                count++;
        return count;
    }

    public static int schleife2(int n)
    {
        int count = 0;
        for (int i = n; i > 0; i--)
            for (int j = i; j < n; j++)
                count++;
        return count;
    }

    public static int schleife3(int n)
    {
        int count = 0;
        for (int i = 1; i <= n / 2; i++)
            for (int j = 1; j < n * n; j++)
                count++;
        return count;
    }

    public static int schleife4(int n)
    {
        int count = 0;
        int i = n;
        do
        {
            count++;
            i = i / 3;
        }
        while (i > 0);
        return count;
    }

    public static int schleife5(int n)
    {
        int count = 0;
        for (int i = 1; i < n; i += 2)
            for (int j = 1; j <= n; j++)
                count++;
        return count;
    }

    public static void main(String[] args)
    {
        System.out.println("Werte von n= 1,10 .. 10000 fuer Schleife 1: ");
        System.out.println("Wert fuer k= " + 0 + " : " + schleife1(0));
        for (int k = 1; k <= 1000; k *= 10)
            System.out.println("Wert fuer k= " + k + " : " + schleife1(k));

        System.out.println("Werte von n= 0 .. 10 fuer Schleife 2: ");
        for (int k = 0; k <= 10; k++)
            System.out.println("Wert fuer k= " + k + " : " + schleife2(k));

        System.out.println("Werte von n= 0 .. 10 fuer Schleife 3: ");
        for (int k = 0; k <= 10; k++)
            System.out.println("Wert fuer k= " + k + " : " + schleife3(k));
        System.out.println("Wert fuer k=20 " + schleife3(20));

        System.out.println("Werte von n= 0 .. 10 fuer Schleife 4: ");
        for (int k = 0; k <= 100; k += 10)
            System.out.println("Wert fuer k= " + k + " : " + schleife4(k));

        System.out.println("Werte von n= 1,10,100,1000 fuer Schleife 5: ");
        for (int k = 1; k <= 1000; k *= 10)
            System.out.println("Wert fuer k= " + k + " : " + schleife5(k));

    }

}
