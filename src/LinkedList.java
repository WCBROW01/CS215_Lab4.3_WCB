
/**
 * Linked list code from CS-131, modified to use generics.
 * @author Will Brown
 * @version 2.0
 * Fall 2021
 * @param <T> datatype of the list
 */
public class LinkedList<T> {

	private Node<T> head;
	private Node<T> tail;
	
	/**
	 * Constructor. Sets head and tail to null.
	 */
	public LinkedList() {
		tail = head = null;
	}
	
	/**
	 * Adds a node to the tail of the list
	 * @param newNode the node to add
	 */
	public void addNode(Node<T> newNode) {
		if (head == null) {
			tail = head = newNode;
		} else {
			tail.setNextNode(newNode);
			tail = tail.getNextNode();
		}
	}

	/**
	 * @return the head node of the list
	 */
	public Node<T> getHead() {
		return head;
	}
	
	/**
	 * @param head the node to set as the head of the list
	 */
	public void setHead(Node<T> front) {
		this.head = front;
	}

	/**
	 * @return the tail node of the list
	 */
	public Node<T> getTail() {
		return tail;
	}

	/**
	 * @param tail the node to set as the tail of the list
	 */
	public void setTail(Node<T> tail) {
		this.tail = tail;
	}
}
