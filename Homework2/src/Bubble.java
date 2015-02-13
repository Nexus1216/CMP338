
public class Bubble {
	
	public static void Sort(int[]a){
		int end = a.length - 1;
		int tmp = 0;
		int lastSwap = 0;
		
		do{
			lastSwap = 0;
			for (int i = 0; i < end; i++)
			{
				if (a[i] > a[i+1])
				{
					tmp = a[i];
					a[i] = a[i + 1];
					a[i + 1] = tmp;
					lastSwap = i;
				}
			}
			
			end = lastSwap;
			
		} while(end > 0);
		
	}

}
