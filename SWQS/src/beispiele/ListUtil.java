package beispiele;

public class ListUtil
{
    /* ausnahmsweise keine main-Methode */

    /* liefert Anzahl der Listenelemente */
    public static int getLength(int[] list)
    {
        if (list == null)
        {
            throw new NullPointerException();
        }
        return list.length;
    }

    /* Pruefung auf leere Liste */
    public static boolean isEmpty(int[] list)
    {
        if (list == null)
        {
            throw new NullPointerException();
        }
        return (list.length == 0);
    }

    /* liefert maximales Element */
    public static int getLargest(int[] list)
    {
        // non-Null
        if (list == null)
        {
            throw new NullPointerException();
        }

        int max = Integer.MIN_VALUE; // *

        if (isEmpty(list))
        {
            throw new RuntimeException("Liste ist leer.");
        }

        for (int i = 0; i < list.length; i++) 
        {
            if (list[i] > max)
            {
                max = list[i];
            }
        }
        return max;
    }

    /* liefert minimales Element */
    public static int getSmallest(int[] list)
    {
        if (list == null)
        {
            throw new NullPointerException();
        }
        int min = Integer.MAX_VALUE;

        if (isEmpty(list))
        {
            throw new RuntimeException("Liste ist leer.");
        }

        for (int i = 0; i < list.length; i++)
        {
            if (list[i] < min)
            {
                min = list[i];
            }
        }
        return min;
    }

}
