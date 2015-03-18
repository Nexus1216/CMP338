import java.util.Iterator;
import java.util.Vector;


public class QueueIterator<E> implements Iterator<E> {
	
	private Vector<E> entries;
	private QueueInterface<E> theQueue;
	private int index = 0;
	
	public QueueIterator(Vector<E> entries, QueueInterface<E> theQueue) {
		this.entries = entries;
		this.theQueue = theQueue;
	}
	
	
	@Override
	public boolean hasNext() {
		return index < entries.size();
	}

	@Override
	public E next() {
		return entries.get(index++);
	}

	@Override
	public void remove() {
		//theQueue.remove(index - 1);
		index--;
		entries.remove(index);
		theQueue.remove(index);


	}

}
