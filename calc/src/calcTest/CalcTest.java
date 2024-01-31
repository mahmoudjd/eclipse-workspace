package calcTest;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import calc.Calc;

public class CalcTest {

	@Nested
	class PlusTest {

		Calc c = new Calc();

		@Test
		public void test_null() {

			int res = c.plus(0, 0);

			assertEquals(0, res);
		}

		@Test
		public void test_positiv_numbers() {
			int res = c.plus(1000, 50000);

			assertEquals(51000, res);
		}

		@Test
		public void test_negativ_numbers() {
			int res = c.plus(-200, -300);

			assertEquals(-500, res);
		}

		@Test
		public void test_posivtiv_negativ() {
			int res = c.plus(10, -5);
			assertEquals(5, res);
			int res2 = c.plus(-10, 5);
			assertEquals(-5, res2);
		}

		@Test
		public void test_max_value() {
			assertThrows(ArithmeticException.class, () -> c.plus(Integer.MAX_VALUE, 1));
		}

		@Test
		public void test_min_value() {
			assertThrows(ArithmeticException.class, () -> c.plus(Integer.MIN_VALUE, -1));
		}
	}

	@Nested
	class TestMinus {

		Calc c = new Calc();

		@Test
		public void test_null() {
			int res = c.minus(0, 0);

			assertEquals(0, res);
		}

		@Test
		public void test_positiv_numbers() {
			int res = c.minus(10, 5);
			assertEquals(5, res);
		}

		@Test
		public void test_negativ_numbers() {
			int res = c.minus(-10, -5);
			assertEquals(-5, res);
		}

		@Test
		public void test_negativ_positiv() {
			int res = c.minus(10, -5);
			assertEquals(15, res);
			int res2 = c.minus(-10, 5);
			assertEquals(-15, res2);
		}
		/*
		 * @Test public void test_max_value() { assertThrows(ArithmeticException.class,
		 * () -> c.minus(-2, Integer.MAX_VALUE - 1)); }
		 */

		@Test
		public void test_min_value() {
			assertThrows(ArithmeticException.class, () -> c.minus(Integer.MIN_VALUE, 1));
		}
	}
}
