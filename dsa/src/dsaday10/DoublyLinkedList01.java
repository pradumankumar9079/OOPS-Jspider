package dsaday10;

class Node {

	int data;
	Node next;
	Node prev;

	Node(int data) {
		this.data = data;
		this.next = null;
		this.prev = null;
	}

}

public class DoublyLinkedList01 {
	Node head, tail;

	void display() {
		while (head.next != null) {
			System.out.print(head.data + "->");
		}
	}

	void insert(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
		}
		System.out.println(data + " had been insertedd inside linkedList...!!!");
	}

	public static void main(String[] args) {
		DoublyLinkedList01 dl = new DoublyLinkedList01();

	}
}
