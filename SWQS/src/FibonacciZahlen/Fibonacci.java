package FibonacciZahlen;

public class Fibonacci
{

    /**
     * Rekursive Implementierung von der Methode fib diese Methode liefert den
     * Fibonacci-Wert von einem gegebenen Parameter
     * 
     * @param n
     *            eine Zahl vom Type int
     * @return einer Wert vom type int , der der Fibonacci-Wert von Zahl n ist
     */
    public static int fib(int n)
    {
        if (n < 0)
        {
            throw new IllegalArgumentException();
        }
        // nach dem TestZero implementiert
        if (n == 0 || n == 1)
            return 1;
        int fib1 = fib(n - 1);
        int fib2 = fib(n - 2);
        int fibResult = fib1 + fib2;
        
        if (fibResult < 0)
        {
            throw new IllegalArgumentException("Big Number");
        }
        return fibResult;
   
    }

    
    
    /**
     * Implementierung von der Methode fib die nicht rekursiv ist,
     * diese Implementierung ist besser und nimmt in Anspruch winiger Zeit als rekursiv
     * @param n
     * @return
     */
    public static int fib2(int n)
    {
        if (n < 0)
        {
            throw new IllegalArgumentException("");
        }


        int a = 0;
        int b = 1;

        for (int i = 1; i <= n; i++)
        {
            int res = a + b;
            if (res < 0)
            {
                throw new IllegalArgumentException("Big Number");
            }
            a = b;
            b = res;
        }

        return b;
    }
}
