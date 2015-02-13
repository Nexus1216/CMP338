
public class Insertion {
	
	public static void Sort(int a[]){
		int curr = 0;
		int tmp = 0;
		
		for (int i = 1; i < a.length; i++){
			curr = i;
			tmp = a[i];
		  
			while ((curr > 0) && (a[curr-1] > tmp)){
				a[curr] = a[curr-1];
				curr--;
			}
			  
			a[curr] = tmp;
		  }
		  
		  
		}

}
