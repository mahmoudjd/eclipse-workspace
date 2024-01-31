package kapital8;

public class StackGeneric<T>
{

    private int index;

    private Object[] stack;

    public StackGeneric(int size)
    {

        index = 0;
        stack = new Object[size];
    }

    public void push(T element)
    {
        if (index == stack.length)
        {
            Object[] newStack = new Object[stack.length * 2];

            for (int i = 0; i < stack.length; i++)
            {
                newStack[i] = stack[i];
            }

            stack = newStack;
        }
        stack[index] = element;
        index++;
    }

    public T pop()
    {
        if (index == 0)
        {
            throw new IllegalArgumentException("Stack is leer!");
        }
        @SuppressWarnings("unchecked")
        T top = (T) stack[index - 1];
        stack[index - 1] = null;
        index--;
        return top;
    }

}
