import java.util.ArrayList;


public class EvenFibonacciNumbers {

	public static void main(String[] args) {
		
		
		System.out.println("\n" + evenFiBs(4000000));
	}
	
	public static int evenFiBs(int n){
		int sum = 0;
		ArrayList<Integer> fibs = new ArrayList();
		fibs.add(1);
		fibs.add(2);
		
		while(fibs.get(fibs.size() - 1) < n){
			fibs.add((fibs.get(fibs.size() - 1) + fibs.get(fibs.size() - 2)));
		}
		
		for(int i = 0; i < fibs.size() - 1; i++){
			
			if(fibs.get(i)%2 == 0){
				System.out.println(fibs.get(i));
				sum += fibs.get(i);
			}
		}
		
		
		return sum;
	}

}
