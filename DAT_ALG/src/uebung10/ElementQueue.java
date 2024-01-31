package uebung10;

import java.util.*;

public class ElementQueue
{

    private ArrayList<Node> elements;

    public ElementQueue()
    {
        elements = new ArrayList<>();
    }

    public void enqueue(Node e)
    {
        elements.add(e);
    }

    public Node dequeue()
    {
        return (Node) elements.remove(0);
    }

    public boolean isEmpty()
    {
        return elements.isEmpty();
    }

}
