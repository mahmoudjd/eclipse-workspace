package kapital5;

import java.util.ArrayList;
import java.util.List;

public class Node
{
    private int number;

    private List<Node> children;

    public Node()
    {
        children = new ArrayList<Node>();
    }

    public void addChildren(Node child)
    {
        children.add(child);
    }

    public void setRandomNumber()
    {

        number = (int) (Math.random() * 200) - 100;

        for (Node n : children)
        {
            n.setRandomNumber();
        }
    }

    public void print()
    {
        print(0);

    }

    private void print(int depth)
    {

        if (depth == 0)
        {
            System.out.println(number);
        }
        else
        {
            System.out.println("|   ".repeat(depth - 1) + "|..." + number);
        }

        for (Node n : children)
        {
            n.print(depth + 1);
        }
    }

    public int getMin()
    {
        int min = number;
        for (Node n : children)
        {
            if (min >= n.getMin())
                min = n.getMin();
        }
        return min;
    }

    public int countNodes()
    {

        int count = 1;
        for (Node n : children)
        {
            count += n.countNodes();
        }

        return count;
    }

    public int countNumber(int value)
    {
        int count = 0;
        if (number == value)
        {
            count = 1;
        }
        for (Node child : children)
        {
            if (child.number == value)
            {
                count = child.countNumber(value);
            }
            else
            {

                count += child.countNumber(value);
            }
        }
        return count;
    }

    public boolean existsNumber(int value)
    {
        if (countNumber(value) > 0)
        {
            return true;
        }
        return false;
    }
}
