package oop.hugo.paul;

public class PlanetSelection
{

    private String[] planets =
    { "Welt", "Mond", "Sonne", "Nepton", "Saturn" };

    /**
     * es wird ein Planet ausfällig ausgewählt
     * @return
     */
    public String getPlanet()
    {

        int index = (int) (Math.random() * planets.length);

        return planets[index];

    }

}
