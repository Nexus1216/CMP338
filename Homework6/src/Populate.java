import java.text.DecimalFormat;
import java.util.UUID;
import java.util.Vector;

public class Populate<T> {
	
	public static int size = 13107; 
	public static int showSize = 1000; 
	public static Vector<Person> people = new Vector<Person>(size); 
	public static BinarySearchTree<Person, String> BST = new BinarySearchTree<Person, String>();
	
	
	
	public static void execute(int testNum){
		
		fill();
		
		if(testNum == 1){
			BST.makeEmpty();
			fillBST();
		}
		if(testNum == 2){
			search();
		}
		if(testNum == 3){
			showTree();
		}
		if(testNum == 4){
			showHeight();
		}
		if(testNum == 5){
			balanceTree(0, Populate.size);
		}
		if(testNum == 6){
			search();
		}
		if(testNum == 7){
			showHeight();
		}
		
		
	}
	
	public static String generateName(){
		String uuid = UUID.randomUUID().toString();
		return uuid;
	}
	
	public static String generateNumber(){
		long phoneFmt = (long) Math.floor(Math.random() * 9000000000L) + 1000000000L;
		
		//get a 12 digits String, filling with left '0' (on the prefix)   
		DecimalFormat phoneDecimalFmt = new DecimalFormat("0000000000");
		String phoneRawString= phoneDecimalFmt.format(phoneFmt);

		java.text.MessageFormat phoneMsgFmt=new java.text.MessageFormat("({0})-{1}-{2}");
		    //suposing a grouping of 3-3-4
		String[] phoneNumArr={phoneRawString.substring(0, 3),
		          phoneRawString.substring(3,6),
		          phoneRawString.substring(6)};

		return phoneMsgFmt.format(phoneNumArr);
	}
	
	public static void fill(){
		for(int i = 0; i < size; i++){
			people.add(new Person(generateName(), generateNumber()));
		}
		
	}
	
	public static void fillBST(){
		
		for(int i = 0; i < people.size(); i++){
			BST.insert(people.elementAt(i));
		}
		
		
	}
	
	public static void showHeight(){
		int height = 0;
		if(BST.isEmpty()){
	        height = 0;
	    }
	    else{
	        TreeNode<Person> node = BST.root;
	        height = BST.treeHeight(node);
	    }
		
		System.out.println("\nHeight - " + height);
	}
	
	public static void balanceTree(int low, int high){

	    if(low == high)
	        return;

	    int midpoint = (low + high)/2;

	    Person insert = people.get(midpoint);
	    BST.insert(insert);

	    balanceTree(midpoint+1, high);
	    balanceTree(low, midpoint);  
	}
	
	public static void search(){
		boolean allThere = true;
		String at = "It's all There";
		
		for(int i = 0; i < size; i++){
			if(BST.retrieve(people.elementAt(i).getName()) == null){
				allThere = false;
			}
		}
		
		if(!allThere){
			at = "We didn't make it";
		}
			
		System.out.println(at);
	}
	
	
	
	public static void showTree(){
		Treelterator<Person> tList = new Treelterator<Person>(BST);
		Treelterator<Person> vList = new Treelterator<Person>(people);
		tList.setInorder();
		int listSize = 0;
		while (listSize < showSize){
			System.out.println(vList.vNext());
			//System.out.println(tList.next());
			listSize++;
		}
	}
	
	
	public static long memoryCheck(){
		Runtime runtime = Runtime.getRuntime();
		long KB = 1024;
		long MB = 1024*1024;		
		runtime.gc();
		
		long usage = (runtime.totalMemory() - runtime.freeMemory())/MB;
		return usage;
	}
	
	
}
