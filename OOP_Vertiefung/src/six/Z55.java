package six;



class A5
{
    private B5 b;

    public void setB(B5 b)
    {
        this.b = b;
    }

    public void m1(A5 a)
    {
        m2(a);
    }

    private void m2(A5 a)
    {
        if (a != null)
        {
            b.doSomething(a);
        }
        else
        {
            b.doSomethingElse();
        }
    }

    public void m3()
    {
    }
}

class B5
{
    public void doSomething(A5 a)
    {
        a.m3();
    }

    public void doSomethingElse()
    {
    }
}

public class Z55
{
    public static void main(String[] args)
    {
        A5 a1 = new A5();
        A5 a2 = new A5();
        B5 b = new B5();
        a1.setB(b);
        if (Math.random() < 0.5)
        {
            a1.m1(a1);
        }
        else
        {
            a1.m1(a2);
        }
    }
}

