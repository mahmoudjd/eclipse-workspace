package oop.four;

public class Exercise4
{
    @SuppressWarnings("unused")
    public static void main(String[] args)
    {
        int len = 70000;
        String s1 = "";
        // Teil 1
        long start1 = System.currentTimeMillis();
        for (int i = 0; i < len; i++)
        {
            s1 += "*";
        }
        long end1 = System.currentTimeMillis();
        long elapsed1 = end1 - start1;
        System.out.println("Time for String == " + elapsed1 + " ms");
        // Teil 2
        StringBuffer sb = new StringBuffer();
        long start2 = System.currentTimeMillis();
        for (int i = 0; i < len; i++)
        {
            sb.append("*");
        }
        long end2 = System.currentTimeMillis();
        long elapsed2 = end2 - start2;
        System.out.println("Time for StringBuffer == " + elapsed2+ " ms");

    }
}
