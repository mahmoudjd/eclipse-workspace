package sieben;

/*
 * Aufgabe 3
 */

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

class EmptyException extends Exception
{

    private static final long serialVersionUID = 1L;

}

class FullException extends Exception
{

    private static final long serialVersionUID = 1L;

}

class Drink
{

}

class Beer extends Drink
{

}

class Wine extends Drink
{

}

class WhiteWine extends Wine
{

}

class RedWine extends Wine
{

}

class Bottle<T extends Drink>
{
    private T content;

    public T Empty() throws EmptyException
    {
        if (content == null)
        {
            throw new EmptyException();
        }
        T result = content;

        content = result;
        return result;
    }

    public void fill(T c) throws FullException
    {
        if (content != null)
        {
            throw new FullException();
        }

        this.content = c;
    }

    public T getContent()
    {
        return this.content;
    }

}

class SpecialBottle<T extends Drink> extends Bottle<T>
{

}

class SpecialBeerBottle extends Bottle<Beer>
{

}

class SpecialWineBottle extends Bottle<Wine>
{

}

class SpecialBottleBox<T extends Drink>
{
    private List<Bottle<T>> bottles;

    public SpecialBottleBox()
    {
        bottles = new ArrayList<Bottle<T>>();

    }

    public void add(Bottle<T> bottle)
    {
        bottles.add(bottle);
    }

    public int size()
    {
        return bottles.size();
    }

    public Iterator<Bottle<T>> iterator()
    {
        return bottles.iterator();
    }

}

class GeneralBottleBox
{
    private List<Bottle<? extends Drink>> bottles;

    public GeneralBottleBox()
    {
        bottles = new ArrayList<Bottle<? extends Drink>>();
    }

    public void add(Bottle<? extends Drink> bottle)
    {
        bottles.add(bottle);
    }

    public int size()
    {
        return bottles.size();
    }

    public Iterator<Bottle<? extends Drink>> iterator()
    {
        return bottles.iterator();
    }

}

class AnotherBottleBox<T extends Bottle<? extends Drink>>
{
    private List<T> bottles;

    public AnotherBottleBox()
    {
        bottles = new ArrayList<>();

    }

    public void add(T bottle)
    {
        bottles.add(bottle);
    }

    public int size()
    {
        return bottles.size();
    }

    public Iterator<T> iterator()
    {
        return bottles.iterator();
    }

}

class YetAnotherBottleBox<T1 extends Drink, T2 extends Bottle<T1>>
{
    private List<T2> bottles;

    public YetAnotherBottleBox()
    {
        bottles = new ArrayList<T2>();

    }

    public void add(T2 bottle)
    {
        bottles.add(bottle);
    }

    public int size()
    {
        return bottles.size();
    }

    public Iterator<T2> iterator()
    {
        return bottles.iterator();
    }

}

public class DrinkAndBottles
{
    public static void main(String[] args) throws FullException, EmptyException
    {
        Bottle<Beer> beerBottle = new Bottle<Beer>();
        beerBottle.fill(new Beer());

        Bottle<Wine> wineBottle = new Bottle<Wine>();
        wineBottle.fill(new RedWine());

        Bottle<RedWine> redWineBottle = new Bottle<RedWine>();
        redWineBottle.fill(new RedWine());

        SpecialBottle<Wine> specialBottle = new SpecialBottle<Wine>();
        specialBottle.fill(new RedWine());

        SpecialBeerBottle specialBeerBottle = new SpecialBeerBottle();
        specialBeerBottle.fill(new Beer());

        SpecialWineBottle specialWineBottle = new SpecialWineBottle();
        specialWineBottle.fill(new WhiteWine());

        SpecialBottleBox<Wine> wineBox = new SpecialBottleBox<Wine>();
        // wineBox.add(beerBottle);
        wineBox.add(wineBottle);
        // wineBox.add(redWineBottle);
        wineBox.add(specialBottle);
        // wineBox.add(specialBeerBottle);
        wineBox.add(specialWineBottle);

        GeneralBottleBox generalBox = new GeneralBottleBox();
        generalBox.add(beerBottle);
        generalBox.add(wineBottle);
        generalBox.add(redWineBottle);
        generalBox.add(specialBottle);
        generalBox.add(specialBeerBottle);
        generalBox.add(specialWineBottle);

        AnotherBottleBox<Bottle<?>> anotherBox = new AnotherBottleBox<>();
        anotherBox.add(beerBottle);
        anotherBox.add(wineBottle);
        anotherBox.add(redWineBottle);
        anotherBox.add(specialBottle);
        anotherBox.add(specialBeerBottle);
        anotherBox.add(specialWineBottle);

        YetAnotherBottleBox<Wine, Bottle<Wine>> yetAnotherBox = new YetAnotherBottleBox<>();
        // yetAnotherBox.add(beerBottle);
        yetAnotherBox.add(wineBottle);
        // yetAnotherBox.add(redWineBottle);
        yetAnotherBox.add(specialBottle);
        // yetAnotherBox.add(specialBeerBottle);
        yetAnotherBox.add(specialWineBottle);
    }
}
