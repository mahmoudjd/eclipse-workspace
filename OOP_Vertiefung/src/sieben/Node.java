package sieben;

import java.util.*;

interface ContentHandler<T>
{
    public void handle(T t, int depth);
}

public class Node<T>
{
    private T content;

    private List<Node<T>> children;

    public Node(T t)
    {
        content = t;
        children = new ArrayList<Node<T>>();
    }

    public void add(Node<T> node)
    {
        children.add(node);
    }

    public T getContent()
    {
        return this.content;
    }

    public Iterator<Node<T>> iterator()
    {
        return children.iterator();

    }

    // Allgemeiner zu machen (*)
    public void traverse(ContentHandler<? super T> handler, int depth)
    // public void traverse(ContentHandler<T> handler, int depth)
    {
        handler.handle(content, depth);
        for (Node<T> child : children)
        {
            child.traverse(handler, depth + 1);
        }
    }

    public static void main(String[] args)
    {
        Node<String> root = new Node<String>("h");
        Node<String> node = new Node<String>("e");
        root.add(node);
        node = new Node<String>("l");
        root.add(node);

        Node<String> node2 = new Node<String>("l");
        node.add(node2);

        node2 = new Node<String>("o");
        node.add(node2);

        node = new Node<String>(" ");
        root.add(node);

        node = new Node<String>("w");
        root.add(node);

        node2 = new Node<String>("o");
        node.add(node2);

        node2 = new Node<String>("r");
        node.add(node2);

        Node<String> node3 = new Node<String>("l");
        node2.add(node3);

        node = new Node<String>("d");
        root.add(node);
        // node.add(new Node<String>("!"));

        StringOutputHandler handler1 = new StringOutputHandler();
        root.traverse(handler1, 0);
        System.out.println();

        ObjectOutputHandler handler2 = new ObjectOutputHandler();
        root.traverse(handler2, 0); // um das zu erledigt (*)
        System.out.println();

    }
}

class StringOutputHandler implements ContentHandler<String>
{

    public void handle(String s, int depth)
    {
        System.out.print(s);
    }
}

class ObjectOutputHandler implements ContentHandler<Object>
{

    public void handle(Object obj, int depth)
    {
        System.out.println(" ".repeat(depth) + "'" + obj + "'");
    }
}
