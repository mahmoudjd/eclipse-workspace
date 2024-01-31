package kapital9;

interface MyPradicate<S>
{
    public boolean test(S s);

    public default MyPradicate<S> negate()
    {
        return s -> !test(s);
    }

    public default MyPradicate<S> alwaysTrue()
    {
        return s -> true;
    }

    public default MyPradicate<S> notAlwaysTrue()
    {
        return s -> false;
    }
}

class OldFashionedClass implements MyPradicate<String>
{

    @Override
    public boolean test(String s)
    {
        return s == null || s.length() == 0;
    }

}

@SuppressWarnings("serial")
class NotFoundException extends Exception
{
}

class SomeString
{
    private String[] array;

    public SomeString(String[] array)
    {
        this.array = array.clone();
    }

    public String findFirst(MyPradicate<String> pred) throws NotFoundException
    {
        for (String s : array)
        {
            if (pred.test(s))
            {
                return s;
            }
        }
        throw new NotFoundException();
    }
}

public class MyPradicateMain
{

    private static void output(String result)
    {
        if (result == null)
        {
            System.out.println("null gefunden");
        }
        else
        {
            System.out.println("String der L�nge " + result.length() + " gefunden: \"" + result + "\"");
        }
    }

    public static void main(String[] args)
    {
        String[] example = new String[]
        { "null", "   ", "hallo" };
        SomeString strings = new SomeString(example);
        try
        {
            String result;
            System.out.println("1. Fall: ");
            MyPradicate<String> empty = s -> s == null || s.trim().length() == 0;
            result = strings.findFirst(empty);
            output(result);

            System.out.println("2. Fall: ");
            result = strings.findFirst(empty.negate());
            output(result);

            System.out.println("3. Fall: ");
            result = strings.findFirst(empty.alwaysTrue());
            output(result);

            System.out.println("4. Fall: ");
            result = strings.findFirst(empty.notAlwaysTrue());
            output(result);
        }
        catch (NotFoundException e)
        {
                System.out.println("nicht gefunden!");
        }
    }
}
