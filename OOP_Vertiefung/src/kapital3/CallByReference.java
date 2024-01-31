package kapital3;


class X 
{ 
    int x ; 
    public X (int x)
    {
        this.x = x;
    }
    
    public void setX(int x)
    {
        this.x = x;
    }
    
    public int getX()
    {
        return x;
    }
}


public class CallByReference
{

    public static void method(X x)
    {
        x.setX(47);
        x =null;
        
    }
    public static void main(String[] args)
    {
        X x = new X (4);
     
        method(x);
        
        System.out.println(x.getX());// 47
    }
}
