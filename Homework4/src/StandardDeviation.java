
public class StandardDeviation {
	
	public static long stdDev(long[] numbers, long average){
		
		long sum = 0;
		
		// Take the deviation from average
		for(int i = 0; i < numbers.length; i++) {
			long deviations = numbers[i] - average ;   
			
			// get the square of deviation
			long square = deviations * deviations;
			
			// add Squares
			sum += square;
		}
		
		long total = sum/(numbers.length - 1);
		
		return  (long) Math.sqrt(total);
		
	}

}
