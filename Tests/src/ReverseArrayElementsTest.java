import static org.junit.Assert.*;

import org.junit.Test;


public class ReverseArrayElementsTest {

	@Test
	public void test() {
		String[] normal = {"a","b","c","d","e","f","g","h"};
		String[] reversed = {"h","g","f","e","d","c","b","a"};
		
		ReverseArrayElements.reverseElements(normal);
			
		assertEquals(reversed,normal);
	}

}
