package First;

import java.math.BigDecimal;

public class Challenge1BigDecimal
{
    public static void main(String[] args)
    {
        BigDecimal x = new BigDecimal("2.00");
        BigDecimal y = new BigDecimal("1.10");
        BigDecimal res;
        res = x.subtract(y);

        System.out.println("das Ergebnis ist : " + res);
      
    }
}
