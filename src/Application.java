import java.util.Scanner;

/**
 * Example application for a queue.
 * @author Will Brown
 * @version 1.0
 * Fall 2021
 */
public class Application {

	private static QueueInterface<String> myQueue = new LinkedQueue<String>();
	
	/**
	 * Main method, includes command interpreter.
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		boolean appRunning = true;
		String[] userCommand; // holds command and potential arguments
		
		// Print usage info
		System.out.println("Usage:\n"
				+ "enqueue \"item\"\tEnqueue an item\n"
				+ "dequeue\t\tDequeue an item\n"
				+ "peek\t\tLook at the front of the queue\n"
				+ "list\t\tList the contents of the queue\n"
				+ "exit\t\tExit the program\n");
		
		// Command interpreter
		while (appRunning) {
			System.out.print("> ");
			
			/*
			 * Format input into something usable.
			 * userCommand[0] is the desired operation. (will always need a trailing space removed)
			 * userCommand[1] is the item to enqueue, if enqueuing an item.
			 */
			userCommand = inputScanner.nextLine().split("\"");
			userCommand[0] = userCommand[0].stripTrailing().toLowerCase();
			
			switch(userCommand[0]) {
			case "enqueue":
				myQueue.enqueue(userCommand[1]);
				System.out.println(userCommand[1] + " enqueued.");
				break;
			case "dequeue":
				if (myQueue.isEmpty()) {
					System.out.println("Queue is currently empty.");
				} else {
					System.out.println(myQueue.dequeue() + " dequeued.");					
				}
				break;
			case "peek":
				if (myQueue.isEmpty()) {
					System.out.println("Queue is currently empty.");
				} else {
					System.out.println(myQueue.getFront() + " is at the front of the queue.");
				}
				break;
			case "list":
				if (myQueue.isEmpty()) {
					System.out.println("Queue is currently empty.");
				} else {
					System.out.println("Current items in queue:");
					listQueue();
				}
				break;
			case "exit":
				System.out.println("Exiting.");
				inputScanner.close();
				appRunning = false;
				break;
			default:
				System.out.println("Invalid command.");
			}
			
			// Extra newline to make the output look nicer.
			System.out.println();
		}
	}
	
	/**
	 * List the contents of the queue.
	 */
	private static void listQueue() {
		// This is a destructive process, so the queue needs to be reconstructed.
		LinkedQueue<String> tempQueue = new LinkedQueue<String>();
		String currentItem;
		
		while (!myQueue.isEmpty()) {
			currentItem = myQueue.dequeue();
			System.out.println(currentItem);
			tempQueue.enqueue(currentItem);
		}
		
		myQueue = tempQueue;
	}

}
