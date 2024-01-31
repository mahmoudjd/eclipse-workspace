package beispiele;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class TestListUtil
{

    @Nested
    public class TestIsEmpty
    {
        @Test
        public void testListofNull()
        {
            int[] list = null;
            assertThrows(Exception.class, () -> ListUtil.isEmpty(list));
        }

        @Test
        public void testLeereListe()
        {
            int[] list = new int[0];
            assertTrue(ListUtil.isEmpty(list));
        }

        @Test
        public void testNichtLeereListemitEinemElement()
        {
            int[] list = new int[1];
            assertFalse(ListUtil.isEmpty(list));

        }

        @Test
        public void testNichtLeereListemitVieleElement()
        {
            int[] list = new int[10000];
            assertFalse(ListUtil.isEmpty(list));

        }
    }

    @Nested
    public class TestGetLength
    {

        @Test
        public void testLengthListofNull()
        {
            int[] list = null;
            assertThrows(Exception.class, () -> ListUtil.getLength(list));
        }

        @Test
        public void testLeereList()
        {
            int[] list = {};

            assertEquals(0, ListUtil.getLength(list));
        }

        @Test
        public void testNichtLeereListe()
        {
            int[] list = { 1, 2 };

            assertEquals(2, ListUtil.getLength(list));
        }

        @Test
        public void testNichtLeereListe2()
        {
            int[] list = { 1, 2, 3, 4, 5 };

            assertEquals(5, ListUtil.getLength(list));
        }

        @Test
        public void testNichtLeereListe3()
        {
            int[] list = new int[5];

            assertEquals(5, ListUtil.getLength(list));
        }

        @Test
        public void testNichtLeereListeGrosseLaenge()
        {
            int[] list = new int[10000];
            assertEquals(10000, ListUtil.getLength(list));

        }

        @Test
        public void testNichtLeereListeEnormeLaenge()
        {
            // Bis Hundert Millionen
            int[] list = new int[100000000];
            assertEquals(100000000, ListUtil.getLength(list));

        }

        // @Test
        // public void testIsEmptyMaxValueElemente()
        // {
        // int[] list = new int[Integer.MAX_VALUE];
        //
        // assertEquals(Integer.MAX_VALUE, ListUtil.getLength(list));
        // }
        // @Test
        // public void testIsEmptyMaxValueElemente()
        // {
        // int[] list = new int[Integer.MIN_VALUE];
        //
        // assertThrows(Exception.class, () -> ListUtil.getLength(list));
        // }

    }

    @Nested
    public class TestGetSmallest
    {
        @Test
        public void testListofNull()
        {
            int[] list = null;
            assertThrows(Exception.class, () -> ListUtil.getSmallest(list));
        }

        @Test
        public void testsmallPositivenValues()
        {
            int[] list = { 1, 2, 0 };
            assertEquals(0, ListUtil.getSmallest(list));
        }

        @Test
        public void testsmallmitNegativeValue()
        {
            int[] list = { 1, -22, 0 };
            assertEquals(-22, ListUtil.getSmallest(list));
        }

        @Test
        public void testsmallNegativeValues()
        {
            int[] list = { -10000, -22, -3 };
            assertEquals(-10000, ListUtil.getSmallest(list));
        }

        @Test
        public void testsmallmitMinValue()
        {
            int[] list = { Integer.MIN_VALUE, 2, 0 };
            assertEquals(Integer.MIN_VALUE, ListUtil.getSmallest(list));
        }

        @Test
        public void testLeereList()
        {
            int[] list = new int[0];

            assertThrows(Exception.class, () -> ListUtil.getSmallest(list));
        }

    }

    @Nested
    public class TestGetLargest
    {
        @Test
        public void testListofNull()
        {
            int[] list = null;
            assertThrows(Exception.class, () -> ListUtil.getLargest(list));
        }

        @Test
        public void testPositiveZahlen()
        {
            int[] list = { 1, 2, 3, 4 };
            assertEquals(4, ListUtil.getLargest(list));
        }

        @Test
        public void testNegativeZahlen()
        {
            int[] list = { -1, -2, -3, -4, -5 };
            assertEquals(-1, ListUtil.getLargest(list));
        }

        @Test
        public void testNegativekleineZahlen()
        {
            int[] list = { Integer.MIN_VALUE, -200000, -333536, -4645654, -598554 };
            assertEquals(-200000, ListUtil.getLargest(list));
        }

        @Test
        public void testGrossePosZahlen()
        {
            int[] list = { Integer.MAX_VALUE, 1, 1000000, 555555 };
            assertEquals(Integer.MAX_VALUE, ListUtil.getLargest(list));
        }

        @Test
        public void testLeereListe()
        {
            int[] list = {};
            assertThrows(Exception.class, () -> ListUtil.getLargest(list));
        }

    }
}
