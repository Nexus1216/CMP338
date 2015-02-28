
public class Tests {

	public static void main(String[] args) {
		//Enter the number of the Homework assignment task (1 - 6) to view the results
		int questionNum = 4;
		LinkedList linked = new LinkedList();
		ArrayList array = new ArrayList();
		
		Populate.excute(linked, questionNum);
		Populate.excute(array, questionNum);
		
		linked.showList();
		array.showList();

	}

}
