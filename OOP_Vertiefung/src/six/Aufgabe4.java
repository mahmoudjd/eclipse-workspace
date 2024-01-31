package six;

/*
 * Aufgabe 4
 */

interface I
{
}

class A implements I
{
}

class B implements I
{
}

class C
{
    @SuppressWarnings("unused")
    private I i;

    public void setI(I i)
    {
        this.i = i;
    }
}

class Aufgabe4
{
    public static void main(String[] args)
    {
        C c = new C();
        c.setI(new A());
        // Zustand 1
        c.setI(new B());
        // Zustand 2
    }
}
