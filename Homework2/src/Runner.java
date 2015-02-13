
public class Runner {
	
public static void CreateTables(int[] set1, int[] set2, String[] numbers){
	
		long startTime = 0;
		long stopTime = 0;
		
		long bubbleRunTime = 0;
		long selectionRunTime = 0;
		long insertionRunTime = 0;
		
		long[][] bubbleTimes = new long[numbers.length][10];
		long[][] selectionTimes = new long[numbers.length][10];
		long[][] insertionTimes = new long[numbers.length][10];
		
		long bubbleAverage[] = new long [numbers.length];
		long selectionAverage[] = new long [numbers.length];
		long insertionAverage[] = new long [numbers.length];
		
		long bubbleStdDev[] = new long [numbers.length];
		long selectionStdDev[] = new long [numbers.length];
		long insertionStdDev[] = new long [numbers.length];
		
		
		
		for(int i = 0; i < numbers.length; i++)
		{
			bubbleRunTime = 0;
			selectionRunTime = 0;
			insertionRunTime = 0;
			
			if(i < numbers.length/2){
				Populate.excute(set1, i);
			}
			else{
				Populate.excute(set2, i);
			}
			
			for(int j = 0; j < 10; j++)
			{
				//Run Bubble Sort for value at element[i] and record execution time
				startTime = System.nanoTime();
				
				if(i < numbers.length/2){
					Bubble.Sort(set1);
				}
				else{
					Bubble.Sort(set2);
				}
				
				stopTime = System.nanoTime();
				
				bubbleRunTime += (stopTime - startTime);
				
				bubbleTimes[i][j] = (stopTime - startTime);
				
				//Do the same for Selection Sort
				startTime = System.nanoTime();
				
				if(i < numbers.length/2){
					Selection.Sort(set1);
				}
				else{
					Selection.Sort(set2);
				}
				
				stopTime = System.nanoTime();
				
				selectionRunTime += (stopTime - startTime);
				
				selectionTimes[i][j] = (stopTime - startTime);
				
				//and again for Insertion Sort
				startTime = System.nanoTime();
				
				if(i < numbers.length/2){
					Insertion.Sort(set1);
				}
				else{
					Insertion.Sort(set2);
				}
				
				stopTime = System.nanoTime();
				
				insertionRunTime += (stopTime - startTime);
				
				insertionTimes[i][j] = (stopTime - startTime);
				
			}
			
			bubbleAverage[i] = bubbleRunTime/10;
			selectionAverage[i] = selectionRunTime/10;
			insertionAverage[i] = insertionRunTime/10;
			bubbleStdDev[i] = StandardDeviation.stdDev(bubbleTimes[i], bubbleAverage[i]);
			selectionStdDev[i] = StandardDeviation.stdDev(selectionTimes[i], selectionAverage[i]);
			insertionStdDev[i] = StandardDeviation.stdDev(insertionTimes[i], insertionAverage[i]);
		}
		
		Results.Print (numbers, bubbleTimes, bubbleAverage, bubbleStdDev, " Bubble  Sort ");
		
		Results.Print (numbers, selectionTimes, selectionAverage, selectionStdDev, "Selection Sort");
			
		Results.Print (numbers, insertionTimes, insertionAverage, insertionStdDev, "Insertion Sort");
		
	}

}
