package six;

public class Aufgabe6
{
    // teil 1
    @SuppressWarnings("finally")
    public static String getX()
    {
        try
        {
            return "hallo";
        }
        finally
        {
            return "huhu";
        }
    }

    // teil 2
    @SuppressWarnings("finally")
    public static int getY()
    {
        while (true)
        {
            try
            {
                return 0;
            }
            finally
            {
                break;
            }
        }
        return 1;
    }

    // teil 3
    @SuppressWarnings("finally")
    public static int getZ()
    {
        try
        {
            throw new Exception();
        }
        finally
        {
            System.out.println("immers ausfuehren");
            return 0;
        }
    }
    
    public static void main(String[] args)
    {
        System.out.println(Aufgabe6.getX());
        System.out.println(Aufgabe6.getY());
        System.out.println(Aufgabe6.getZ());
    }

}
