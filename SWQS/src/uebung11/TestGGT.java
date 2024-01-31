package uebung11;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class TestGGT
{

    @Test
    public void testGGT()
    {
        assertEquals(1, GGT.ggt(1, 1));
    }

    @Test
    public void testGGT1()
    {
        assertEquals(5, GGT.ggt(10, 5));
    }
}
