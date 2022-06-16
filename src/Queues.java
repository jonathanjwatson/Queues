import java.util.*;

public class Queues {
	public static void main(String[] args) {

		Queue<Integer> myQueue = new LinkedList<Integer>();

		// Adds elements {5, 6, 7, 8, 9} to queue
		for (int i = 5; i < 10; i++) {
			myQueue.add(i);
		}

		// Display contents of the queue.
		System.out.println("Elements of queue-" + myQueue);

		// To remove the head of queue.
		int removedHead = myQueue.remove();
		System.out.println("removed element-" + removedHead);

		System.out.println(myQueue);

		// To view the head of queue
		int head = myQueue.peek();
		System.out.println("head of queue-" + head);
		
		
		// Rest all methods of collection interface, 
		// Like size and contains can be used with this 
		// implementation. 
		int size = myQueue.size(); 
		System.out.println("Size of queue-" + size); 
	}
}
