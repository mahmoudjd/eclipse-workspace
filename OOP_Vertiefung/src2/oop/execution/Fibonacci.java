package oop.execution;

public class Fibonacci
{
    public static long fib(int n)
    {
        if (n < 0)
        {
            throw new IllegalArgumentException("Argument zu klein!");
        }
        
        if (n == 1 || n == 0)
        {
            return n;
        }
        
        long fib1 = fib(n - 1);
        
        long fib2 = fib(n - 2);
        
        long res = fib1 + fib2;
        
        if (res < 0)
        {
            throw new IllegalArgumentException("Argument zu groß");
        }
        
        return res;
    }

    public static long fib2(int x)
    {
        if (x < 0)
        {
            throw new IllegalArgumentException("Argument zu klein");
        }
        
        long a = 0;
        long b = 1;
        
        for (int i = 1; i < x; i++)
        {
            long res = a + b;

            if (res < 0)
            {
                throw new IllegalArgumentException("Argument zu groß");
            }
          
            a = b;
            b = res;
        
        }

        return b;
    }

    public static void main(String[] args)
    {
        for (int i = 0; i <= 50; i++)
        {
            try
            {

                long startTime = System.currentTimeMillis();

                System.out.println("fib(" + i + ") = " + fib(i));

                long endTime = System.currentTimeMillis();

                long elapsedTime = endTime - startTime;

                System.out.println(" ==== Dauer: " + elapsedTime / 1000 + " s");

            }
            catch (IllegalArgumentException e)
            {

                System.out.println("fibrekursiv(" + i + "): Ausnahme: " + e.getMessage());

            }

            try
            {
                long startTime = System.currentTimeMillis();

                System.out.println("fib2(" + i + ") = " + fib2(i));

                long endTime = System.currentTimeMillis();

                long elapsedTime = endTime - startTime;

                System.out.println(" ==== Dauer: " + elapsedTime / 1000 + " s");

            }
            catch (IllegalArgumentException e)
            {

                System.out.println("fibiterativ(" + i + "): Ausnahme: " + e.getMessage());

            }

        }
    }
}
