package kapital9;

interface Int1
{
    public default int sum(int x, int y)
    {
        System.out.println((x+y+1));
        return x + y +1;
    }

}

interface Int2
{
    public default int sum(int x, int y)
    {
       
        x += y;
        x--;
        
        System.out.println(x);
        return x;
    }

}

public class Aufgabe2 implements Int1,Int2
{
    public int sum(int x, int y)
    {
        Int1.super.sum(x, y);
        Int2.super.sum(x, y);
        return x +y;
    }
    
    public static void main(String[] args)
    {
        Aufgabe2 a = new Aufgabe2();
        
        System.out.println(a.sum(1, 3));
    }
}
