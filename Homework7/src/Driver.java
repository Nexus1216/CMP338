
public class Driver {

	public static void main(String[] args) {
		
		String[] tests = {"Merge Ascend", "Merge Random", "Merge Descend","QS Mid Ascend", "QS Mid Random", "QS Mid Descend","QS 1st Ascend", "QS 1st Random", "QS 1st Decend", "QS RND Ascend", "QS RND Random", "QS RND Descend", "Heap Ascend", "Heap Random", "Heap Descend"};
		
		
		CreateTables(tests);

	}
	
	public static void CreateTables(String[] numbers){
		
		int n = 10;
		
		String performance = "";
		
		long runTime = 0;
		
		long[][] times = new long[numbers.length][n];
		
		long average[] = new long [numbers.length];
		
		long stdDev[] = new long [numbers.length];
		
				
		for(int i = 1; i <= numbers.length; i++)
		{
			runTime = 0;
			
			for(int j = 0; j < n; j++)
			{
				//Run executeLinked for value at element[i] and record execution time
				long startTime = System.currentTimeMillis();
				
				Populate.execute(i);
				
				long stopTime = System.currentTimeMillis();
				
				runTime += (stopTime - startTime);
				
				performance = (" Memory Usage; " + Populate.memoryCheck() + "KB" + " RunTime: " + (runTime/n) + "ms");
				
				times[i - 1][j] = (stopTime - startTime);
				
				
			}
			
			average[i - 1] = runTime/n;
			stdDev[i - 1] = StandardDeviation.stdDev(times[i - 1], average[i - 1]);
			
			System.out.println("Test: " + i + performance);
		}
		
		Results.Print (numbers, times, average, stdDev, "Results");
		
		
	}
	
	

}
