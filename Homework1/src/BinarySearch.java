
public class BinarySearch {
	
	public static boolean binarySearch(int[] array, int num, int start, int end){
		
		if(start == end)
		{
			return array[start] == num;
		}
		if(end - start == 1)
		{
			return (array[start] == num) || (array[end] == num);
		}
		
		int middleIndex = (end + start)/2;
		
		if(array[middleIndex] > num)
		{
			return binarySearch(array,num,start,middleIndex - 1);
		}
		else
		{
			return binarySearch(array,num,middleIndex,end );
		}
		
		
	}

}
