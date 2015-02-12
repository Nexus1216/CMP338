import java.util.Scanner;


public class Palindrome 
{
	public static boolean isPalindrome(String original)
	{
		String reverse = "";
		
		for(int i = original.length() - 1; i >= 0; i--)
		{
			reverse = reverse + original.charAt(i);
		}
		
		if(reverse.equals(original))
			//System.out.println(original + " is a Palindrome.");
			return true;
		else
			//System.out.println(original + " is not a Palindrome. ");
			return false;
		
	}

	
	
	

}
