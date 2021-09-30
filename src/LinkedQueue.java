/**
 * Implementation of a queue using a linked list.
 * @author Will Brown
 * @version 1.0
 * Fall 2021
 * @param <T> datatype of objects in queue
 */
public class LinkedQueue<T> implements QueueInterface<T> {
	
	private LinkedList<T> linkedList;

	public LinkedQueue() {
		linkedList = new LinkedList<T>();
	}
	
	@Override
	public void enqueue(T data) {
		Node<T> newNode = new Node<T>();
		newNode.setData(data);
		linkedList.addNode(newNode);
	}
	
	@Override
	public T dequeue() {
		Node<T> front = linkedList.getHead();
		T data = front.getData();
		linkedList.setHead(front.getNextNode());
		return data;
	}

	@Override
	public T getFront() {
		return linkedList.getHead().getData();
	}

	@Override
	public boolean isEmpty() {
		return linkedList.getHead() == null;
	}

	@Override
	public void clear() {
		linkedList.setHead(null);
		linkedList.setTail(linkedList.getHead());
	}
}
