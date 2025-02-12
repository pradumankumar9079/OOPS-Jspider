//package com.jsp.impl;
//
//class Queue {
//	int queue[] = new int[5];
//	int front = 0;
//	int rear = 0;
//	int size = 0;
//
//	public void enQueue(int data) {
//		if (isFull() == false) {
//			queue[rear] = data;
//			rear = (rear + 1) % 5;
//			size = size + 1;
//		} else {
//			System.out.println("Queue is Full");
//		}
//	}
//
//	public void show() {
//		for (int i = 0; i < size; i++) {
//			System.out.print(queue[(front + i) % 5] + " ");
//		}
//	}
//
//	public int deQueue() {
//		int data = queue[front];
//		if (isEmpty() == false) {
//			front = (front + 1) % 5;
//			size = size - 1;
//		} else {
//			System.out.println("Queue is Empty");
//		}
//
//		return data;
//	}
//
//	public int getSize() {
//		return size;
//	}
//
//	public boolean isEmpty() {
//		return getSize() == 0;
//	}
//
//	public boolean isFull() {
//		return getSize() == 5;
//	}
//
//}
//
//public class QueueImpl {
//	public static void main(String[] args) {
//		Queue q = new Queue();
//		q.enQueue(5);
//		q.enQueue(2);
//		q.enQueue(7);
//		q.enQueue(3);
//
//		q.deQueue();
//		q.deQueue();
//
//		q.enQueue(7);
//		q.enQueue(3);
//		q.enQueue(3);
//		q.enQueue(3);
//
//		q.show();
//	}
//}
