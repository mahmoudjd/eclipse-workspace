package Generic;

import java.util.*;

interface Portable
{
    public int getWeight();
}

public class SuperExample
{

    public static void copyLighterThan(List<? extends Portable> src,
                                       List<? super Portable> dest,
                                       double maxWeight)
    {
        for (Portable portable : src)
        {
            if (portable.getWeight() < maxWeight)
            {
                dest.add(portable);
            }
        }
    }

    public static void main(String[] args)
    {
        List<Portable1> list1 = new ArrayList<Portable1>();
        List<Portable> list2 = new ArrayList<Portable>();
        // List<Object> list2 = new ArrayList<Object>();
        copyLighterThan(list1, list2, 1.5);
    }
}

class Portable1 implements Portable
{

    @Override
    public int getWeight()
    {
        return 1;
    }

}

class Portable2 implements Portable
{

    @Override
    public int getWeight()
    {
        return 2;
    }
}