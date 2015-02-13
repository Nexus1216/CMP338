
public class Results {
	
public static void Print (String[] numbers, long[][] Times, long[] Average, long[] StdDev, String title){
		
		System.out.println("\n\n\n\n\n\n");
		for (int i = 0; i < ((numbers.length * 18)/2) - (title.length()/2); i++){
			System.out.print("-");
		}
		
		System.out.print(title);
		
		for (int i = 0; i <= ((numbers.length * 18)/2) - (title.length()/2); i++){
			System.out.print("-");
		}
		System.out.println("\n");
		
		for (int i = 0; i < numbers.length; i++)
		{
			System.out.printf("%15s | ", numbers[i]);
			
			if (i == numbers.length - 1){
				System.out.println("\n");
				for (int k = 0; k <= numbers.length * 18; k++){
					System.out.print("-");
				}
				System.out.println("\n");
			}
		}
		
		for (int i = 0; i < 10; i++)
		{
			for (int j = 0; j < numbers.length; j++)
			{
				System.out.printf("%,15dns ", Times[j][i]);
					
			}
			
			if (i == 9){ 
				System.out.println("\n");
				for (int k = 0; k <= numbers.length * 18; k++){
					System.out.print("-");
				}
				System.out.println("\n");
				
			}
			else
				System.out.println("\n");
		}
		
		
		
		for (int i = 0; i < numbers.length; i++)
		{
			System.out.printf("%,15dns ", Average[i]);
			
			if(i == numbers.length - 1)
				System.out.println("\n");
		}
		
		for (int i = 0; i < numbers.length; i++)
		{
			System.out.printf("%,15dns ", StdDev[i]);
				
		}
	}

}
