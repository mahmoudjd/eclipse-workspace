package TDDGeneratePrime;

import java.util.ArrayList;

public class PrimeFactorGenerator
{

    public static ArrayList<Integer> Generate(int number)
    {
        ArrayList<Integer> primes = new ArrayList<>();
        int divisor = 2;

        /**
         * for (int divisor = 2; number >= 2; divisor++) { for (; number %
         * divisor == 0; number /= divisor) {
         * 
         * primes.add(divisor);
         * 
         * }
         * 
         * }
         */

        while (number >= 2)
        {
            while (number % divisor == 0)
            {

                primes.add(divisor);
                number /= divisor;
            }
            divisor++;
        }

        if (number > 1)
        {
            primes.add(number);
        }

        return primes;
    }

}
