package oop.retries;

public class OverloadException extends Exception
{
    /**
     * 
     */

    private static final long serialVersionUID = 1L;

    OverloadException()
    {
        super();
    }

    OverloadException(String s)
    {
        super(s);
    }

}

class Video
{

    public static final double OVERLOAD_PROBABILITY = 0.9;

    public static final int PLAY_TIME = 15; // Sekunden

    private void waitSomeTimes(int seconds)
    {
        try
        {
            Thread.sleep(seconds * 1000L);
        }
        catch (InterruptedException i)
        {
            System.out.println("Server Ueberlastet");
        }
    }

    public void play() throws OverloadException
    {
        if (Math.random() < OVERLOAD_PROBABILITY)
        {
            throw new OverloadException();
        }
        waitSomeTimes(PLAY_TIME);
    }

    
}