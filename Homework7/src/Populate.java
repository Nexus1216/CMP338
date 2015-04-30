import java.text.DecimalFormat;
import java.util.Collections;
import java.util.UUID;
import java.util.Vector;

public class Populate {
	
	public static int size = 10000; 
	public static Vector<Person> random = new Vector<Person>(size); 
	public static Vector<Person> ascending = new Vector<Person>(size); 
	public static Vector<Person> decending = new Vector<Person>(size); 
	
	
	
	public static void execute(int testNum){
		
		fill();
		
		if(testNum == 1){
			Sort.merge(ascending);
			System.out.println("Test: " + testNum + " Completed");
		}
		if(testNum == 2){
			Sort.merge(random);
			System.out.println("Test: " + testNum + " Completed");
		}
		if(testNum == 3){
			Sort.merge(decending);
			System.out.println("Test: " + testNum + " Completed");
		}
		if(testNum == 4){
			Sort.quickMid(ascending, 0, ascending.size()-1);
			System.out.println("Test: " + testNum + " Completed");
		}
		if(testNum == 5){
			Sort.quickMid(random, 0, random.size()-1);
			System.out.println("Test: " + testNum + " Completed");
		}
		if(testNum == 6){
			Sort.quickMid(decending, 0, decending.size()-1);
			System.out.println("Test: " + testNum + " Completed");
		}
		if(testNum == 7){
			Sort.quickFirst(ascending, 0, ascending.size()-1);
			System.out.println("Test: " + testNum + " Completed");
		}
		if(testNum == 8){
			Sort.quickFirst(random, 0, random.size()-1);
			System.out.println("Test: " + testNum + " Completed");
		}
		if(testNum == 9){
			Sort.quickFirst(decending, 0, decending.size()-1);
			System.out.println("Test: " + testNum + " Completed");
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
	
	public static void fill(){
		
		for(int i = 0; i < size; i++){
			random.add(new Person(generateName(), generateNumber()));
			ascending.add(new Person(generateName(), generateNumber()));
			decending.add(new Person(generateName(), generateNumber()));
		}
		
		ascending.sort(new Person.OrderByName());
		decending.sort(Collections.reverseOrder());
		
		
	}
	
	
	

	
	
	public static long memoryCheck(){
		Runtime runtime = Runtime.getRuntime();
		long KB = 1024;
		long MB = KB*KB;		
		runtime.gc();
		
		long usage = (runtime.totalMemory() - runtime.freeMemory())/MB;
		return usage;
	}
	
	
}
