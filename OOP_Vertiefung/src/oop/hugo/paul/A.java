
package oop.hugo.paul;

class AHelp
{

    @SuppressWarnings("unused")
    private int i;

    @SuppressWarnings("unused")
    private String s;

    public AHelp()
    {

    }

}

public class A
{

    public static void main(String[] arguments)
    {

        if (arguments.length != 2)
        {

            System.out.println("2 Argumente nötig : Gruß Anzahl");
            return;

        }

        try
        {

            String greeting = arguments[0];

            int nummer = Integer.parseInt(arguments[1]);

            PlanetSelection ps = new PlanetSelection();

            while (nummer > 0)
            {

                if (nummer % 2 == 0)
                {

                    System.out.println(nummer + " - " + greeting + " " + ps.getPlanet());

                }
                else
                {

                    System.err.println(nummer + " + " + greeting + " " + ps.getPlanet());

                }

                nummer--;

            }

        }

        catch (NumberFormatException n)
        {

            System.out.println("Sie  müssen eine Zahl eingeben! ");

        }

    }

}
