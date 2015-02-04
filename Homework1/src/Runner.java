
public class Runner {
	
public static void CreateTables(int[] set, int[] numbers){
		
		long linearRunTime = 0;
		long binaryRunTime = 0;
		
		long[][] linearTimes = new long[numbers.length][10];
		long[][] binaryTimes = new long[numbers.length][10];
		
		long linearAverage[] = new long [numbers.length];
		long binaryAverage[] = new long [numbers.length];
		
		long linearStdDev[] = new long [numbers.length];
		long binaryStdDev[] = new long [numbers.length];

		
		
		
		for(int i = 0; i < numbers.length; i++)
		{
			linearRunTime = 0;
			binaryRunTime = 0;
			
			for(int j = 0; j < 9; j++)
			{
				//Run linearSearch for value at element[i] and record execution time
				long startTime = System.currentTimeMillis();
				
				LinearSearch.linearSearch(set, numbers[i]);
				
				long stopTime = System.currentTimeMillis();
				
				linearRunTime += (stopTime - startTime);
				
				linearTimes[i][j] = (stopTime - startTime);
				
				//Do the same for Binary Search
				startTime = System.currentTimeMillis();
				
				BinarySearch.binarySearch(set, numbers[i], 0, numbers.length - 1);
				
				stopTime = System.currentTimeMillis();
				
				binaryRunTime += (stopTime - startTime);
				
				binaryTimes[i][j] = (stopTime - startTime);
				
			}
			
			linearAverage[i] = linearRunTime/10;
			binaryAverage[i] = binaryRunTime/10;
			linearStdDev[i] = StandardDeviation.stdDev(linearTimes[i], linearAverage[i]);
			binaryStdDev[i] = StandardDeviation.stdDev(binaryTimes[i], binaryAverage[i]);
			
		}
		
		LinearResults.Print (numbers, linearTimes, linearAverage, linearStdDev);
		
		BinaryResults.Print (numbers, binaryTimes, binaryAverage, binaryStdDev);
			
		
		
	}


}
