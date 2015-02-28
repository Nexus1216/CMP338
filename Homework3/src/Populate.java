

public class Populate {
	
	public static void excute(LinkedList linked, int n){
		if(n == 1){
			addOdd(linked);
		}
		if(n == 2){
			addEven(linked);
		}
		if(n == 3){
			fillList(linked);
		}
		if(n == 4){
			addAt(linked,0);
		}
		if(n == 5){
			removeEven(linked);
		}
		if(n >= 6){
			removeOdd(linked);
		}
	}
	
	public static void excute(ArrayList array, int n){
		if(n == 1){
			addOdd(array);
		}
		if(n == 2){
			addEven(array);
		}
		if(n == 3){
			fillList(array);
		}
		if(n == 4){
			addAt(array,0);
		}
		if(n == 5){
			removeEven(array);
		}
		if(n >= 6){
			removeOdd(array);
		}
	}
	
	private static void addOdd(LinkedList linked){
		for(int i = 1; i < 100000; i++){
			if(i%2 == 1){
				linked.addSorted(i);
			}
		}
	}
	private static void addOdd(ArrayList array){
		for(int i = 1; i < 100000; i++){
			if(i%2 == 1){
				array.addSorted(i);
			}
		}
	}
	
	private static void addEven(LinkedList linked){
		for(int i = 2; i <= 100000; i++){
			if(i%2 == 0){
				linked.addSorted(i);
			}
		}
	}
	private static void addEven(ArrayList array){
		for(int i = 2; i <= 100000; i++){
			if(i%2 == 0){
				array.addSorted(i);
			}
		}
	}
	
	private static void fillList(LinkedList linked){
		linked.removeAll();
		for(int i = 0; i < 100000; i++){
			linked.add(i+1);
		}
	}
	private static void fillList(ArrayList array){
		array.removeAll();
		for(int i = 0; i < 100000; i++){
			array.add(i+1);
		}
	}
	
	private static void addAt(LinkedList linked, int n){
		linked.removeAll();
		for(int i = 0; i < 100000; i++){
			linked.addAt(777,n);
		}
	}
	private static void addAt(ArrayList array, int n){
		array.removeAll();
		for(int i = 0; i < 100000; i++){
			array.addAt(777,n);
		}
	}
	
	private static void removeEven(LinkedList linked){
		linked.removeAll();
		fillList(linked);
		for(int i = 0; i <= 100000; i++){
			if(linked.getObject(i)%2 == 0){
				linked.remove(i + 1);
			}
		}
	}
	private static void removeEven(ArrayList array){
		array.removeAll();
		fillList(array);
		for(int i = 0; i <= 100000; i++){
			if(array.getObject(i)%2 == 0){
				array.remove(i);
			}
		}
	}
	
	
	private static void removeOdd(LinkedList linked){
		linked.removeAll();
		fillList(linked);
		for(int i = 0; i <= 100000; i++){
			if(linked.getObject(i)%2 == 1){
				linked.remove(i + 2);
			}
		}
	}
	private static void removeOdd(ArrayList array){
		array.removeAll();
		fillList(array);
		for(int i = 0; i <= 100000; i++){
			if(array.getObject(i)%2 == 1){
				array.remove(i);
			}
		}
	}
	
	
}
