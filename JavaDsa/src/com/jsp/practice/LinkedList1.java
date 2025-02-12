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

	void addLast(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = tail = newNode;
			return;
		}

		tail.next = newNode;
		tail = newNode;
		System.out.println();
	}

	void add(int data, int idx) {
		Node newNode = new Node(data);
		if (idx == 0) {
			addFirst(data);
			return;
		}
		Node temp = head;
		int cnt = 0;
		while (cnt < idx - 1) {
			cnt++;
			temp = temp.next;
		}
		newNode.next = temp.next;
		temp.next = newNode;

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
		ll.addFirst(40);
		ll.addLast(50);
		ll.addLast(60);
		ll.print();
		ll.add(32, 2);
		ll.print();
	}

}
