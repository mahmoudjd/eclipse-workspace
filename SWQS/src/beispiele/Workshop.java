package beispiele;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Workshop implements Runnable
{
    long localCarsCount = 0;

    int batchSize = 5;

    long sleepIntervall = 500;

    Thread thread = null;

    int sequenceNumber = 0;

    List<Car> paintedCarsList = new ArrayList<Car>();

    @Override
    public void run()
    {
        while (true)
        {
            paintCars();
        }
    }

    public void paintCars()
    {
        for (int i = 0; i < batchSize; i++)
        {
            Car car = new Car(Calendar.getInstance().getTime(), thread.getName());
            paintedCarsList.add(car);
            localCarsCount += 1;
            // String output = thread.getName() + ": #Painted Cars: " +
            // localCarsCount ;
            //
            // System.out.println("localCarsCount: "+ localCarsCount);
            // if(thread.getName().equals("Workshop-2")) {
            // System.out.println(output);
            // }
        }
        try
        {
            Thread.sleep(sleepIntervall);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public int getBatchSize()
    {
        return batchSize;
    }

    public String setBatchSize(int batchSize)
    {
        this.batchSize = batchSize;
        return "batch size set to " + batchSize + ".";
    }

    public long getLocalCarsCount()
    {
        return localCarsCount;
    }

}
