package TestFibonacciZahlen;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import FibonacciZahlen.Fibonacci;

public class TestFibonacci
{
    

        @Test
        public void testFibonacciOfZero()
        {

            int result = Fibonacci.fib(0);
            assertEquals(1, result);
        }

        @Test
        public void testFibonacciOfOne()
        {
            int result = Fibonacci.fib(1);
            assertEquals(1, result);
        }

        @Test
        public void testFibonacciOfTwo()
        {
            int result = Fibonacci.fib(2);
            assertEquals(2, result);
        }

        @Test
        public void testFibonacciOfThree()
        {
            int result = Fibonacci.fib(3);
            assertEquals(3, result);
        }

        @Test
        public void testFibonacciOfFour()
        {
            int result = Fibonacci.fib(4);
            assertEquals(5, result);
        }

        @Test
        public void testFibonacciOfFive()
        {
            int result = Fibonacci.fib(5);
            assertEquals(8, result);
        }

        @Test
        public void testFibonacciOfSix()
        {
            int result = Fibonacci.fib(6);
            assertEquals(13, result);
        }

        @Test
        public void testFibonacciOfNegativNumbers()
        {

            assertThrows(IllegalArgumentException.class, () ->
            {

                Fibonacci.fib(-1);
            });

            assertThrows(IllegalArgumentException.class, () ->
            {

                Fibonacci.fib(-11);
            });
        }
    
    
    
     /**
         * The fib function is completely tested here after implementation
         * 
         * @param number
         */

        @ParameterizedTest
        @DisplayName("FibonacciNumberValueSourceParameterList")
        @ValueSource(ints = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 })
        public void testWithCases(int number)
        {
            int fibonacciNumber = Fibonacci.fib(number);
            switch (number)
            {
                case 0:
                    assertEquals(1, fibonacciNumber);
                    break;
                case 1:
                    assertEquals(1, fibonacciNumber);
                    break;
                case 2:
                    assertEquals(2, fibonacciNumber);
                    break;
                case 3:
                    assertEquals(3, fibonacciNumber);
                    break;
                case 4:
                    assertEquals(5, fibonacciNumber);
                    break;
                case 5:
                    assertEquals(8, fibonacciNumber);
                    break;
                case 6:
                    assertEquals(13, fibonacciNumber);
                    break;
                case 7:
                    assertEquals(21, fibonacciNumber);
                    break;
                case 8:
                    assertEquals(34, fibonacciNumber);
                    break;
                case 9:
                    assertEquals(55, fibonacciNumber);
                    break;
                case 10:
                    assertEquals(89, fibonacciNumber);
                    break;

            }
        }

        @ParameterizedTest
        @MethodSource("proviedParametersFibonacciTest")
        public void FibonacciWithNumberReturnExpectedValue(Integer number, Integer expected)
        {
            int result = Fibonacci.fib(number);
            assertEquals(expected, result);
        }

        private static Stream<Arguments> proviedParametersFibonacciTest()
        {
            return Stream.of(
                            Arguments.of(0, 1),
                            Arguments.of(1, 1),
                            Arguments.of(2, 2),
                            Arguments.of(3, 3),
                            Arguments.of(4, 5),
                            Arguments.of(5, 8),
                            Arguments.of(6, 13),
                            Arguments.of(7, 21),
                            Arguments.of(8, 34),
                            Arguments.of(9, 55),
                            Arguments.of(10, 89),
                            Arguments.of(15, 987),
                            Arguments.of(20, 10946),
                            Arguments.of(25, 121393),
                            Arguments.of(30, 1346269),
                            Arguments.of(35, 14930352),
                            Arguments.of(40, 165580141),
                            Arguments.of(45, 1836311903)
                            );
        }

        @DisplayName(value="TestByBigNumberOutIntegerIntervall1")
        @Test
        public void testBigNumberOutInteger1()
        {
            // fib(46) = 2971215073 > Integer.MAX_VALUE
            assertThrows(IllegalArgumentException.class, () -> Fibonacci.fib(46));
        }
        
        @DisplayName(value="TestByBigNumberOutIntegerIntervall2")
        @Test
        public void testBigNumberOutInteger2()
        {
            // fib(47) = 4807526976 > Integer.MAX_VALUE
            assertThrows(IllegalArgumentException.class, () -> Fibonacci.fib(47));
        }
       
        @DisplayName(value="TestByBigNumberOutIntegerIntervall3")
        @Test
        public void testBigNumberOutInteger3()
        {
            // fib(48) = 7778742049 > Integer.MAX_VALUE
            assertThrows(IllegalArgumentException.class, () -> Fibonacci.fib(48));
        }
    
}
