package debugging;

import java.util.ArrayList;
import java.util.Arrays;

public class Odds
{

    public static void main(String[] args)
    {

        Integer[] array =
        { 1, 6, 7, 8, 9, 12, 13, 19, 24, 25, 27, 30, 31, 32, 33, 36, 37, 41, 42, 47, 50, 51, 52, 54, 55, 56, 57, 60, 61, 63, 65, 67, 71, 72, 73, 74, 77, 78, 80, 81, 84, 86, 87, 88, 90, 90, 91, 92, 92, 95, 99 };
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));

        removeEven(list);
        System.out.println(list);
    }

    public static void removeEven(ArrayList<Integer> arr)
    {
        for (int i = 0; i < arr.size(); i++)
        {
            int num = arr.get(i);
            if (num % 2 == 0)
            {
                arr.remove(i); // in diesem Fall wird die nachste Zahl nicht
                               // getestet , weil size()-=1 und i+=1
                i--;
            }
        }
    }

}
