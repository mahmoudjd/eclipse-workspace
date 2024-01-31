package uebung11;

public class GGT
{
    // pre: m> 0 and n> 0
    // post: return > 0 and
    // m@pre.mod(return) = 0 and
    // ...

    public static int ggt(int m, int n)
    {
        int res;
        // n -> m , m-> n
        if (n > m)
        {
            res = m;
            m = n;
            n = res;
        }
        // if res = 0 return den kleinesten Wert
        res = m % n;
        
        while (res != 0)
        {
            m = n;
            n = res;
            res = m % n;
        }
        return n;
    }
}
