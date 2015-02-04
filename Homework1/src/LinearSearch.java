
public class LinearSearch {
	
	public static boolean linearSearch(int[] array, int num){
		int element = 0;
		boolean found = false;
		boolean quit = false;
		
		
		while(!quit){
			if(array[element] == num)
				found = true;
			
			if(element >= array.length - 1 || found)
				quit = true;
			
				element++;
		}
		
		return found;
	}

}
