import static org.junit.Assert.*;

import org.junit.Test;


public class LinearSearchTest {

	@Test
	public void test() {
		
		int[] numbers = new int[10000000];
		numbers[500 - 1] = 500;
		numbers[10000 - 1] = 10000;
		numbers[100000 - 1] = 100000;
		numbers[1000000 - 1] = 1000000;
		numbers[5000000 - 1] = 5000000;
		numbers[7000000 - 1] = 7000000;
		numbers[10000000 - 1] = 10000000;
		
		int pass = 10000000;
		int fail = 2;
		
		assertEquals(true, LinearSearch.linearSearch(numbers, pass));
		assertEquals(false, LinearSearch.linearSearch(numbers, fail));
	}

}
