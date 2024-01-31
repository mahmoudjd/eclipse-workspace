package nein.tmp;

interface Ex
{
    public int m(int i);
}

interface OtherEx
{
    public int otherM(int i);
}

public class MyClass
{
    public void method(Ex ex)
    {
        System.out.println(ex.m(100));
    }

    public void method(OtherEx ex)
    {
        System.out.println(ex.otherM(100));
    }

    public static void main(String[] args)
    {
        // a
        MyClass mc = new MyClass();
        mc.method((OtherEx) i -> i + 1);

        // b
        Ex ex = s -> s + 1;
        Object o = ex;
        OtherEx oEx = (OtherEx) o;
        oEx.otherM(17);
    }
}
