package debugging;

import java.util.Calendar;

public class CurrentDate
{

    public static void main(String[] args)
    {

        Calendar calendar = Calendar.getInstance();

        // set calendar to current date
        calendar.setTimeInMillis(System.currentTimeMillis());

        int date = calendar.get(Calendar.DATE);
        int month = calendar.get(Calendar.MONTH) ; // +1
        // faengt mit index 0 deshalb im Mai bekommt man 4 statt 5 () 
        
        if ((month == 4 && date >= 12) || (month > 4 )) // ab 4 bis 12 Sommer (&& month <= 8)
        {
            System.out.println("Das Sommersemester hat begonnen.");
        }
        else
        {
            System.out.println("Das Sommersemester beginnt am 12.04.");
        }

    }
}
