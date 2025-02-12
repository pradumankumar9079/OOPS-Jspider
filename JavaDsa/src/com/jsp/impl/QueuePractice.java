package com.jsp.impl;

import java.util.ArrayList;

class Queue {
	ArrayList<Integer> list = new ArrayList<Integer>(10);
	int front = 0;
	int rear = list.size() - 1;
	int size = 0;

	public void enQueue(int data) {
		list.add(data);
		size++;
	}

	public int deQueue() {
		int val = list.get(front);
		list.remove(front);
		size--;
		return val;
	}

	public void print() {
		for (Integer e : list) {
			System.out.println(e);
		}
	}

}

public class QueuePractice {
	public static void main(String[] args) {
		Queue q = new Queue();
		q.enQueue(10);
		q.enQueue(20);
		q.enQueue(30);
		q.deQueue();
		q.print();
	}
}
