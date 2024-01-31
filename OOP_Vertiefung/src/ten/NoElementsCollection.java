package ten;

import java.util.Iterator;

public class NoElementsCollection implements Iterable<Integer>
{
    private int numberOfElements;

    public NoElementsCollection(int numberOfElements)
    {
        this.numberOfElements = numberOfElements;
    }

    @Override
    public Iterator<Integer> iterator()
    {
        return new NoElementsIterator(numberOfElements);
    }

    public static void main(String[] args)
    {
        NoElementsCollection coll = new NoElementsCollection(20);
        for (int i : coll)
        {
            System.out.println(i);
        }
    }
}

class NoElementsIterator implements Iterator<Integer>
{
    private int number;

    private int position = 0;

    NoElementsIterator(int number)
    {
        this.number = number;
    }

    public boolean hasNext()
    {
        if (position < number)
            return true;
        else
            return false;
    }

    public Integer next()
    {
        if (hasNext())
            return position++;
        else
            return null;
    }

}