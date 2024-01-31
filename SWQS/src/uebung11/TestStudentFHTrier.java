package uebung11;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertThrows;

import org.junit.jupiter.api.Test;

public class TestStudentFHTrier
{

    @Test
    public void testGueltigeName()
    {
        boolean res = StudentFHTrier.addStudentFHTrier("Mark", 1990, Fach.Informatik);
        assertTrue(res);
    }

    @Test
    public void testGueltigeGeburtsJahr()
    {
        boolean res = StudentFHTrier.addStudentFHTrier("Jon", 1921, Fach.Wirtschaft);
        assertTrue(res);
    }

    @Test
    public void testGueltigeFachBereich()
    {
        boolean res = StudentFHTrier.addStudentFHTrier("Maria", 2004, Fach.Technik);
        assertTrue(res);
    }

    @Test
    public void testUnGueltigeName()
    {

        assertThrows(IllegalArgumentException.class, () -> StudentFHTrier.addStudentFHTrier(null, 1998, Fach.Informatik));
    }


    @Test
    public void testUnGueltigeGeburtsJahr()
    {
        assertThrows(IllegalArgumentException.class, () -> StudentFHTrier.addStudentFHTrier("Lia", 2005, Fach.Wirtschaft));
    }


    @Test
    public void testUnGueltigeFachBereich()
    {
        assertThrows(IllegalArgumentException.class, () -> StudentFHTrier.addStudentFHTrier("Toni", 2000, Fach.Medizin));
    }


    /*
     * ------------------------------zusaetzlich--------------------------------
     */

    @Test
    public void testGueltigeGeburtsJahr1()
    {
        boolean res = StudentFHTrier.addStudentFHTrier("Mark", 1950, Fach.Informatik);
        assertTrue(res);
    }

    @Test
    public void testGueltigeGeburtsJahr2()
    {
        boolean res = StudentFHTrier.addStudentFHTrier("Mark", 2004, Fach.Informatik);
        assertTrue(res);
    }

    @Test
    public void testGueltigeGeburtsJahr3()
    {
        boolean res = StudentFHTrier.addStudentFHTrier("Mark", 2000, Fach.Informatik);
        assertTrue(res);
    }

    @Test
    public void testGueltigeGeburtsJahr4()
    {
        boolean res = StudentFHTrier.addStudentFHTrier("Mark", 1970, Fach.Informatik);
        assertTrue(res);
    }

    @Test
    public void testGueltigeName1()
    {
        boolean res = StudentFHTrier.addStudentFHTrier("Wolfgang", 1990, Fach.Informatik);
        assertTrue(res);
    }

    @Test
    public void testGueltigeName2()
    {
        boolean res = StudentFHTrier.addStudentFHTrier("Fredrich", 1990, Fach.Informatik);
        assertTrue(res);
    }

    @Test
    public void testGueltigeFachBereich1()
    {
        boolean res = StudentFHTrier.addStudentFHTrier("Maria", 2004, Fach.Informatik);
        assertTrue(res);
    }

    @Test
    public void testGueltigeFachBereich2()
    {
        boolean res = StudentFHTrier.addStudentFHTrier("Maria", 2004, Fach.Wirtschaft);
        assertTrue(res);
    }

    @Test
    public void testGueltigeFachBereich3()
    {
        boolean res = StudentFHTrier.addStudentFHTrier("Maria", 2004, Fach.Technik);
        assertTrue(res);
    }

}
