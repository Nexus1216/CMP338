
public class ReverseArrayElements 
{
	public static void reverseElements (String[] array)
	{
		String[] temp = new String[array.length];
		
		for(int i = array.length - 1; i >= 0; i--)
		{
			temp[(array.length - 1) - i] = array[i];
		}
		
		for (int i = 0; i <= array.length - 1; i++)
		{
			array[i] = temp[i];
		}
	}

}
