import java.util.Random;


public class Populate {
	
	public static void excute(int[] set, int i){
		if (i == 0 || i == 5){
			identicle(set, 5);
		}
		
		if (i == 1 || i == 6){
			random(set, 10000);
		}
		
		if (i == 2 || i == 7){
			increase(set);
		}
		
		if (i == 3 || i == 8){
			decrease(set);
		}
		
		if (i == 4 || i == 9){
			lastMileRandom(set, 10000, 100);
		}
	}
	
	
	public static void identicle(int[] a, int n){
		
		for(int i = 0; i < a.length; i++){
			a[i] = n;
		}
	}
	
	public static void random(int[] a, int range){
		Random rnd = new Random();
		
		for(int i = 0; i < a.length; i++){
			a[i] = rnd.nextInt(range);
		}
	}
	
	public static void increase(int[] a){
		
		for(int i = 0; i < a.length; i++){
			a[i] = i + 1;
		}
	}
	
	
	public static void decrease(int[] a){
		
		for(int i = a.length - 1; i >= 0; i--){
			a[i] = i + 1;
		}
	}
	
	public static void lastMileRandom(int[] a, int range, int randomPoint){
		Random rnd = new Random();
		
		for(int i = 0; i < a.length; i++){
			if(i < a.length - randomPoint){
				a[i] = i + 1;
			}
			else{
				a[i] = rnd.nextInt(range);
			}
			
		}
	}
}
