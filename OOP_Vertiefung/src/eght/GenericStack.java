package eght;

//import java.util.ArrayList;

class StackEmptyException extends Exception
{

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

}

public class GenericStack<T>
{
    private int top;

    private Object[] stack;

    public GenericStack(int initialSize)
    {
        top = 0;
        stack = new Object[initialSize];
        // stack = new ArrayList<T>(initialSize);
    }

    public void push(T o)
    {
        if (top == stack.length)
        {
            // Keller vergroessern auf Doppelte
            Object[] newStack = new Object[2 * stack.length];

            for (int i = 0; i < stack.length; i++)
            {
                newStack[i] = stack[i];
            }
        }
        stack[top++] = o; // stack[top] = o ; top +=1;
    }

    @SuppressWarnings("unchecked")
    public T pop() throws StackEmptyException
    {
        if (top == 0)
        {
            throw new StackEmptyException();
        }

        // hier gibt es eine Warnung
        T result = (T) stack[top - 1];
        stack[top - 1] = null; // garbage collection

        top--;
        return result;

    }

    public static void main(String[] args)
    {
        GenericStack<String> stringStack = new GenericStack<String>(10);

        stringStack.push("welt");
        stringStack.push("hallo");

        // try
        // {
        // String top = stringStack.pop();
        // System.out.println(top);
        // top = stringStack.pop();
        // System.out.println(top);
        //
        // }
        // catch (StackEmptyException e)
        // {
        // e.printStackTrace();
        // }
        //
        // String [] strArray = new String[10];
        // Object [] objArray = strArray;

        // objArray[0] = Integer.valueOf(1);

        // GenericStack<String> ss = new GenericStack<String>(10);
        // GenericClass<Object> so = ss; // CompilerFehler

    }

}
