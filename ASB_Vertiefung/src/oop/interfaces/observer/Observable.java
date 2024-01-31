package oop.interfaces.observer;

import java.util.*;

public class Observable
{
    private int value;

    private int first;

    private int last;

    private List<ChangeObserver> observers;

    public Observable(int initialValue)
    {
        value = initialValue;
        observers = new ArrayList<ChangeObserver>();
    }

    public Observable()
    {
        this(0);
    }

    public void addChangeObserver(ChangeObserver obs, int downValue, int upValue)
    {
        if (downValue > upValue || obs == null)
        {
            throw new IllegalArgumentException();
        }
        if (this.value <= upValue && this.value >= downValue)
        {
            first = downValue;
            last = upValue;

            observers.add(obs);
        }
    }

    public void removeChangeObserver(ChangeObserver obs, int downValue, int upValue)
    {
        observers.remove(obs);
    }

    public int getValue()
    {
        return value;
    }

    public void setValue(int value)
    {

        if (value >= first && this.value != value && value <= last)
        {
            for (ChangeObserver obs : observers)
            {
                obs.valueHasChanged(this.value, value);
            }
        }
    }

}
