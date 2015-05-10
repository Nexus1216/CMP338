import java.text.DecimalFormat;
import java.util.Collections;
import java.util.UUID;
import java.util.Vector;

public class Populate {
	
	public static int size = 10000; 
	public static Vector<Person> random = new Vector<Person>(); 
	public static Vector<Person> ascending = new Vector<Person>(); 
	public static Vector<Person> decending = new Vector<Person>(); 
	
	
	
	public static void execute(int testNum){
		
		
		if(testNum == 1){
			Sort.merge(ascending);
			fillAscending();
			//System.out.println(ascending.toString());
			System.out.println("Test: " + testNum + " Completed");
			ascending.clear();
		}
		if(testNum == 2){
			Sort.merge(random);
			fillRandom();
			//System.out.println(random.toString());
			System.out.println("Test: " + testNum + " Completed");
			random.clear();
		}
		if(testNum == 3){
			Sort.merge(decending);
			fillDescending();
			//System.out.println(decending.toString());
			System.out.println("Test: " + testNum + " Completed");
			decending.clear();
		}
		if(testNum == 4){
			Sort.quickMid(ascending, 0, ascending.size()-1);
			fillAscending();
			//System.out.println(ascending.toString());
			System.out.println("Test: " + testNum + " Completed");
			ascending.clear();
		}
		if(testNum == 5){
			Sort.quickMid(random, 0, random.size()-1);
			fillRandom();
			//System.out.println(random.toString());
			System.out.println("Test: " + testNum + " Completed");
			random.clear();
		}
		if(testNum == 6){
			Sort.quickMid(decending, 0, decending.size()-1);
			fillDescending();
			//System.out.println(decending.toString());
			System.out.println("Test: " + testNum + " Completed");
			decending.clear();
		}
		if(testNum == 7){
			Sort.quickFirst(ascending, 0, ascending.size()-1);
			fillAscending();
			//System.out.println(ascending.toString());
			System.out.println("Test: " + testNum + " Completed");
			ascending.clear();
		}
		if(testNum == 8){
			Sort.quickFirst(random, 0, random.size()-1);
			fillRandom();
			//System.out.println(random.toString());
			System.out.println("Test: " + testNum + " Completed");
			random.clear();
		}
		if(testNum == 9){
			Sort.quickFirst(decending, 0, decending.size()-1);
			fillDescending();
			//System.out.println(decending.toString());
			System.out.println("Test: " + testNum + " Completed");
			decending.clear();
		}
		if(testNum == 10){
			Sort.quickRandom(ascending, 0, ascending.size()-1);
			fillAscending();
			//System.out.println(ascending.toString());
			System.out.println("Test: " + testNum + " Completed");
			ascending.clear();
		}
		if(testNum == 11){
			Sort.quickRandom(random, 0, random.size()-1);
			fillRandom();
			//System.out.println(random.toString());
			System.out.println("Test: " + testNum + " Completed");
			random.clear();
		}
		if(testNum == 12){
			Sort.quickRandom(decending, 0, decending.size()-1);
			fillDescending();
			//System.out.println(decending.toString());
			System.out.println("Test: " + testNum + " Completed");
			decending.clear();
		}
		if(testNum == 13){
			Sort.heap(ascending);
			fillAscending();
			//System.out.println(ascending.toString());
			System.out.println("Test: " + testNum + " Completed");
			ascending.clear();
		}
		if(testNum == 14){
			Sort.heap(random);
			fillRandom();
			//System.out.println(random.toString());
			System.out.println("Test: " + testNum + " Completed");
			random.clear();
		}
		if(testNum == 15){
			Sort.heap(decending);
			fillDescending();
			//System.out.println(decending.toString());
			System.out.println("Test: " + testNum + " Completed");
			decending.clear();
		}
		
		
		
	}
	
	public static String generateName(){
		String uuid = UUID.randomUUID().toString();
		return uuid;
	}
	
	public static String generateNumber(){
		long phoneFmt = (long) Math.floor(Math.random() * 9000000000L) + 1000000000L;
		
		DecimalFormat phoneDecimalFmt = new DecimalFormat("0000000000");
		String phoneRawString= phoneDecimalFmt.format(phoneFmt);

		java.text.MessageFormat phoneMsgFmt=new java.text.MessageFormat("({0})-{1}-{2}");
		    
		String[] phoneNumArr={phoneRawString.substring(0, 3),
		          phoneRawString.substring(3,6),
		          phoneRawString.substring(6)};

		return phoneMsgFmt.format(phoneNumArr);
	}
	
	public static void fillRandom(){
		for(int i = 0; i < size; i++){
			random.add(new Person(generateName(), generateNumber()));
		}
	}
	
	public static void fillAscending(){
		for(int i = 0; i < size; i++){
			ascending.add(new Person(generateName(), generateNumber()));
		}
		ascending.sort(new Person.OrderByName());
	}
	
	public static void fillDescending(){
		
		for(int i = 0; i < size; i++){
			decending.add(new Person(generateName(), generateNumber()));
		}
		decending.sort(Collections.reverseOrder());
	}
	
	public static long memoryCheck(){
		Runtime runtime = Runtime.getRuntime();
		long KB = 1024;
		long MB = KB*KB;		
		runtime.gc();
		
		long usage = (runtime.totalMemory() - runtime.freeMemory())/KB;
		return usage;
	}
	
	
}
