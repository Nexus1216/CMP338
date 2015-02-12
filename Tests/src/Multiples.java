import java.util.ArrayList;


public class Multiples {
	
	public static void main(String[] args) 
	{
		int[] set = {3, 5};
		
		System.out.println("\n" + getMultiples(set, 1000));
	}
	
	public static int getMultiples(int[] numbersToFind, int n){
		
		int sum = 0;
		ArrayList<Integer> multiples = new ArrayList();
		
		for(int i = 0; i < numbersToFind.length; i++){
			
			for(int j = 1; j < n; j++){
				if(j%numbersToFind[i] == 0){
					
					if(!multiples.contains(j)){
						multiples.add(j);
					}
				}	
			}
		}
		
		
		
		for (int i = 0; i < multiples.size(); i++){
				sum += multiples.get(i);
				System.out.println(multiples.get(i));
		}
		
		return sum;
	}

}
