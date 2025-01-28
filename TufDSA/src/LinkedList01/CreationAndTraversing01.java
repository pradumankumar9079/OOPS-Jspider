package LinkedList01;

class Node {
	int data;
	Node next;

	Node(int data) {
		this.data = data;
		next = null;
	}

}

public class CreationAndTraversing01 {
	static void displayLinkedList(Node head) {
		Node temp = head;
		while (temp.next != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
		System.out.println(temp.data);
	}

	static Node insertAtBegin(Node head, int data) {

		if (head != null) {
			Node newNode = new Node(data);

		}
		return head;
	}

	public static void main(String[] args) {
		Node n1 = new Node(10);
		Node head = n1;
		Node n2 = new Node(20);
		head.next = n2;
		Node n3 = new Node(30);
		head.next.next = n3;

		displayLinkedList(head);
	}
}
