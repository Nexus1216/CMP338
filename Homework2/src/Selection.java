
public class Selection {
	
	public static void Sort(int[] a){
		int min = -1;
		int minIndex = 0;
		
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
