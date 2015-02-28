
public class Runner {
	
	public static void CreateTables(LinkedList linked, ArrayList array, String[] numbers){
	
		long linkedRunTime = 0;
		long arrayRunTime = 0;
		
		long[][] linkedTimes = new long[numbers.length][10];
		long[][] arrayTimes = new long[numbers.length][10];
		
		long linkedAverage[] = new long [numbers.length];
		long arrayAverage[] = new long [numbers.length];
		
		long linkedStdDev[] = new long [numbers.length];
		long arrayStdDev[] = new long [numbers.length];
		
				
		for(int i = 0; i < numbers.length; i++)
		{
			linkedRunTime = 0;
			arrayRunTime = 0;
			
			
			for(int j = 0; j < 10; j++)
			{
				//Run executeLinked for value at element[i] and record execution time
				long startTime = System.currentTimeMillis();
				
				Populate.excute(linked, i);
				
				long stopTime = System.currentTimeMillis();
				
				linkedRunTime += (stopTime - startTime);
				
				linkedTimes[i][j] = (stopTime - startTime);
				
				//Do the same for executeArray
				startTime = System.currentTimeMillis();
				
				Populate.excute(array, i);
				
				stopTime = System.currentTimeMillis();
				
				arrayRunTime += (stopTime - startTime);
				
				arrayTimes[i][j] = (stopTime - startTime);
				
			}
			
			linkedAverage[i] = linkedRunTime/10;
			arrayAverage[i] = arrayRunTime/10;
			linkedStdDev[i] = StandardDeviation.stdDev(linkedTimes[i], linkedAverage[i]);
			arrayStdDev[i] = StandardDeviation.stdDev(arrayTimes[i], arrayAverage[i]);
		}
		
		Results.Print (numbers, linkedTimes, linkedAverage, linkedStdDev, "Linked  List");
		
		Results.Print (numbers, arrayTimes, arrayAverage, arrayStdDev, "Array List");
		
	}

}
