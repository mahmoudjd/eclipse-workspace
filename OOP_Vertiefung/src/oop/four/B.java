package oop.four;

interface I
{
}

interface J extends I
{
}

class A implements I
{

}

class B extends A implements J
{

}

class Main{
    @SuppressWarnings("unused")
    public static void main(String[] args)
    {
        A b = new B() ;
        B a = (B) new A() ;
        
        J j = (B) Dummy.createObject();
    }
}