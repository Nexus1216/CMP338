
public class Driver {

	public static void main(String[] args) {
		int[] shortList = new int[1000];
		int[] longList = new int[10000];
		
		String[] tests = {"Identical Short", "Random Short", "Increasing Short", "Decreasing Short", "Last Mile Short",
				"Identical Long", "Random Long", "Increasing Long", "Decreasing Long", "Last Mile Long"};
		
		Runner.CreateTables(shortList, longList, tests);
		
	}
	
	

}
