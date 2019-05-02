import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.RecursiveFunctions;

class RecursiveFunctionsTest {

	@Test
	void factorialTest() {
		assertEquals(120, RecursiveFunctions.factorial(5));
		assertEquals(5040, RecursiveFunctions.factorial(7));
		assertEquals(3628800, RecursiveFunctions.factorial(10));
	}
	
	@Test
	void fibonacciTest() {
		assertEquals(0, RecursiveFunctions.fibonacci(0));
		assertEquals(3, RecursiveFunctions.fibonacci(4));
		assertEquals(5, RecursiveFunctions.fibonacci(5));
	}
	
	@Test
	void arraySumatoryTest() {
		int[] a = {2,5,8};
		int[] b = {1,6,4};
		int[] c = {6,7,4};
		assertEquals(15, RecursiveFunctions.arraySumatory(a));
		assertEquals(11, RecursiveFunctions.arraySumatory(b));
		assertEquals(17, RecursiveFunctions.arraySumatory(c));
	}

}
