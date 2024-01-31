package nein.tmp;

interface MyPredicate<S>
{
    public boolean test(S s);

    public default MyPredicate<S> negate()
    {
        return s -> !this.test(s);
    }

    public default MyPredicate<S> or(MyPredicate<? super S> pred)
    {
        return s -> this.test(s) || pred.test(s);
    }

    public default MyPredicate<S> and(MyPredicate<? super S> pred)
    {
        return s -> this.test(s) && pred.test(s);
    }

    public static <T> MyPredicate<T> not(MyPredicate<? super T> pred)
    {
        return s -> !pred.test(s);
    }

    public static <T> MyPredicate<T> alwaysTrue()
    {
        return t -> true;
    }
}

@SuppressWarnings("serial")
class NotFoundException extends Exception
{
}

class SomeStrings
{
    private String[] array;

    public SomeStrings(String[] array)
    {
        this.array = array;
    }

    public String findFirst(MyPredicate<String> pred) throws NotFoundException
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

public class MyPredicateMain
{
    public static void main(String[] args)
    {

        String[] example = { "null", "  ", "Haus", "xxxxx", "Hallo" };
        SomeStrings strings = new SomeStrings(example);

        try
        {
            String result;
            MyPredicate<CharSequence> length5 = cs -> cs.length() == 5;
            MyPredicate<String> startsWithHa = s -> s.startsWith("Ha");
            // result= strings.findFirst(length5.and(startsWithHa));
            result = strings.findFirst(startsWithHa.and(length5));
            System.out.println("gefunden: " + result);
            result = strings.findFirst(MyPredicate.not(startsWithHa.and(length5)));
            System.out.println("gefunden: " + result);
        }
        catch (NotFoundException e)
        {
            System.out.println("nicht gefunden");
        }
    }
}