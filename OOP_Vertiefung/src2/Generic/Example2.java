package Generic;

interface I<E extends Exception>
{
    public void m1() throws E;

    public void m2() throws E;
}

@SuppressWarnings("serial")
class MyException extends Exception
{

}

public class Example2 implements I<MyException>
{

    @Override
    public void m1() throws MyException
    {

    }

    @Override
    public void m2() throws MyException
    {

    }

}
