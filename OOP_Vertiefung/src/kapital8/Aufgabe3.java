package kapital8;

import java.util.ArrayList;
import java.util.List;
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

    public void fill(T content) throws FullException
    {
        if (this.content != null)
        {
            throw new FullException();
        }
        this.content = content;
    }

    public T getContent()
    {
        return content;
    }

}

class Box<T extends Drink> extends Bottle<T>
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

    public void addBottle(Bottle<T> b)
    {
        bottles.add(b);
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
        bottles = new ArrayList<>();
    }

    public void addBottle(Bottle<? extends Drink> bottle)
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
    private List<Bottle<? extends Drink>> bottles;

    public AnotherBottleBox()
    {
        bottles = new ArrayList<>();
    }

    public void addBottle(Bottle<? extends Drink> b)
    {
        bottles.add(b);
    }

    public int size()
    {
        return bottles.size();
    }

    Iterator<Bottle<? extends Drink>> iterator()
    {
        return bottles.iterator();
    }
}

class YetAnotherBottleBox<T1 extends Drink, T2 extends Bottle<? extends T1>>
{
    private List<T2> bottles;

    public YetAnotherBottleBox()
    {
        bottles = new ArrayList<>();
    }

    public void addBottle(T2 b)
    {
        bottles.add(b);
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

public class Aufgabe3
{

    public static void main(String[] args) throws FullException, EmptyException
    {
        Bottle<Beer> beerBottle = new Bottle<Beer>();
        beerBottle.fill(new Beer());

        Bottle<Wine> wineBottle = new Bottle<Wine>();
        wineBottle.fill(new RedWine());

        Bottle<RedWine> redWineBottle = new Bottle<RedWine>();
        redWineBottle.fill(new RedWine());

        Box<Wine> specialBottle = new Box<Wine>();
        specialBottle.fill(new RedWine());

        SpecialBeerBottle specialBeerBottle = new SpecialBeerBottle();
        specialBeerBottle.fill(new Beer());

        SpecialWineBottle specialWineBottle = new SpecialWineBottle();
        specialWineBottle.fill(new WhiteWine());

        SpecialBottleBox<Wine> wineBox = new SpecialBottleBox<Wine>();
        // wineBox.add(beerBottle);
        wineBox.addBottle(wineBottle);
        // wineBox.add(redWineBottle);
        wineBox.addBottle(specialBottle);
        // wineBox.add(specialBeerBottle);
        wineBox.addBottle(specialWineBottle);

        GeneralBottleBox generalBox = new GeneralBottleBox();
        generalBox.addBottle(beerBottle);
        generalBox.addBottle(wineBottle);
        generalBox.addBottle(redWineBottle);
        generalBox.addBottle(specialBottle);
        generalBox.addBottle(specialBeerBottle);
        generalBox.addBottle(specialWineBottle);

        AnotherBottleBox<Bottle<?>> anotherBox = new AnotherBottleBox<>();
        anotherBox.addBottle(beerBottle);
        anotherBox.addBottle(wineBottle);
        anotherBox.addBottle(redWineBottle);
        anotherBox.addBottle(specialBottle);
        anotherBox.addBottle(specialBeerBottle);
        anotherBox.addBottle(specialWineBottle);

        YetAnotherBottleBox<Wine, Bottle<Wine>> yetAnotherBox = new YetAnotherBottleBox<>();
        // yetAnotherBox.add(beerBottle);
        yetAnotherBox.addBottle(wineBottle);
        // yetAnotherBox.add(redWineBottle);
        yetAnotherBox.addBottle(specialBottle);
        // yetAnotherBox.add(specialBeerBottle);
        yetAnotherBox.addBottle(specialWineBottle);
    }
}
