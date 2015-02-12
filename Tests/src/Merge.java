import java.util.Arrays;


public class Merge {
	
	public static void main(String[] args) 
	{
		int[] a = {1,3,5,7,9};
		int[] b = {2,4,6,8,0};
		
		
		for(int i = 0; i < (a.length + b.length); i++)
			System.out.println(Merge.mergeSort(a, b)[i]);
	}
	
	public static int[] mergeArrays(int[] a, int[] b){
		int[] c = new int [a.length + b.length];
		
		for(int i = 0; i < c.length; i++)
		{
			if (i < a.length)
				c[i] = a[i];
			else
				c[i] = b[i - a.length ];
		}
		
		return c;
		
	}
	
	public static int[] mergeSort(int[] a, int[] b){
		
		int[] c = new int [a.length + b.length];
		
		for(int i = 0; i < c.length; i++)
		{
			if (i < a.length)
				c[i] = a[i];
			else
				c[i] = b[i - a.length ];
		}
		
		//Arrays.sort(c);
		
		boolean swapped = true;
	    int j = 0;
	    int tmp;
	    while (swapped) 
	    {
	        swapped = false;
	        j++;
	        
	        for (int i = 0; i < c.length - j; i++) 
	        {
	            if (c[i] > c[i + 1]) 
	            {
	                tmp = c[i];
	                c[i] = c[i + 1];
	                c[i + 1] = tmp;
	                swapped = true;
	            }
	        }
	    }
		
		
		return c;
	}

}
