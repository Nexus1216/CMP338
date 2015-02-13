
public class Day2 {

	public static void main(String[] args) {
		/*
		 
		 */

	}
	
	public static int binarySearch(int[] a, int low, int high, int target){
		if (low>high){
			return - 1;
		}
		else{
			int mid = (low + high) / 2;
			if(a[mid] == target){
				return mid;
			}
			else if (a[mid] < target){
				return binarySearch(a, mid + 1, high, target);
			}
			else {
				return binarySearch(a, low, mid - 1, target);
			}
				
		}
		
	}
	

	
	public static void binarySearch(int[] a, int target){
		boolean found = false;
		int low = 0;
		int high = a.length - 1;
		int mid =  (low + high) / 2;
		
		while (low <= high){
			if(a[mid] == target){
				found = true;
				break;
			}
			else if(a[mid] < target){
				low = mid + 1;
			}
			else{
				high = mid - 1;
			}
		}
	}
	
	public static void selectionSort(int[]a){
		
	}
	
	
}
