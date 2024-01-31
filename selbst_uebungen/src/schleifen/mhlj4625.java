package schleifen;

public class mhlj4625
{
    public static int Schleife_1(int n)
    {
        int count = 0;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                count++;
        return count;
    }

    public static int Schleife_2(int n)
    {
        int count = 0;
        for (int i = n; i > 0; i--)
            for (int j = i; j < n; j++)
                count++;
        return count;
    }

    public static int Schleife_3(int n)
    {
        int count = 0;
        for (int i = 1; i <= n / 2; i++)
            for (int j = 1; j < n * n; j++)
                count++;
        return count;
    }

    public static int Schleife_4(int n)
    {
        int i = n;
        int count = 0;
        do
        {
            count++;
            i /= 3;
        }
        while (i > 0);
        return count;
    }

    public static int Schleife_5(int n)
    {
        int count = 0;
        for (int i = 1; i < n; i += 2)
            for (i = 1; i <= n; i++)
                count++;

        return count;

    }

    public static void main(String[] args)
    {
        int n = 10;
        System.out.println("Schleife_1:");
        System.out.println("wenn n= 10 ist, der count =  " + Schleife_1(n));
        n = 100;
        System.out.println("wenn n= 100 ist, der count =  " + Schleife_1(n));
        n = 1000;
        System.out.println("wenn n= 1000 ist, der count =  " + Schleife_1(n));
        System.out.println("Schleife_2:");
        n = 10;
        System.out.println("wenn n= 10 ist, der count =  " + Schleife_2(n));
        n = 100;
        System.out.println("wenn n= 100 ist, der count =  " + Schleife_2(n));
        n = 1000;
        System.out.println("wenn n= 1000 ist, der count =  " + Schleife_2(n));
        System.out.println("Schleife_3:");
        n = 10;
        System.out.println("wenn n= 10 ist, der count =  " + Schleife_3(n));
        n = 100;
        System.out.println("wenn n= 100 ist, der count =  " + Schleife_3(n));
        n = 1000;
        System.out.println("wenn n= 1000 ist, der count =  " + Schleife_3(n));
        System.out.println("Schleife_4:");
        n = 10;
        System.out.println("wenn n= 10 ist, der count =  " + Schleife_4(n));
        n = 100;
        System.out.println("wenn n= 100 ist, der count =  " + Schleife_4(n));
        n = 1000;
        System.out.println("wenn n= 1000 ist, der count =  " + Schleife_4(n));
        System.out.println("Schleife_5:");
        n = 10;
        System.out.println("wenn n= 10 ist, der count =  " + Schleife_5(n));
        n = 100;
        System.out.println("wenn n= 100 ist, der count =  " + Schleife_5(n));
        n = 1000;
        System.out.println("wenn n= 1000 ist, der count =  " + Schleife_5(n));

    }
}
