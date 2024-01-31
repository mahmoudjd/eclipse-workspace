package kapital7;

/* -------- Uebung 6 ---------- */

public class Aufgabe8
{
    public static void checkMethod(String className, String methodName)
    {
        Exception e = new Exception();
        StackTraceElement[] stack = e.getStackTrace();
        e.printStackTrace(System.out);
        for (StackTraceElement element : stack)
        {
            if (element.getClassName().equals(className) && element.getMethodName().equals(methodName))
            {
                return;
            }
        }

        throw new IllegalStateException();

    }

    public static void main(String[] args)
    {
        X1 x1 = new X1();
        X2 x2 = new X2();
        X3 x3 = new X3();

        try
        {
            x1.entry(x2);
            System.out.println("Aufruf wurde geklappt");
        }
        catch (Exception e)
        {
            System.err.println("Aufruf wurde nicht geklappt!");
        }

        try
        {
            x1.m(x2);
            System.out.println("Aufruf wurde geklappt");
        }
        catch (Exception e)
        {
            System.err.println("Aufruf wurde nicht geklappt!");
        }

        try
        {
            x3.entry(x2);
            System.out.println("Aufruf wurde geklappt");
        }
        catch (Exception e)
        {
            System.err.println("Aufruf wurde nicht geklappt!");
        }

        try
        {
            x3.m(x2);
            System.out.println("Aufruf wurde geklappt");
        }
        catch (Exception e)
        {
            System.err.println("Aufruf wurde nicht geklappt!");
        }

    }

}

class X1
{
    public void entry(X2 x)
    {
        x.entry();
    }

    public void m(X2 x)
    {
        x.m1();
    }
}

class X2
{
    public void entry()
    {
        m1();
    }

    public void m1()
    {
        m2();
    }

    public void m2()
    {
        m3();
    }

    public void m3()
    {
        Aufgabe8.checkMethod("kapitael8.Class1", "entry");
    }
}

class X3
{
    public void entry(X2 x)
    {
        x.entry();
    }

    public void m(X2 x)
    {
        x.m1();
    }
}