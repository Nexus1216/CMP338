import java.util.Iterator;



public class Populate {
	static int iQueueSize = 10000;
	static int sQueueSize = 100;
	
	public static void excute(Queue linked, int n){
		
		if(n == 1){
			queue(linked);
		}
		if(n == 2){
			deQueue(linked);
		}
		if(n == 3){
			sQueue(linked);
		}
		if(n == 4){
			sDeQueue(linked);
		}
	}
	
	public static void excute(ArrayQueue array, int n){
		
		if(n == 1){
			queue(array);
		}
		if(n == 2){
			deQueue(array);
		}
		if(n == 3){
			sQueue(array);
		}
		if(n == 4){
			sDeQueue(array);
		}
	}
	
	
	
	private static void queue(Queue linked){
		linked.removeAll();
		for(int i = 0; i < iQueueSize; i++){
			linked.add(i+1);
		}
	}
	private static void queue(ArrayQueue array){
		array.removeAll();
		for(int i = 0; i < iQueueSize; i++){
			array.add(i+1);
		}
	}
	
	private static void deQueue(Queue linked){
		linked.removeAll();
		queue(linked);
		//linked.showQueue();
		while(!linked.isEmpty()){
			linked.remove();
			//linked.showQueue();
		}
	}
	private static void deQueue(ArrayQueue array){
		array.removeAll();
		queue(array);
		//array.showQueue();
		while(!array.isEmpty()){
			array.remove();
			//array.showQueue();
		}
	}
	
	private static void sQueue(Queue linked){
		linked.removeAll();
		for(int i = 0; i < sQueueSize; i++){
			linked.add("String " + (i+1));
		}
	}
	private static void sQueue(ArrayQueue array){
		array.removeAll();
		for(int i = 0; i < sQueueSize; i++){
			array.add("String " + (i+1));
		}
	}
	
	private static void sDeQueue(Queue linked){
		linked.removeAll();
		sQueue(linked);
		Iterator<String> it = linked.iterator();
		//linked.showQueue();
		int i = 1;
		while(it.hasNext()){
			String s = it.next();
			
			if(s.equals("String " + i)){
				it.remove();
			}
			i++;
		}
	}
	private static void sDeQueue(ArrayQueue array){
		array.removeAll();
		sQueue(array);
		Iterator<String> it = array.iterator();
		//array.showQueue();
		int i = 1;
		while(it.hasNext()){
			String s = it.next();
			
			if(s.equals("String " + i)){
				it.remove();
			}
			i++;
		}
	}
	
	public static long memoryCheck(){
		Runtime runtime = Runtime.getRuntime();
		long KB = 1024;
				
		runtime.gc();
		
		long usage = (runtime.totalMemory() - runtime.freeMemory())/KB;
		return usage;
	}
	
	
}
