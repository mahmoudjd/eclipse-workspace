package kapital9;

interface MyPredicate<S>
{

    public boolean test(S s);

    public default MyPredicate<S> negate()
    {
        return s -> !this.test(s);
    }

    public default MyPredicate<S> and(MyPredicate<? super S> pred)
    {
        return s -> this.test(s) && pred.test(s);
    }

    public default MyPredicate<S> or(MyPredicate<? super S> pred)
    {
        return s -> this.test(s) || pred.test(s);
    }

    public static <T> MyPredicate<T> not(MyPredicate<? super T> pred)
    {
        return s -> !pred.test(s);
    }
}
/*
 * Beispiel vom Internet class Java8PredicateTutorial {
 * 
 * public static void main(String args[]) {
 * 
 * /* Java predicate lambda example
 */

// Predicate<Integer> lambdaPredicate = (Integer x) -> (x % 2 == 0);

// System.out.printf("Gretzky's number is even: %s", lambdaPredicate.test(99));

// System.out.printf("\nLemieux's number is even: %s ",
// lambdaPredicate.test(66));

// }

// }

@SuppressWarnings("serial")
class NotFoundException1 extends Exception
{

}

class SomeStrings
{
    private String[] array;

    public SomeStrings(String[] array)
    {
        this.array = array;
    }

    public String findFirst(MyPredicate<String> pred) throws NotFoundException1
    {
        for (String s : array)
        {
            if (pred.test(s))
            {
                return s;
            }
        }

        throw new NotFoundException1();
    }
}

public class Aufgabe6
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
            result = strings.findFirst(startsWithHa.and(length5));
            System.out.println("gefunden: ---> " + result);

            result = strings.findFirst(MyPredicate.not(startsWithHa.and(length5)));
            System.out.println("gefunden: ---> " + result);

        }
        catch (NotFoundException1 e)
        {

            System.out.println("nicht gefunden");
        }

    }
}
