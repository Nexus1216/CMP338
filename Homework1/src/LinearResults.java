
public class LinearResults {
	
	public static void Print (int[] numbers, long[][] linearTimes, 
			long[] linearAverage, long[] linearStdDev){
		
		System.out.println("\n--------------------------------Linear Search"
				+ "-------------------------------\n");
		
		for (int i = 0; i < numbers.length; i++)
		{
			System.out.printf("%,10d ", numbers[i]);
			
			if (i == numbers.length - 1){
				System.out.println("\n------------------------------"
						+ "----------------------------------------------\n");
			}
		}
		

		for (int i = 0; i < 10; i++)
		{
			for (int j = 0; j < numbers.length; j++)
			{
				System.out.printf("%6TL(ms) ", linearTimes[j][i]);
					
			}
			
			if (i == 9){ 
				System.out.println("\n------------------------------"
						+ "----------------------------------------------\n");
				
			}
			else
				System.out.println("\n");
		}
		
		
		
		for (int i = 0; i < numbers.length; i++)
		{
			System.out.printf("%6TL(ms) ", linearAverage[i]);
			
			if(i == numbers.length - 1)
				System.out.println("\n");
		}
		
		for (int i = 0; i < numbers.length; i++)
		{
			System.out.printf("%6TL(ms) ", linearStdDev[i]);
				
		}
	}

}
