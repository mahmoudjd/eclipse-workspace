package uebung;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestTaschenRechner {

	@Test
	public void testAddZweiPos() { 
		double res = TaschenRechner.Add(10.0, 10.0);
		assertEquals(20.0, res, 0);
	}
	
	@Test
	public void testPotenzHoch5 () { 
		double res = TaschenRechner.Potenz(10.0, 5); 
		assertEquals(100000.0, res, 0);
	}
}
