package nein.tmp;

//import java.util.function.Function;

interface ItemwithWeight
{
    public int getWeight();
}

class ItemType1 implements ItemwithWeight
{
    private int part1;

    private int part2;

    public ItemType1(int part1, int part2)
    {
        this.part1 = part1;
        this.part2 = part2;
    }

    public int getWeight()
    {
        return part1 + part2;
    }
}

class ItemType2 implements ItemwithWeight
{
    private int[] pieces;

    public ItemType2(int[] pieces)
    {
        this.pieces = pieces.clone();
    }

    public int getWeight()
    {
        int sum = 0;
        for (int p : pieces)
        {
            sum += p;
        }
        return sum;
    }
}

class ItemType1Creator implements MyFunction<String, ItemType1>
{
    public ItemType1 apply(String configData)
    {
        int p1 = (int) (Math.random() * 100);
        int p2 = (int) (Math.random() * 100);
        return new ItemType1(p1, p2);

    }
}

class ItemType2Creator implements MyFunction<String, ItemType2>
{
    public ItemType2 apply(String configData)
    {
        int numberOfPieces = (int) (Math.random() * 10);
        int[] pieces = new int[numberOfPieces];
        for (int i = 0; i < pieces.length; i++)
        {
            pieces[i] = (int) (Math.random() * 100);
        }

        return new ItemType2(pieces);

    }
}

public class AndThenExaple
{
    private static void simpleIntegerExaple1()
    {
        MyFunction<Integer, Integer> f1 = i -> i * 10;
        MyFunction<Integer, Integer> f2 = i -> i + 2;
        MyFunction<Integer, Integer> f3 = f1.andThen(f2);
        //Function<Integer, Integer> f4 = f1.compose(f2);// f2.andThen(f1);
        MyFunction<Integer, Integer> f5 = f1.andThen(f1).andThen(f1).andThen(f2);// f2.andThen(f1);
        System.out.println(f3.apply(1));
        //System.out.println(f4.apply(1));
        System.out.println(f5.apply(1));

    }

    private static void simpleMixedExaple()
    {
        MyFunction<Double, Long> f1 = d -> Math.round(d.doubleValue());
        MyFunction<Long, String> f2 = l -> "Das Ergebnis ist " + l;
        MyFunction<Double, String> f3 = f1.andThen(f2);
        // Function<Double, String> f4 = f1.andThen(f2);
        System.out.println(f3.apply(1.9));
    }

    private static void simpleIntegerExaple2()
    {
        MyFunction<Double, Double> f1 = d -> d * 44.4;
        MyFunction<Number, Long> f2 = n -> Math.round(n.doubleValue()) + 2;
        MyFunction<Double, Number> f3 = f1.andThen(f2);

        System.out.println(f3.apply(2.0));

    }

    private static void weightExample()
    {
        ItemType1Creator creator1 = new ItemType1Creator();
        ItemType2Creator creator2 = new ItemType2Creator();

        MyFunction<ItemwithWeight, CharSequence> weightPrinter1 = item -> new StringBuffer("Gewicht ist " + item.getWeight());
        MyFunction<ItemwithWeight, CharSequence> weightPrinter2 = item -> new StringBuffer("The weight is " + item.getWeight());

        useFunction("configData 1", creator1.andThen(weightPrinter1));
        useFunction("configData 1", creator1.andThen(weightPrinter2));
        useFunction("configData 1", creator2.andThen(weightPrinter1));
        useFunction("configData 1", creator2.andThen(weightPrinter2));

    }

    private static void useFunction(String konfigData, MyFunction<String, CharSequence> f)
    {
        System.out.println(f.apply(konfigData));
    }

    public static void main(String[] args)
    {
        simpleIntegerExaple1();
        simpleMixedExaple();
        simpleIntegerExaple2();
        weightExample();
        //MyFunction.demo();
    }
}

interface MyFunction<T, R>
{
    public R apply(T t);

    public default <V> MyFunction<T, V> andThen(MyFunction<? super R, ? extends V> after)
    {
        return t -> after.apply(this.apply(t));
    }

    public static void demo()
    {
        MyFunction<Integer, Integer> f1 = i -> i + 1;
        MyFunction<Integer, Integer> f2 = i -> i * 10;
        MyFunction<Integer, Integer> f3 = f1.andThen(f2);
        MyFunction<Integer, Integer> f4 = f2.andThen(f1);
        System.out.println(f3.apply(1)); // 20
        System.out.println(f4.apply(1)); // 11

    }
}
