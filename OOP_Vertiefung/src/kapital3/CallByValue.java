package kapital3;

public class CallByValue
{

    public static void method(int x)
    {
        x = 47;
    }

    public static void main(String[] args)
    {
        int x = 4;
        method(x);
        System.out.println(x); // 4
    }
}
