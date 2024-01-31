package debugging;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class TestKlasse
{

    @Test
    public void testErsteElement()
    {
        int[] a = { 1, 2, 3, 4, 5, 6, 7, 8 };

        int index = Klasse.method(a, 1);
        assertEquals(index, 0);

    }

    @Test
    public void testMittlereElement()
    {
        int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        int index = Klasse.method(a, 5);
        assertEquals(index, 4);

    }

    @Test
    public void testLetzteElement()
    {
        int[] a = { 1, 2, 3, 4, 5, 6, 7, 8 };

        int index = Klasse.method(a, 8);
        assertEquals(index, a.length - 1);

    }

    @Test
    public void testMittlereLinkeElement()
    {
        int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        int index = Klasse.method(a, 3);
        assertEquals(index, 2);

    }

    @Test
    public void testMittlereRichteElement()
    {
        int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        int index = Klasse.method(a, 8);
        assertEquals(index, 7);

    }

    @Test
    public void testRandLinkeElement()
    {
        int[] a = { 1, 2, 3, 4, 5, 6, 7, 8 };

        int index = Klasse.method(a, 2);
        assertEquals(index, 1);

    }

    @Test
    public void testRandRichteElement()
    {
        int[] a = { 1, 2, 3, 4, 5, 6, 7, 8 };

        int index = Klasse.method(a, 7);
        assertEquals(index, 6);

    }

    @Test
    public void testLinkeNichtElement()
    {
        int[] a = { 1, 2, 3, 4, 5, 6, 7, 8 };

        int index = Klasse.method(a, -2);
        assertEquals(index, -1);

    }

    @Test
    public void testRichtNichtElement()
    {
        int[] a = { 1, 2, 3, 4, 5, 6, 7, 8 };

        int index = Klasse.method(a, 10);
        assertEquals(index, -1);

    }

    @Test
    public void testMittelNichtElement()
    {
        int[] a = { 1, 2, 3, 4, 6, 7, 8, 9, 10 };

        int index = Klasse.method(a, 5);
        assertEquals(index, -1);

    }

}
