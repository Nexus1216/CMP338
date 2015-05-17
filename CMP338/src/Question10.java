

public class Question10 {
	
	public static int listSize = 8;
	public static int[] entries = new int[]{48,99,17,22,45,13,52,28};
	public static LinkedList l = new LinkedList();
	
	public static void main(String[] args) {
		fillList(l);
		doStuff(l);
	}
	
	public static void doStuff(LinkedList list){
		LinkedListNode prevNode = list.head;
		LinkedListNode curNode = list.head.getNext();
		
		list.showList();
		System.out.println("\n");
		
		while (curNode != null){
			prevNode.setNext(curNode.getNext());
			curNode.setNext(list.head);
			list.head = curNode;
			
			curNode = prevNode.getNext();
			list.showList();
			System.out.println("\n");
		}
		list.tail = prevNode;
		
	}
	
	private static void fillList(LinkedList linked){
		linked.removeAll();
		for(int i = 0; i < listSize; i++){
			linked.add(entries[i]);
		}
	}
	

}
