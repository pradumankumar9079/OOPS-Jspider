package com.jsp.impl;

import java.util.ArrayList;

public class StackImpl {
	static class Stack {
		// push()
		// pop()
		// peek()
		// isEmpty()

		static ArrayList<Integer> list = new ArrayList<>();

		boolean isEmpty() {
			return list.size() == 0;
		}

		void push(int data) {
			list.add(data);
		}

		int pop() {
			if (isEmpty()) {
				return -1;
			}
			int value = list.get(list.size() - 1);
			list.remove(list.get(list.size() - 1));
			return value;
		}

		int peek() {
			int value = list.get(list.size() - 1);
			return value;
		}

	}

	public static void main(String[] args) {
		Stack st = new Stack();
		st.push(10);
		st.push(20);
		st.push(30);
		System.out.println(st.pop());
		System.out.println(st.pop());

//		System.out.println(st.pop());

		System.out.println(st.peek());
	}
}
