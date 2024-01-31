package Generic;

class A
{
}

class B extends A
{
}

class X<T>
{
}

class Y<T> extends X<T>
{
}

public class Example3
{

    @SuppressWarnings("unused")
    public static void main(String[] args)
    {
        A a = new B();
        X<A> x1 = new Y<A>();
        X<B> x2 = new Y<B>();
        X<A> x3 = new Y<>();
        X<B> x4 = new Y<>();
        
    }
}
