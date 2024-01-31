package sieben;

import java.util.ArrayList;
import java.util.List;

class Point2D<N extends Number>
{

    protected N x;

    protected N y;

    public Point2D(N l, N r)
    {
        this.x = l;
        this.y = r;
    }

    public N getX()
    {
        return this.x;
    }

    public void setX(N x)
    {
        this.x = x;
    }

    public N getY()
    {
        return this.y;
    }

    public void setY(N y)
    {
        this.y = y;
    }

    public String toString()
    {
        return "( " + x + ", " + y + " )";
    }
}

class Point3D<N extends Number> extends Point2D<N>
{
    private N z;

    public Point3D(N x, N y, N z)
    {
        super(x, y);
        this.z = z;
    }

    public N getZ()
    {
        return this.z;
    }

    public void setZ(N z)
    {
        this.z = z;
    }

    public String toString()
    {
        return "( " + x + ", " + y + ", " + z + " )";
    }
}

class Polygon<N extends Number, P extends Point2D<N>>
{
    private List<P> list;

    public Polygon()
    {
        list = new ArrayList<>();
    }

    public void add(P p)
    {
        list.add(p);
    }

    public String toString()
    {
        return list.toString();
    }

}

public class GenericPoint
{

    public static void main(String[] args)
    {
        Polygon<Integer, Point2D<Integer>> poly = new Polygon<>();

        poly.add(new Point3D<Integer>(1, 2, 3));
        poly.add(new Point3D<Integer>(4, 5, 6));
        poly.add(new Point3D<Integer>(7, 8, 9));
        poly.add(new Point2D<Integer>(10, 11));

        System.out.println(poly.toString());
    }
}
