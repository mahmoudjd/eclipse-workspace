package ten;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class TwoDimArray implements Iterable<Integer>
{

    private int cols;

    private ArrayList<ArrayList<Integer>> matrix;

    public TwoDimArray(int size)
    {
        matrix = new ArrayList<>(size);

    }

    public ArrayList<ArrayList<Integer>> getMatrix()
    {
        return matrix;
    }

    @Override
    public Iterator<Integer> iterator()
    {
        return new ColsArrayList(cols);
    }

}

class ColsArrayList implements Iterator<Integer>
{
    private int index = 0;

    private int column;

    public ColsArrayList(int column)
    {
        this.column = column;
    }

    @Override
    public boolean hasNext()
    {

        return index <= column;
    }

    @Override
    public Integer next()
    {
        if (hasNext())
        {
            return index++;
        }

        throw new NoSuchElementException();
    }

}