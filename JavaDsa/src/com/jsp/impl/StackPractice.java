package com.jsp.impl;

import java.util.ArrayList;

class Stack {
	ArrayList<Integer> list = new ArrayList<Integer>(10);

	int size;

	public void push(int data) {
		if (isFull() == true) {
			System.out.println("Stack is Full Dumb Boy..!");
		}
		list.add(data);
		size++;
	}

	public int pop() {
		if (isEmpty() == true) {
			System.out.println("Stack is Already Empty Dumb Boy..!");
		}
		int val = list.get(list.size() - 1);
		list.remove(size - 1);
		size--;
		return val;
	}

	public boolean isFull() {
		return list.size() == 10;
	}

	public boolean isEmpty() {
		return list.size() == 0;
	}

	public void print() {
		for (int e : list) {
			System.out.println(e);
		}
	}
}

public class StackPractice {
	public static void main(String[] args) {
		Stack st = new Stack();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		st.pop();
		System.out.println(st.size);
		st.print();
	}
}
