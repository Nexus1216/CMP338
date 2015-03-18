
public class Tests {

	public static void main(String[] args) {
		//Enter the number of the Homework assignment task (1 - 6) to view the results
		int questionNum = 4;
		Queue linked = new Queue();
		ArrayQueue array = new ArrayQueue();
		
			Populate.excute(linked, questionNum);
			linked.showQueue();
			System.out.println(Populate.memoryCheck());
		
			Populate.excute(array, questionNum);
			array.showQueue();
			System.out.println(Populate.memoryCheck() + "\n");
		
		
	}
	
	
	
	

}
