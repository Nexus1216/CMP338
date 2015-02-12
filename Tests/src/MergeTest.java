import static org.junit.Assert.*;

import org.junit.Test;


public class MergeTest {

	@Test
	public void test() {
		int[] a = {1,3,5,7,9};
		int[] b = {2,4,6,8,0};
		
		int[] c = {1,3,5,7,9,2,4,6,8,0};
		
		for(int i = 0; i < (a.length + b.length); i++)
			assertEquals( c[i] , Merge.mergeArrays(a, b)[i] );
		
		
	}

}
