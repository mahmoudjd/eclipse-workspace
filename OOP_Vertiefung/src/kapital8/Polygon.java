package kapital8;

import java.util.ArrayList;
import java.util.List;

class Point2D<N extends Number>
{
    private N x;

    private N y;

    public Point2D(N x, N y)
    {
        this.x = x;
        this.y = y;
    }

    public N getX()
    {
        return x;
    }

    public void setX(N x)
    {
        this.x = x;
    }

    public N getY()
    {
        return y;
    }

    public String toString()
    {
        return "( " + x + " , " + y + " )";
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
        return z;
    }

    public void setZ(N z)
    {
        this.z = z;
    }

    public String toString()
    {
        return "( " + super.getX() + ", " + super.getY() + ", " + z + " )";
    }

}

public class Polygon<N extends Number, P extends Point2D<N>>
{
    private List<P> points;

    public Polygon()
    {
        points = new ArrayList<>();
    }

    public void addPoint(P point)
    {
        points.add(point);
    }

    public List<P> getPoints()
    {
        return points;
    }

    public static void main(String[] args)
    {
        Polygon<Integer, Point2D<Integer>> pol = new Polygon<Integer, Point2D<Integer>>();

        pol.addPoint(new Point2D<>(1, 2));
        pol.addPoint(new Point2D<>(3, 4));
        pol.addPoint(new Point3D<>(5, 6, 7));
        pol.addPoint(new Point3D<>(8, 9, 0));

        for (Point2D<?> p : pol.getPoints())
        {
            System.out.println(p.toString());
        }
    }
}