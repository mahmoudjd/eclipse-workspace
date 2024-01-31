package oop.counter;

public class Decrementer
{
    private int value;

    public Decrementer(int value)
    {
        this.value = value;
    }

    public int getValue()
    {
        return this.value;
    }

    public void decrement()
    {
        this.value--;
    }

    public static void main(String[] args) throws InterruptedException
    {
        Incrementer i = new Incrementer(5);
        i.increment();
        System.out.println("Inkrementiert : " + i.getValue());
        Decrementer d = new Decrementer(4);
        d.decrement();

        Thread.sleep(50); // um die Ausgaben in Reihenfolge auszugeben

        System.err.println("Dekrementiert: " + d.getValue());
        
        Thread.sleep(50); 

        System.out.println(Integer.MAX_VALUE);

    }
}
