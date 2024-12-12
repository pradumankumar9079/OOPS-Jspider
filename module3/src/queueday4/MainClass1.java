package queueday4;

import java.util.PriorityQueue;

class MainClass1 {
	public static void main(String[] args) {
		PriorityQueue pq = new PriorityQueue();

		// empty queue is created
		System.out.println("is queue empty ?" + pq.isEmpty());
		System.out.println("Total Element: " + pq.size());
		System.out.println("Queue Elements: ");
		System.out.println(pq);

		/************* Important **********/
		// What kind of element adding first next element should be the same type
		pq.add(20);
		pq.add(45);
		pq.add(12);
		pq.add(25);
		pq.add(9);
		pq.add(30);

		System.out.println("is queue empty ?" + pq.isEmpty());
		System.out.println("Total Element: " + pq.size());

		// Queue will not maintain the order of insertion(Because we are not having
		// index here)
		System.out.println("Queue Elements: ");
		System.out.println(pq);

		// By default it gives priority to lowest element(first Priority)
		// peek method return reference to head element
		Object o1 = pq.peek();
		System.out.println(o1);
		System.out.println("Total Element: " + pq.size());// 6

		// poll method will remove head element which is having least priority(so size
		// will reduce)
		Object o2 = pq.poll();
		System.out.println(o2);
		System.out.println("Total Element: " + pq.size());// 5

		// remove until queue become empty(it is in ascending order)
//		while (pq.isEmpty() != true) {
//			Object obj = pq.poll();
//			System.out.println(obj);
//		}

		// second Way Using Poll Method2
		Object o = pq.poll();
		while (o != null) {
			System.out.println("removing element from queue");
			System.out.println(o);
			o = pq.poll();
		}

		// find 10th element in priority queue
		int cnt = 0;
		while (pq.isEmpty() != true) {
			cnt++;
			pq.poll();
			if (cnt == 10) {
				System.out.println(pq.poll());
			}
		}
		System.out.println("--------------");
	}
}
