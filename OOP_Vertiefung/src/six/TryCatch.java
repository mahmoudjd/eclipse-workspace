package six;
class Exception1 extends NumberFormatException
{
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    Exception1(String s)
    {
        super(s);
    }
}
class Exception2 extends Exception1
{
/**
     * 
     */
    private static final long serialVersionUID = 1L;
String s;
   
    Exception2(String s)
    {
        super(s);
    }
    
}
public class TryCatch
{
    public static void main(String[] args)
    {
        try
        {
            try
            {
                //Codeteil 1 ...
            }
            catch(Exception1 e)
            {
                System.out.println(e);
                //Codeteil 2 ...
            }
            //Codeteil 3 ...
        }
        catch(Exception2 e)
        {
            System.out.println(e);
            //Codeteil 4 ...
        }
    }
}
