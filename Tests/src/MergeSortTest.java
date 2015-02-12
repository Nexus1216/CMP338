import static org.junit.Assert.*;

import org.junit.Test;


public class MergeSortTest {

	@Test
	public void test() {
		int[] a = {1,3,5,7,9};
		int[] b = {2,4,6,8,0};
		
		int[] c = {0,1,2,3,4,5,6,7,8,9};
		
		for(int i = 0; i < (a.length + b.length); i++)
			assertEquals( c[i] , Merge.mergeSort(a, b)[i] );
	}

}
