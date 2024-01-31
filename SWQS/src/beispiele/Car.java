package beispiele;

import java.util.Date;

public class Car
{
    private Date paintDate = null;

    private String paintWorkShop = null;

    public Car(Date paintDate, String paintWorkshop)
    {
        setPaintDate(paintDate);
        setPaintShop(paintWorkshop);
    }

    public Date getPaintDate()
    {
        return paintDate;
    }

    public void setPaintDate(Date paintDate)
    {
        this.paintDate = paintDate;
    }

    public void setPaintShop(String paintWorkShop)
    {
        this.paintWorkShop = paintWorkShop;
    }

    public String getPaintShop()
    {
        return paintWorkShop;
    }

}
