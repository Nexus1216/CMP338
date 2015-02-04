
public class Driver {
			
	public static void main(String[] args) {
		int[] set = new int[10000000];
		
		for(int i = 0; i < set.length; i++){
			set[i] = i + 1;
		}
		
		int[] numbers = {500, 10000, 100000, 1000000, 5000000, 7000000, 10000000};
		
		Runner.CreateTables(set, numbers);
	}
	
	
	
	


}
