package debugging;

public class DivisionByZero
{

    @SuppressWarnings("unused")
    public static void main(String args[])
    {

        try
        {

            // int
             int intResult1 = 10 / 0; // Exception
             int intResult2 = 0 / 0; // Exception
             int intResult3 = (int) (10 / 0.0f); // Integer.MaxValue
             int intResult4 = (int) (0 / 0.0f);  //   0

            // float
             float floatResult1 = 10.0f / 0;     //infinity
             float floatResult2 = 10.0f / 0.0f;  // infinity
             float floatResult3 = 0.0f / 0;      // Keine Zahl
             float floatResult4 = 0.0f / 0.0f;   // Keine Zahl
             float floatResult5 = 10 / 0.0f;     // Infinity
             float floatResult6 = 0 / 0.0f;      // Keine Zahl

            // char
            char a = 'a';                 // a
            char b = '\0';                // leeres Buchstabe
            System.out.println(a / 0);    //Exception
            System.out.println(b / 0);    //Exception
            System.out.println(a / b);    // Exception  a / nichts
            System.out.println(b / 0.0);  // Keine Zahl (Not a Number)
        }
        catch (ArithmeticException e)
        {
            System.out.println("Es darf nicht durch 0 geteilt werden!");
        }

    }
}
