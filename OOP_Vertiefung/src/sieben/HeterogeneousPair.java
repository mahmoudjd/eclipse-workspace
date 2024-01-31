package sieben;

class A
{

}

class B extends A
{

}

class C extends B
{

}

class D
{

}

class E extends D
{

}

class F extends E
{

}

class HomogeneousPair<S> extends HeterogeneousPair<S, S>
{

    public HomogeneousPair(S left, S right)
    {
        super(left, right);
    }

}

public class HeterogeneousPair<S, T>
{

    private S left;

    private T right;

    public HeterogeneousPair(S left, T right)
    {
        this.left = left;
        this.right = right;
    }

    public S getLeft()
    {
        return this.left;
    }

    public void setLeft(S left)
    {
        this.left = left;
    }

    public T getRight()
    {
        return this.right;
    }

    public void setRight(T right)
    {
        this.right = right;
    }

    public String toString()
    {
        return "< " + this.left + " , " + this.right + " >";
    }

    public static <S, T> void exchange1(HeterogeneousPair<S, T> p1, HeterogeneousPair<S, T> p2)
    {
        S left1 = p1.getLeft();
        S left2 = p2.getLeft();

        p1.setLeft(left2);
        p2.setLeft(left1);

        T right1 = p1.getRight();
        T right2 = p2.getRight();

        p1.setRight(right2);
        p2.setRight(right1);

    }

    public static <S> void exchange2(HeterogeneousPair<S, S> p1, HeterogeneousPair<S, S> p2)
    {
        S left1 = p1.getLeft();
        S left2 = p2.getLeft();
        S right1 = p1.getRight();
        S right2 = p2.getRight();
        p1.setLeft(right2);
        p1.setRight(left2);
        p2.setLeft(right1);
        p2.setRight(left1);

    }

    // zweite Parameter von ? extends B => ? super B
    public static void copy(HeterogeneousPair<? extends B, ? extends E> p1, HeterogeneousPair<? super B, ? super E> p2)
    {
        B left1 = p1.getLeft();
        E right1 = p1.getRight();

        p2.setLeft(left1);
        p2.setRight(right1);

    }

    public static void copyAlternativ(HeterogeneousPair<? extends B, ? extends E> p1, HeterogeneousPair<Object, Object> p2)
    {
        B left1 = p1.getLeft();
        E right1 = p1.getRight();

        p2.setLeft(left1);
        p2.setRight(right1);

    }

    public static void main(String[] args)
    {
        HeterogeneousPair<B, E> pair1 = new HeterogeneousPair<>(new B(), new E());
        HeterogeneousPair<? super B, ? super E> pair2 = new HeterogeneousPair<>(new C(), new F());

        System.out.println("Vor der Kopie");
        System.out.println("   " + pair1 + " ----- " + pair2);
        copy(pair1, pair2);
        System.out.println("Nach der Kopie");
        System.out.println("   " + pair1 + " ----- " + pair2);
        HeterogeneousPair<Integer, Integer> p1 = new HeterogeneousPair<>(1, 2);
        HeterogeneousPair<Integer, Integer> p2 = new HeterogeneousPair<>(3, 4);

        System.out.println("Vor Tausch");
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println("Nach Tausch");

        exchange1(p1, p2);

        System.out.println(p1.toString());
        System.out.println(p2.toString());

        HomogeneousPair<Integer> p3 = new HomogeneousPair<>(3, 4);
        HomogeneousPair<Integer> p4 = new HomogeneousPair<>(5, 6);

        System.out.println("Vor Tausch");
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        System.out.println("Nach Tausch");

        exchange2(p3, p4);

        System.out.println(p3.toString());
        System.out.println(p4.toString());

        HeterogeneousPair<Integer, Integer> p5 = new HomogeneousPair<>(7, 8);
        HeterogeneousPair<Integer, Integer> p6 = new HomogeneousPair<>(9, 0);

        System.out.println("Vor Tausch");
        System.out.println(p5.toString());
        System.out.println(p6.toString());
        System.out.println("Nach Tausch");

        exchange2(p5, p6);

        System.out.println(p5.toString());
        System.out.println(p6.toString());

    }

}
