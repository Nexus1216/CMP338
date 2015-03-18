
public class Driver {

	public static void main(String[] args) {
		Queue linked = new Queue();
		ArrayQueue array = new ArrayQueue();
		
		String[] tests = {"Integer Queue", "Integer DeQueue", "String Queue", "String DeQueue"};
		
		CreateTables(linked, array, tests);

	}
	
	public static void CreateTables(Queue linked, ArrayQueue array, String[] numbers){
		
		String linkedPerformance = "";
		String arrayPerformance = "";
		
		long linkedRunTime = 0;
		long arrayRunTime = 0;
		
		long[][] linkedTimes = new long[numbers.length][10];
		long[][] arrayTimes = new long[numbers.length][10];
		
		long linkedAverage[] = new long [numbers.length];
		long arrayAverage[] = new long [numbers.length];
		
		long linkedStdDev[] = new long [numbers.length];
		long arrayStdDev[] = new long [numbers.length];
		
				
		for(int i = 1; i <= numbers.length; i++)
		{
			linkedRunTime = 0;
			arrayRunTime = 0;
			
			
			for(int j = 0; j < 10; j++)
			{
				//Run executeLinked for value at element[i] and record execution time
				long startTime = System.nanoTime();
				
				Populate.excute(linked, i);
				
				long stopTime = System.nanoTime();
				
				linkedRunTime += (stopTime - startTime)/1000;
				
				linkedPerformance = (" Reference Based Queue Memory Usage; " + Populate.memoryCheck() + "KB" + " RunTime: " + (linkedRunTime/10) + "ns");
				
				linkedTimes[i - 1][j] = (stopTime - startTime)/1000;
				
				//Do the same for executeArray
				startTime = System.nanoTime();
				
				Populate.excute(array, i);
				
				stopTime = System.nanoTime();
						
				arrayRunTime += (stopTime - startTime)/1000;

				arrayPerformance = ("Array Based Queue Memory Usage; " + Populate.memoryCheck() + "KB" + " RunTime: " + (arrayRunTime/10) + "ns");
				
				arrayTimes[i - 1][j] = (stopTime - startTime)/1000;
				
			}
			
			linkedAverage[i - 1] = linkedRunTime/10;
			arrayAverage[i - 1] = arrayRunTime/10;
			linkedStdDev[i - 1] = StandardDeviation.stdDev(linkedTimes[i - 1], linkedAverage[i - 1]);
			arrayStdDev[i - 1] = StandardDeviation.stdDev(arrayTimes[i - 1], arrayAverage[i - 1]);
			
			System.out.println("Test: " + i + linkedPerformance + "    "+ arrayPerformance);
		}
		
		Results.Print (numbers, linkedTimes, linkedAverage, linkedStdDev, "Reference Queue");
		
		Results.Print (numbers, arrayTimes, arrayAverage, arrayStdDev, "Array Queue");
		
	}

}
