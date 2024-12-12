package queueday4;

import java.util.PriorityQueue;

public class MainClass2 {
	public static void main(String[] args) {
		PriorityQueue pq = new PriorityQueue();

		// empty queue is created
		System.out.println("is queue empty ?" + pq.isEmpty());
		System.out.println("Total Element: " + pq.size());
		System.out.println("Queue Elements: ");
		System.out.println(pq);

		Object o1 = pq.poll();
		System.out.println(o1);// null

		// java.util.NoSuchElementException
//		System.out.println(pq.remove());
	}
}
