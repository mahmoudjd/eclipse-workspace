package debugging;

public class Ferry
{

    // Kapazitäten der Park-Spuren
    private double capLane1, capLane2, capLane3;

//    private boolean full = false;

    private int numOfCars = 0;

    public Ferry(double lane1, double lane2, double lane3)
    {
        this.capLane1 = lane1;
        this.capLane2 = lane2;
        this.capLane3 = lane3;
    }

    public int getNumOfCars()
    {
        return this.numOfCars;
    }

    public void addCar(double length)
    {
//        if (full)
//        {
//            return;
//        }

        // Prüfen, ob Restkapazität-Länge >= 0 ist, also ob das Auto auf Bahn 1
        // noch Platz hat
        if (capLane1 - length >= 0)
        {
            // wenn ja, Auto auf dieser Bahn abstellen
            capLane1 -= length;
            numOfCars++;
            System.out.println("Auto wurde auf Bahn 1 abgestellt.");

            // sonst, d.h. auf Bahn 1 ist kein Platz mehr
        }
        else
        {
            // prüfen, ob auf Bahn 2 noch Platz ist
            if (capLane2 - length >= 0)
            {
                // wenn ja, Auto auf dieser Bahn abstellen
                capLane2 -= length; // = -length;
                numOfCars++;
                System.out.println("Auto wurde auf Bahn 2 abgestellt.");
            }

            // sonst, d.h. auf Bahn 2 ist auch kein Platz mehr
            else
            {
                // prüfen, ob auf Bahn 3 noch Platz ist
                if (capLane3 - length >= 0)
                {
                    // wenn ja, Auto auf dieser Bahn abstellen
                    capLane3 -= length;
                    numOfCars++;
                    System.out.println("Auto wurde auf Bahn 3 abgestellt.");
                }

                // sonst, d.h. es war nirgends mehr Platz
                else
                {
                    System.out.println("F�hre legt ab!");
                    //full = true;
                }
            }
        }
    }

    public static void main(String[] args)
    {
        Ferry ferry = new Ferry(8.2, 10.2, 9.0);
        double[] cars =
        { 2.5, 4.1, 1.4, 5.1, 5.5, 1.9, 5.3, 2.2, 2.5, 1.5, 3.1, 1.8 };

        for (int i = 0; i < cars.length; i++)
        {
            ferry.addCar(cars[i]);
        }

        System.out.println("Anzahl aufgeladener Autos: " + ferry.numOfCars);

    }
}
