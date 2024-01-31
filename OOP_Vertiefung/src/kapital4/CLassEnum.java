package kapital4;

enum Weekday
{
    Moday, Tuesday, Wedensday, Thursday, Friday, Saturday, Sunday
}

public class CLassEnum
{

    public static void main(String[] args)
    {

        Weekday today = Weekday.Friday;
        Weekday today1 = Weekday.valueOf("Friday");
        // today = today1
        // Weekday tomorrow = Weekday.Saturday;

        System.out.println(today);
        System.out.println(today1);
        System.out.println("============");
        for (Weekday d : Weekday.values())
        {
            System.out.println(d);
        }

    }
}
