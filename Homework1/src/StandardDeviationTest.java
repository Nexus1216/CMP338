import static org.junit.Assert.*;

import org.junit.Test;


public class StandardDeviationTest {

	@Test
	public void test() {
		long sum = 0;
		long[] testSet = {0, 16, 0, 15, 0, 16, 0, 0, 16, 0};
		
		for(int i = 0; i < testSet.length; i++){
			sum += testSet[i];
		}
		
		long mean  = sum/testSet.length;
		
		
		
		assertEquals(8,StandardDeviation.stdDev(testSet, mean));
	}

}
