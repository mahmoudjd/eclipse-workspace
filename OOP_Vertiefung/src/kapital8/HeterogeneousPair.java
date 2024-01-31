package kapital8;

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
        return left;
    }

    public void setLeft(S left)
    {
        this.left = left;
    }

    public T getRight()
    {
        return right;
    }

    public void setRight(T right)
    {
        this.right = right;
    }

    public String toString()
    {
        return "< " + left + ", " + right + " >";
    }

    public static void copy(HeterogeneousPair<? extends B, ? extends E> p1, HeterogeneousPair<? super B, ? super E> p2)
    {
        B left1 = p1.getLeft();
        p2.setLeft(left1);
        E right1 = p1.getRight();
        p2.setRight(right1);

    }

    public static void copy1(HeterogeneousPair<? extends B, ? extends E> p1, HeterogeneousPair<A, D> p2)
    {
        B left1 = p1.getLeft();
        p2.setLeft(left1);
        E right1 = p1.getRight();
        p2.setRight(right1);

    }

    public static void copy2(HeterogeneousPair<? extends B, ? extends E> p1, HeterogeneousPair<Object, Object> p2)
    {
        B left1 = p1.getLeft();
        p2.setLeft(left1);
        E right1 = p1.getRight();
        p2.setRight(right1);

    }

    public static <S, T> void exchange1(HeterogeneousPair<S, T> p1, HeterogeneousPair<S, T> p2)
    {
        S left1 = p1.getLeft();
        S left2 = p2.getLeft();
        T right1 = p1.getRight();
        T right2 = p2.getRight();

        p1.setLeft(left2);
        p2.setLeft(left1);

        p1.setRight(right2);
        p2.setRight(right1);

    }

    public static <S> void exchange2(HeterogeneousPair<S, S> p1, HeterogeneousPair<S, S> p2)
    {
        S left1 = p1.getLeft();
        S left2 = p2.getLeft();
        S right1 = p1.getRight();
        S right2 = p2.getRight();

        p1.setRight(left2);
        p1.setLeft(right2);

        p2.setLeft(right1);
        p2.setRight(left1);

    }

    public static void main(String[] args)
    {

        HeterogeneousPair<B, E> p1 = new HeterogeneousPair<>(new B(), new E());
        HeterogeneousPair<? super B, ? super E> p2 = new HeterogeneousPair<>(new C(), new F());

        System.out.println("Vor der Kopie");
        System.out.println("   " + p1 + " ----- " + p2);
        copy(p1, p2);
        System.out.println("Nach der Kopie");
        System.out.println("   " + p1 + " ----- " + p2);
        HeterogeneousPair<Integer, Integer> p11 = new HeterogeneousPair<>(1, 2);
        HeterogeneousPair<Integer, Integer> p21 = new HeterogeneousPair<>(3, 4);

        System.out.println("Vor Tausch");
        System.out.println(p11.toString());
        System.out.println(p21.toString());
        System.out.println("Nach Tausch");

        exchange1(p11, p21);

        System.out.println(p11.toString());
        System.out.println(p21.toString());

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

class HomogeneousPair<S> extends HeterogeneousPair<S, S>
{

    public HomogeneousPair(S left, S right)
    {
        super(left, right);
    }

}