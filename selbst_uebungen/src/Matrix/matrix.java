package Matrix;

public class matrix
{
    int height;

    int width;

    int[][] array;

    public matrix(int h, int w)
    {
        this.height = h;
        this.width = w;
        this.array = new int[h][w];

    }

    public void setHeight(int h)
    {
        this.height = h;
    }

    public int getHeight()
    {
        return this.height;
    }

    public void setWidth(int w)
    {
        this.width = w;
    }

    public int getWidth()
    {
        return this.width;
    }

    public int getArray(int h, int w)
    {

        return array[h][w];
    }

    public void setArray(int value, int h, int w)
    {
        array[h][w] = value;
    }

    public int getMin()
    {
        int value = array[0][0];
        for (int i = 0; i < this.height; i++)
        {
            for (int j = 0; j < this.width; j++)
            {
                if (array[i][j] < value)
                    value = array[i][j];
            }
        }
        return value;
    }

    public double avg()
    {
        int value = array[0][0];
        int count = 0;
        for (int i = 0; i < height; i++)
        {
            for (int j = 0; j < width; j++)
            {
                value += array[i][j];
                count++;
            }
        }
        double res = (double) value / count;
        return res;
    }
}
