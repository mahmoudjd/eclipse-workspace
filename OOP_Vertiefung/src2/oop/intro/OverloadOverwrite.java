package oop.intro;

class AClass
{
}

class BClass extends AClass
{
}

class X1Class
{
    public void m(AClass a)
    {
        System.out.println("X1Class.m(AClass)");
    }
}

class X2Class extends X1Class
{
    public void m(BClass b)
    {
        System.out.println("X2Class.m(BClass)");
    }
}

class Y1Class
{
    public void m(AClass a)
    {
        System.out.println("Y1Class.m(AClass)");
    }
}

class Y2Class extends Y1Class
{
    public void m(AClass a)
    {
        System.out.println("Y2Class.m(AClass)");
    }
}

public class OverloadOverwrite
{
    public static void main(String[] args)
    {
        //Overloading:
        X1Class x1 = new X1Class();
        x1.m(new AClass());  // m(X1.AClass)
        x1.m(new BClass());  // AClass = new BClass => m(X1.AClass)
        X2Class x2 = new X2Class();
        x2.m(new AClass());  // x2 => x1 =>  m(X1.AClass)
        x2.m(new BClass());  // X2Class.m(BClass)
        x1 = x2;
        x1.m(new AClass()); 
        x1.m(new BClass()); //entscheidend: Aufruf von X1Class.m(AClass)!! =>// X2Class.m(BClass)
        System.out.println(); 
        
        //Overwriting:
        Y1Class y1 = new Y1Class();
        y1.m(new AClass());  //Y1Class.m(AClass)
        y1.m(new BClass());  //Y1Class.m(AClass)
        Y2Class y2 = new Y2Class();
        y2.m(new AClass());  //Y2Class.m(AClass)
        y2.m(new BClass());  //Y2Class.m(AClass)
        y1 = y2;
        y1.m(new AClass());  //Y2Class.m(AClass)
        y1.m(new BClass()); //entscheidend: Aufruf von Y2Class.m(AClass)!!
                            // => //Y2Class.m(AClass)
    }
    
}

