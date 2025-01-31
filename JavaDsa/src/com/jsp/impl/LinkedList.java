package com.jsp.impl;

public class LinkedList {
	public static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public static Node head;
	public static Node tail;
	public static int size;

	// Methods
	// add(),remove(),print(),search()

	// No Node Special case other same
	// add()
	// Create new Node
	// new Node next = head
	// head = new Node

	// O(1)
	public void addFirst(int data) {

		// step1: create new Node
		Node newNode = new Node(data);
		size++;
		if (head == null) {
			head = tail = newNode;
			return;
		}
		// step2: newNode next = head
		newNode.next = head;// link

		// step3: head = newNode
		head = newNode;
	}

	// O(1)
	public void addLast(int data) {

		// step1: create new Node
		Node newNode = new Node(data);
		size++;
		if (head == null) {
			head = tail = newNode;
			return;
		}
		// step2: tail next = newNode
		tail.next = newNode;// link

		// step3: tail = newNode
		tail = newNode;
	}

	// add O(n) because search index but linking in O(1)
	public void add(int idx, int data) {
		// because first node create will change head
		if (idx == 0) {
			addFirst(data);
			return;
		}
		Node newNode = new Node(data);
		size++;
		Node temp = head;
		int i = 0;
		while (i < idx - 1) {
			temp = temp.next;
			i++;
		}

//		i = idx-1; temp->prev
		newNode.next = temp.next;
		temp.next = newNode;
	}

	// Print O(n)
	public void print() {
		if (head == null) {
			System.out.println("LL is Empty");
			return;
		}
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.println("null");
	}

	// removeFirst
	public int removeFirst() {
		// special case if size 0 1
		if (size == 0) {
			System.out.println("LL is Empty");
			return Integer.MIN_VALUE;
		} else if (size == 1) {
			int val = head.data;
			head = tail = null;
			size = 0;
			return val;
		}
		int val = head.data;
		head = head.next;
		size--;
		return val;
	}

	// removeLast
	public int removeLast() {
		// special case if size 0 or 1
		if (size == 0) {
			System.out.println("LL is Empty");
			return Integer.MIN_VALUE;
		} else if (size == 1) {
			int val = head.data;
			head = tail = null;
			size = 0;
			return val;
		}
		// prev : i=size-2;
		Node prev = head;
		for (int i = 0; i < size - 2; i++) {
			prev = prev.next;
		}

		int val = prev.next.data;// tail.data
		prev.next = null;
		prev = tail;
		size--;
		return val;
	}

	// Search O(n)
	public int itrSearch(int key) {
		Node temp = head;
		int i = 0;

		while (temp != null) {
			if (temp.data == key) {// key found
				return i;
			}
			temp = temp.next;
			i++;
		}
		// key not found
		return -1;

	}

	// reverse O(n) 3 variable 4 steps remember
	public void reverse() {
		Node prev = null;
		Node curr = tail = head;
		Node next;
		while (curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		head = prev;

	}

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.addFirst(2);
		ll.addFirst(1);
		ll.addLast(4);
		ll.addLast(5);
		ll.add(2, 3);

		ll.print();
//		System.out.println(size);
		ll.removeFirst();
		ll.print();
		ll.removeLast();
		ll.print();
//		System.out.println(size);
		System.out.println(ll.itrSearch(3));
		System.out.println(ll.itrSearch(10));
		ll.reverse();
		ll.print();
	}
}
