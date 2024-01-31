package oop.four;

public class Example
{

    private int i ; 
    public Example(int i)
    {
        this.i = i ; 
    }
    
    public static  boolean isEqual (Example obj1 , Example obj2)
    {
        return obj1.i == obj2.i ;
    }
    
    public static void main(String[] args)
    {
        Example e1 = new Example(1);
        Example e2 = new Example(2);
        System.out.println(isEqual(e1,e2));
    }
}
