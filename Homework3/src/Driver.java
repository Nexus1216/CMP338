
public class Driver {

	public static void main(String[] args) {
		LinkedList linked = new LinkedList();
		ArrayList array = new ArrayList();
		
		String[] tests = {"Add Odd", "Add Even", "Fill List", "Add At", "Remove Even", "Remove Odd"};
		
		Runner.CreateTables(linked, array, tests);

	}

}
