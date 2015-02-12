import static org.junit.Assert.*;

import org.junit.Test;


public class PalindromeTest {

	@Test
	public void testPalindrome(){
		String pass = "toot";
		String fail = "one";
		
		assertEquals( true, Palindrome.isPalindrome(pass) );
		assertEquals( false, Palindrome.isPalindrome(fail) );
	}

}
