package dsaday9;

// singly linkedList which can store homogenous data because data int using tail
class Node {
	int data;
	Node next;

	Node(int data) {
		this.data = data;
		next = null;
	}
}

public class LinkedListExample {
	Node head, tail;

	void insert(int ele) {
		Node n = new Node(ele);
		if (head == null) {
			head = n;
			tail = n;
		} else {
			tail.next = n;
			tail = n;
		}
//		System.out.println(ele + " had been inserted inside linkedlist...");
	}

	void display() {
		System.out.println("=====Linked-List Data====");
		Node temp = head;
		if (head == null) {
			System.out.println("Linked-List Is Empty...!");
		}
		while (temp.next != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.println(temp.data);// print last node data or use temp==null
		// it is usefull of insertion as well so use this
	}

	void delete() {
		if (head == null) {
			System.out.println("LinkedList Is Empty...!!!");
		} else if (head.next == null) {
			head = null;
			tail = null;
		} else {
			Node temp = head;
			while (temp.next.next != null) {
				temp = temp.next;
			}
			System.out.println(temp.next.data + " had been deleted...!");
			temp.next = null;
			tail = temp;
		}
	}

	void deleteFront() {
		if (head == null) {
			System.out.println("LinkedList Is Empty...!!!");
		} else if (head.next == null) {
			head = null;
			tail = null;
		} else {
			System.out.println(head.data + " had been deleted...!");
			head = head.next;

		}
	}

	void insertFront(int ele) {
		Node n = new Node(ele);
		n.next = head;
		head = n;
		System.out.println(ele + " had been inserted front...!!!");
	}
//	void deleteSpecific(int ele) {
//		if (head == null) {
//			System.out.println("LinkedList Is Empty...!!!");
//		} else if (head.next == null) {
//			head = null;
//			tail = null;
//		} else {
//			Node temp = head;
//			while (temp.next != null) {
//				if (temp.next.data == ele) {
//					temp = temp.next.next;
//				}
//			}
//			System.out.println(temp.data + " had been deleted...!");
//			temp.next = null;
//		}
//	}

}
