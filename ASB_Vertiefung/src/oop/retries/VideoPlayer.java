package oop.retries;

public class VideoPlayer
{
    public static boolean playWithRetries(Video video, int maxWert)
    {

        if (maxWert <= 0)
        {
            return false;
        }
        if (video == null)
        {
            throw new NullPointerException();
        }
        int i = 0;

        while (i < maxWert)
        {
            try
            {
                video.play();
                return true;
            }
            catch (OverloadException o)
            {
                System.out.println(o);
            }
            finally
            {
                i++;
            }
        }
        return false;

    }

}
