package com.jsp.practice;

public class LinkedList1 {
	static Node head = null;
	static Node tail = null;

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			next = null;
		}
	}

	void addFirst(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = tail = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}

	}

	void print() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + "-->");
			temp = temp.next;
		}
		System.out.print("null");
	}

	public static void main(String[] args) {
		LinkedList1 ll = new LinkedList1();
		ll.addFirst(10);
		ll.addFirst(20);
		ll.addFirst(30);
		ll.print();
	}

}
