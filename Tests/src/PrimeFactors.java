import java.util.ArrayList;


public class PrimeFactors {

	public static void main(String[] args) {
		
		System.out.println(largestPrimeFactors(600851475143l));
	}
	
	public static long getLargestPrimeNumber(long number){
		long  primeFactor = 2;
		while (number > primeFactor){
			if (number%primeFactor==0){
				number = number/primeFactor;
				primeFactor = 2;
			}
			else{
				primeFactor++;
			}
		}
		
		System.out.println(primeFactor);
		return primeFactor;
	}
	
	public static long largestPrimeFactors(long n){
		
		ArrayList<Long> factors = new ArrayList();
		long counter = 1;
		while(counter < n){
			counter++;
			
			if(n%counter == 0){
				factors.add(counter);
			}
			
		}
		
		ArrayList<Long> primeFractors = new ArrayList();
		
		for(int i = 0; i < factors.size(); i++){
			boolean prime = true;
			boolean stop = false;
			counter = 2;
			while (!stop){
				if(factors.get(i)%counter == 0){
					prime = false;
				}
				counter++;
				
				if(!prime || counter >= factors.get(i)){
					stop = true;
				}
			}
			
			if(prime){
				primeFractors.add(factors.get(i));
				System.out.println(factors.get(i));
			}
		}
		
		return primeFractors.get(primeFractors.size() - 1);
	}

}
