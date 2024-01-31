package oop.counter;

public class Incrementer
{

    private int value;

    public Incrementer(int value)
    {
        this.value = value;
    }

    public int getValue()
    {
        return this.value;
    }

    public void increment()
    {
        this.value++;
    }

}
