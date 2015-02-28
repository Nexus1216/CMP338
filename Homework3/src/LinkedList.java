
public class LinkedList implements ListInterface {

	private Node head = null;
	
	private Node currentNode = null;
	
	public LinkedList() {
		head = null;
	}
	
	@Override
	public boolean isEmpty() {
		if (head == null) {
			return true;
		}
		return false;
	}

	@Override
	public int size() {
		int count = 0;
		
		// if the list is empty, return 0
		if (isEmpty()) {
			return 0;
		} else {
			// count the number of nodes in the linked list
			for ( Node curNode = head ; curNode != null ; curNode = curNode.getNext() ) {
				count++;
			}
		}
		
		return count;
	}

	@Override
	public void add(int obj) {
		Node newNode = new Node(obj);
		Node tail;
		
		// if the list is empty, the new Node becomes the head
		if (isEmpty()) {
			head = newNode;
		} else {
			// otherwise, find the tail and attach the new Node to the tail
			for ( tail = head ; tail.getNext() != null ; tail = tail.getNext() ) {
			}
			tail.setNext(newNode);
		}

	}

	@Override
	public boolean addAt(int obj, int index) {
		boolean rc = false;
		Node newNode = new Node(obj);
		Node curNode = head;
		
		// if index is 0, put the new Node at the head of the list
		if (index == 0) {
			newNode.setNext(head);
			head = newNode;
			rc = true;
		} else if (index == size()) {
			// if the index is equal to the length of the list, attach the new
			// Node to the tail
			add(obj);
			rc = true;
		} else  if (index < size()) {
			// otherwise, if the index is valid, find the right spot to attach
			// the new Node
			for ( int j = 1  ; j < index ; j++ ) {
				curNode = curNode.getNext();
			}
			newNode.setNext(curNode.getNext());
			curNode.setNext(newNode);
			rc = true;
		}
		return rc;
	}

	@Override
	public void addSorted(int obj) {
		// if the list is empty, just create a new head
				if (isEmpty()) {
					add(obj);
				} else {
					Node newNode = new Node(obj);
					Node curNode = head;
					Node prevNode = null;
					int index = 0;

					// find the place to insert the newNode
					while ((curNode != null) && (curNode.getData() < obj)) {
						prevNode = curNode;
						curNode = curNode.getNext();
						index++;
					}
					
					// if the new Node replaces the head
					if (index == 0) {
						newNode.setNext( head);
						head = newNode;
					} else {
						prevNode.setNext(newNode);
						newNode.setNext(curNode);
					}
				}

	}

	@Override
	public int getObject(int index) {
		int rc = 0;
		int count = 0;
		Node curNode = head;
		
		if (index < size() && !isEmpty()) {
			for ( int i = 0 ; i < index ; i++) {
				curNode = curNode.getNext();
			}
			rc = curNode.getData();
		}

		return 0;
	}

	@Override
	public int getFirstObject() {
		int rc = 0;
		
		if (isEmpty()) {
			currentNode = null;
		} else {
			rc = head.getData();
			currentNode = head.getNext();
		}
		return 0;
	}

	@Override
	public int getNextObject() {
		Object rc = 0;
		
		if (currentNode != null) {
			rc = currentNode.getData();
			currentNode = currentNode.getNext();
		}
		
		return 0;
	
	}

	@Override
	public boolean remove(int index) {
		boolean result = false;
		Node curNode = head;
		Node prevNode = null;
		
		if (index < size()) {
			if (index == 0) {
				// removing the head
				head = head.getNext();
				result = true;
			} else {
				// find the node to remove
				for ( int i = 0 ; i < index ; i++ ) {
					prevNode = curNode;
					curNode = curNode.getNext();
				}
				// remove it
				prevNode.setNext(curNode.getNext());
				result = true;
			}
		}			
		
		return result;
	}

	@Override
	public void removeAll() {
		head = null;

	}
	
	public void showList() {
		if (isEmpty()) {
			System.out.println("The Linked List Is Empty...");
		} else {
			System.out.print("The Linked List Contains: {" + head.getData());
			Node curNode = head.getNext();
			while (curNode != null) {
				System.out.print(", " + curNode.getData());
				curNode = curNode.getNext();
			}
			System.out.println("}");
		}
	}

}
