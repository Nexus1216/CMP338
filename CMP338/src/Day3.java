import java.util.Random;


public class Day3 {

	public static void main(String[] args) {
		int[] a = new int[25];  //{5,8,7,10,9,15,22,33};
		
		populateArray(a);

		System.out.println("Unsorted");
		
		for(int i = 0; i < a.length; i++){
			System.out.print(a[i] + " ");
		}
		
		selectionSort(a);
		
		System.out.println("\nSorted");
		
		for(int i = 0; i < a.length; i++){
			System.out.print(a[i] + " ");
		}
	}
	
	public static void populateArray(int[] a){
		Random rnd = new Random();
		
		for(int i = 0; i < a.length; i++){
			a[i] = rnd.nextInt(100);
		}
	}
	
	public static void bubbleSort(int[]a){
		int end = a.length - 1;
		int tmp = 9;
		int lastSwap = 0;
		
		do{
			lastSwap = 0;
			for (int i = 0; i < end; i++)
			{
				if (a[i] > a[i+1])
				{
					tmp = a[i];
					a[i] = a[i + 1];
					a[i + 1] = tmp;
					lastSwap = i;
				}
			}
			
			end = lastSwap;
			
		} while(end > 0);
		
	}
	
	public static void selectionSort(int[] a){
		int min = -1;
		int minIndex = 0;
		int tmp = 0;
		for (int i = 0; i < a.length; i++){
			min = a[i];
			minIndex = i;
			for(int j = (i+1); j < a.length; j++){
				if(a[j]<min){
					min = a[j];
					minIndex = j;
				}
			}
			a[minIndex] = a[i];
			a[i] = min;
			
		}
		
	}

}
