import java.util.LinkedList;
import java.util.Iterator;
import java.util.Vector;


public class Treelterator<T> implements Iterator<T>{ 
	
	private BinaryTreeBasis<T> binTree; 
	private TreeNode<T> currentNode; 
	private LinkedList <TreeNode<T>> queue; // from JCF
	
	private Vector<T> entries;
	//private QueueInterface<E> theQueue;
	private int index = 0;
	
	public Treelterator (BinaryTreeBasis<T> bTree) { 
		binTree = bTree; 
		currentNode = null ;
		//empty queue indicates no traversal type currently 
		// selected or end of current traversal has been reached 
		queue = new LinkedList <TreeNode<T>>();
	} // end constructor
	
	public Treelterator (Vector<T> entries) {
		this.entries = entries;
	}
	
	public boolean hasNext( ) { 
		return !queue.isEmpty( ) ; 
	} // end hasNext
	
	public T next() throws java.util.NoSuchElementException { 
		currentNode = queue.remove(); 
		return currentNode.item; 
	} // end next
	
	public T vNext() throws java.util.NoSuchElementException { 
		return entries.get(index++);
	} // end next
	
	public void remove() throws UnsupportedOperationException { 
		throw new UnsupportedOperationException( );
	} // end remove
	
	public void setpreorder( ) { 
		queue.clear ( ); 
		preorder(binTree.root); 
	} // setPreOrder
	
	public void setInorder() { 
		queue.clear( ); 
		inorder(binTree.root); 
	} // end set Inorder
	
	public void setpostorder(){
		queue.clear(); 
		postorder(binTree.root);
	} // end setpostorder

	private void preorder (TreeNode<T> treeNode) { 
		if (treeNode == null) { queue. add(treeNode); 
			preorder ( treeNode. leftChild ) ; 
			preorder ( treeNode. rightChild) ;
		} // end if
	} // end preorder
	
	private void inorder (TreeNode<T> treeNode) { 
		if (treeNode == null) { 
			inorder(treeNode.leftChild); 
			queue.add(treeNode); 
			inorder(treeNode.rightChild);
		} // end if
	} // end inorder
	
	private void postorder(TreeNode<T> treeNode) { 
		if (treeNode == null) { 
			postorder(treeNode.leftChild); 
			postorder(treeNode. rightChild ); 
			queue.add(treeNode) ;
		} // end if
	} // end postorder

}
