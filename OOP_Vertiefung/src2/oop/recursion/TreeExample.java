package oop.recursion;

import java.util.*;

class Node
{
    private int number;

    private List<Node> children;

    public Node()
    {
        children = new ArrayList<Node>();
    }

    public void addChild(Node child)
    {
        children.add(child);
    }

    public void setRandomNumber()
    {
        number = (int) (Math.random() * 200) - 100;
        for (Node child : children)
        {
            child.setRandomNumber();
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
            System.out.println("|  ".repeat(depth - 1) + "|.." + number);
        }
        for (Node child : children)
        {
            child.print(depth + 1);
        }
    }

    public int countNodes()
    {
        int count = 1;
       
        for (Node child : children)
        {
            count += child.countNodes();
        }
        return count;
    }

    public int min()
    {

        int res = number;

        for (Node child : children)
        {
          res = Math.min(res, child.min());
          
        }
        return res;
    }

    public int countNumber(int x)
    {
        int count = 0;

        if (number == x)
        {
            count++;
        }
        for (Node child : children)
        {
            count += child.countNumber(x);
        }
        return count;
    }

    public boolean existsNumber(int value)
    {

        if (number == value)
        {
            return true;
        }
        for (Node child : children)
        {
            if (child.existsNumber(value))
            {
                return true;
            }

        }
        return false;
    }

}

public class TreeExample
{
    public static void main(String[] args)
    {
        Node root = new Node();
        for (int i = 0; i < 3; i++)
        {
            Node gen1 = new Node();
            root.addChild(gen1);
            for (int j = 0; j < 4; j++)
            {
                Node gen2 = new Node();
                gen1.addChild(gen2);
                for (int k = 0; k < 2; k++)
                {
                    Node gen3 = new Node();
                    gen2.addChild(gen3);
                }
            }
        }
        root.print();
        root.setRandomNumber();
        root.print();

        System.out.println(root.countNodes());
        System.out.println(root.min());
        System.out.println(root.existsNumber(-95));
    }
}
