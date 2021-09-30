
/**
 * Linked list node code from CS-131, modified to use generics.
 * @author Will Brown
 * @version 2.0
 * Fall 2021
 * @param <T> datatype of the node
 */
public class Node<T> {
	
	private Node<T> nextNode;
	private T data;
	
	/**
	 * Creates empty node.
	 */
	public Node() {
		data = null;
		nextNode = null;
	}
	
	/**
	 * Creates node with data.
	 * @param data the data of the node
	 */
	public Node(T data) {
		this.data = data;
		nextNode = null;
	}
	
	/**
	 * Creates node with data and a pointer to the next node
	 * @param data the data of the node
	 * @param nextNode the next node
	 */
	public Node(T data, Node<T> nextNode) {
		this.data = data;
		this.nextNode = nextNode;
	}
	
	/**
	 * @return the next node
	 */
	public Node<T> getNextNode() {
		return nextNode;
	}
	
	/**
	 * @param nextNode the next node to set
	 */
	public void setNextNode(Node<T> nextNode) {
		this.nextNode = nextNode;
	}
	
	/**
	 * @return the data
	 */
	public T getData() {
		return data;
	}
	
	/**
	 * @param data the data to set
	 */
	public void setData(T data) {
		this.data = data;
	}

}
