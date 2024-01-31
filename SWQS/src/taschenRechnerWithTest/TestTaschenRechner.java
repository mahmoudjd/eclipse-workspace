package taschenRechnerWithTest;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

/**
 * 
 * @author mahmoud
 *
 */

public class TestTaschenRechner
{
    @Nested
    public class AdditionTest
    {
        /**
         * --------------TEST Addition---------------- *
         */

        @Test
        public void testAddTwoPosNumbers()
        {
            TaschenRechner ts = new TaschenRechner();
            int result = ts.add(5, 5);
            assertEquals(10, result);
        }

        @Test
        public void testAddTwoPosBigNumbers()
        {
            TaschenRechner ts = new TaschenRechner();
            int result = ts.add(500000, 300000);
            assertEquals(800000, result);
        }

        @Test
        public void testAddTwoNegSmallNumbers()
        {
            TaschenRechner ts = new TaschenRechner();
            int result = ts.add(-500000, -300000);
            assertEquals(-800000, result);
        }

        @Test
        public void testAddTwoNegNumbers()
        {
            TaschenRechner ts = new TaschenRechner();
            int result = ts.add(-2, -6);
            assertEquals(-8, result);
        }

        @Test
        public void testAddNegNumberWithPosNumber()
        {
            TaschenRechner ts = new TaschenRechner();
            int result = ts.add(-5, 2);
            assertEquals(-3, result);
        }

        @Test
        public void testAddTwoNumbersWithSameValueDifferenzSignal()
        {
            TaschenRechner ts = new TaschenRechner();
            int result = ts.add(-5, 5);
            assertEquals(0, result);
        }

        @Test
        public void testAddZeroWithPosNumber()
        {
            TaschenRechner ts = new TaschenRechner();
            int result = ts.add(0, 2);
            assertEquals(2, result);
        }

        @Test
        public void testAddZeroWithNegNumber()
        {
            TaschenRechner ts = new TaschenRechner();
            int result = ts.add(-5, 0);
            assertEquals(-5, result);
        }

        @Test
        public void testAddOverflowTwoPosNumbers()
        {
            TaschenRechner ts = new TaschenRechner();
            assertThrows(ArithmeticException.class, () -> ts.add(Integer.MAX_VALUE - 1, 2));
        }

        @Test
        public void testAddOverflowNegNumbers()
        {
            TaschenRechner ts = new TaschenRechner();
            assertThrows(ArithmeticException.class, () -> ts.add(Integer.MIN_VALUE, -1));
        }
    }

    @Nested
    public class TestSubtraktion
    {
        /**
         * ---------------Test Subtraktion----------- *
         */

        @Test
        public void testSubTwoPosNumbers()
        {
            TaschenRechner ts = new TaschenRechner();
            int result = ts.sub(5, 2);
            assertEquals(3, result);
        }

        @Test
        public void testSubTwoBigPosNumbers()
        {
            TaschenRechner ts = new TaschenRechner();
            int result = ts.sub(100000, 10000);
            assertEquals(90000, result);
        }

        @Test
        public void testSubTowNegNumbers()
        {
            TaschenRechner ts = new TaschenRechner();
            int result = ts.sub(-5, -3);
            assertEquals(-2, result);
        }

        @Test
        public void testSubTwoSmallNegNumbers()
        {
            TaschenRechner ts = new TaschenRechner();
            int result = ts.sub(-100000, -10000);
            assertEquals(-90000, result);
        }

        @Test
        public void testSubTowNumbersNegAndPos()
        {
            TaschenRechner ts = new TaschenRechner();
            int result = ts.sub(-5, 3);
            assertEquals(-8, result);
        }

        @Test
        public void testSubTowNumbersPosMinusNeg()
        {
            TaschenRechner ts = new TaschenRechner();
            int result = ts.sub(5, -3);
            assertEquals(8, result);
        }

        @Test
        public void testSubTowNumbersPosMinusZero()
        {
            TaschenRechner ts = new TaschenRechner();
            int result = ts.sub(8, 0);
            assertEquals(8, result);
        }

        @Test
        public void testSubTowNumbersNegMinusZero()
        {
            TaschenRechner ts = new TaschenRechner();
            int result = ts.sub(-9, 0);
            assertEquals(-9, result);
        }

        @Test
        public void testSubTowNumbersZeroMinusPos()
        {
            TaschenRechner ts = new TaschenRechner();
            int result = ts.sub(0, 10);
            assertEquals(-10, result);
        }

        @Test
        public void testSubTowNumbersZeroMinusNeg()
        {
            TaschenRechner ts = new TaschenRechner();
            int result = ts.sub(0, -10);
            assertEquals(10, result);
        }

        @Test
        public void testSubOverflowNegNumbers()
        {

            TaschenRechner ts = new TaschenRechner();
            assertThrows(ArithmeticException.class, () -> ts.sub(Integer.MIN_VALUE, 3));
        }

        @Test
        public void testSubOverflowPosNumbers()
        {

            TaschenRechner ts = new TaschenRechner();
            assertThrows(ArithmeticException.class, () -> ts.sub(Integer.MAX_VALUE, -1));
        }

    }

    @Nested
    public class TestMultiplikation
    {
        /**
         * ------------------------Test Multiplikation------------------ *
         */

        @Test
        public void testMultTwoPosNumbers()
        {
            TaschenRechner ts = new TaschenRechner();
            int result = ts.mult(5, 5);
            assertEquals(25, result);
        }

        @Test
        public void testMultiTwoPosBigNumbers()
        {
            TaschenRechner ts = new TaschenRechner();
            int result = ts.mult(50000, 3000);
            assertEquals(150000000, result);
        }

        @Test
        public void testMultTwoNegSmallNumbers()
        {
            TaschenRechner ts = new TaschenRechner();
            int result = ts.mult(-50000, -3000);
            assertEquals(150000000, result);
        }

        @Test
        public void testMultiTwoNegNumbers()
        {
            TaschenRechner ts = new TaschenRechner();
            int result = ts.mult(-2, -6);
            assertEquals(12, result);
        }

        @Test
        public void testMultiNegNumberWithPosNumber()
        {
            TaschenRechner ts = new TaschenRechner();
            int result = ts.mult(-5, 2);
            assertEquals(-10, result);
        }

        @Test
        public void testMultiTwoNumbersWithSameValueDifferenzSignal()
        {
            TaschenRechner ts = new TaschenRechner();
            int result = ts.mult(-5, 5);
            assertEquals(-25, result);
        }

        @Test
        public void testMultiZeroWithPosNumber()
        {
            TaschenRechner ts = new TaschenRechner();
            int result = ts.mult(0, 2);
            assertEquals(0, result);
        }

        @Test
        public void testMultiZeroWithNegNumber()
        {
            TaschenRechner ts = new TaschenRechner();
            int result = ts.mult(-5, 0);
            assertEquals(0, result);
        }

        @Test
        public void testMultiTwoBigPosNumbers()
        {
            TaschenRechner ts = new TaschenRechner();
            int result = ts.mult(10000, 10000);
            assertEquals(100000000, result);
        }

        @Test
        public void testMultOverflowPosNumbers()
        {

            TaschenRechner ts = new TaschenRechner();
            assertThrows(ArithmeticException.class, () -> ts.mult(100000, 100000));
        }

    }

    @Nested
    public class testDivision
    {
        /**
         * --------------Test Division -------------- *
         */
        @Test
        public void testDivideZeroDivPosNumber()
        {
            TaschenRechner ts = new TaschenRechner();
            int result = ts.divide(0, 10000);
            assertEquals(0, result);
        }

        @Test
        public void testDivideTwoPosNumer()
        {
            TaschenRechner ts = new TaschenRechner();
            int result = ts.divide(15, 3);
            assertEquals(5, result);
        }

        @Test
        public void testDivideTwoNegNumer()
        {
            TaschenRechner ts = new TaschenRechner();
            int result = ts.divide(-15, -3);
            assertEquals(5, result);
        }

        @Test
        public void testDividiPosNumberAndNumberOne()
        {
            TaschenRechner ts = new TaschenRechner();
            int result = ts.divide(12, 1);
            assertEquals(12, result);
        }

        @Test
        public void testDividiNegNumberAndNumberOne()
        {
            TaschenRechner ts = new TaschenRechner();
            int result = ts.divide(-12, 1);
            assertEquals(-12, result);
        }

        @Test
        public void testDividiPosNumberAndNumberNegOne()
        {
            TaschenRechner ts = new TaschenRechner();
            int result = ts.divide(12, -1);
            assertEquals(-12, result);
        }

        @Test
        public void testDivisionByZero()
        {
            TaschenRechner ts = new TaschenRechner();
            assertThrows(ArithmeticException.class, () -> ts.divide(1, 0));
        }

        @Test
        public void testDivisionZeroAndZero()
        {
            TaschenRechner ts = new TaschenRechner();
            assertThrows(ArithmeticException.class, () -> ts.divide(0, 0));
        }
    }

    @Nested
    public class PercentTest
    {
        /**
         * -------------Test Prozentualen Anteil-----------  *
         */
        @Test
        public void testPercent1()
        {
            TaschenRechner ts = new TaschenRechner();
            assertEquals(5, ts.percent(20, 25));
        }

        @Test
        public void testPercent2()
        {
            TaschenRechner ts = new TaschenRechner();
            assertEquals(0.50, ts.percent(10, 5));
        }

        @Test
        public void testPercent3()
        {
            TaschenRechner ts = new TaschenRechner();

            assertEquals(75.81, ts.percent(399, 19));

        }

        @Test
        public void testPercentWithZero()
        {
            TaschenRechner ts = new TaschenRechner();

            assertEquals(0.0, ts.percent(100, 0));
        }

        @Test
        public void testPercentWithNegativ()
        {
            TaschenRechner ts = new TaschenRechner();

            assertThrows(ArithmeticException.class, () -> ts.percent(100, -20));
        }
    }

    @Nested
    public class MwstTest
    {
        /**
         * ------------------Test Mehr Wert Steuer------------  *
         */
        @Test
        public void testMWSTOneHandred()
        {
            TaschenRechner ts = new TaschenRechner();

            assertEquals(19.0, ts.mwst(100));
        }

        @Test
        public void testMWSTSimpleNumber()
        {
            TaschenRechner ts = new TaschenRechner();

            assertEquals(1.90, ts.mwst(10));
        }

        @Test
        public void testMWSTSmallestNumber()
        {
            TaschenRechner ts = new TaschenRechner();

            assertEquals(0.19, ts.mwst(1));
        }

        @Test
        public void testMwstPosKomplNumber()
        {
            TaschenRechner ts = new TaschenRechner();
            assertEquals(75.81, ts.mwst(399));
        }

        @Test
        public void testMwstNegKomplNumber()
        {
            TaschenRechner ts = new TaschenRechner();
            assertEquals(-75.81, ts.mwst(-399));
        }

        @Test
        public void testMwstUpperBoundary()
        {
            TaschenRechner ts = new TaschenRechner();
            assertEquals(408021892.93, ts.mwst(Integer.MAX_VALUE));
        }

        @Test
        public void testMwstLowerBoundary()
        {
            TaschenRechner ts = new TaschenRechner();
            assertEquals(-408021893.12, ts.mwst(Integer.MIN_VALUE));
        }

        @Test
        public void testMwstValueZero()
        {
            TaschenRechner ts = new TaschenRechner();
            assertEquals(0.0, ts.mwst(0));
        }

    }

}
