import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Vector;


public class Queue<E> implements QueueInterface<E> {
	
	private LinkedList myList = new LinkedList();

	@Override
	public Iterator<E> iterator() {
		QueueIterator<E> myIterator;
		Vector<E> elements = new Vector<E>(size());
		
		if (!isEmpty()) {
			Object obj = myList.getFirstObject();
			int index = 0;
			while (obj != null) {
				elements.add((E) obj);
				obj = myList.getNextObject();
			}
		}
		
		myIterator = new QueueIterator<E> (elements, this);
		return myIterator;
	}

	@Override
	public boolean isEmpty() {
		return myList.isEmpty();
	}

	@Override
	public int size() {
		return myList.size();
	}

	@Override
	public boolean add(E e) throws IllegalStateException, 
									ClassCastException,
									NullPointerException {
		if (e != null) {
			myList.add(e);
			return true;
		} else {
			NullPointerException npe = new NullPointerException("The object you are trying to add is null");
			throw npe;
		}
	}

	@Override
	public E element() throws NoSuchElementException {
		
		if(!isEmpty()) {
			return (E) myList.getObject(0);
		} else {
			NoSuchElementException nsee = new NoSuchElementException("No elements, Queue is empty");
			throw nsee;
		}
	}

	@Override
	public E remove() throws NoSuchElementException {
		
		if (!isEmpty()) {
			E element = (E) myList.getFirstObject();
			myList.remove(0);
			return element;
		} else {
			NoSuchElementException nsee = new NoSuchElementException("No elements, Queue is empty");
			throw nsee;
		}
	}

	@Override
	public E remove(int index) throws NoSuchElementException {

		if (!isEmpty()) {
			E element = (E) myList.getObject(index);
			boolean success = myList.remove(index);
			if (!success) {
				NoSuchElementException nsee = new NoSuchElementException("No element at index = " + index);
				throw nsee;
			} else {
				return element;
			}
		} else {
			NoSuchElementException nsee = new NoSuchElementException("No elements, Queue is empty");
			throw nsee;
		}
	}

	@Override
	public void removeAll() {
		myList.removeAll();
	}
	
	public void showQueue(){
		Queue sQueue = this;
		Iterator<E> it = sQueue.iterator();
		if (isEmpty()) {
			System.out.println("The rQueue Is Empty...");
		} else {
			System.out.print("The rQueue Contains: {" + it.next());
			
			while(it.hasNext()){
				System.out.print(", " + it.next());
				
			}
			System.out.println("}");
		}
	}

	

}
