
public class BinaryResults {
	
public static void Print (int[] numbers, long[][] binaryTimes, long[] binaryAverage, long[] binaryStdDev){
		
		System.out.println("\n\n\n\n\n\n--------------------------------Binary Search"
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
				System.out.printf("%8dns ", binaryTimes[j][i]);
					
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
			System.out.printf("%8dns ", binaryAverage[i]);
			
			if(i == numbers.length - 1)
				System.out.println("\n");
		}
		
		for (int i = 0; i < numbers.length; i++)
		{
			System.out.printf("%8dns ", binaryStdDev[i]);
				
		}
	}

}
