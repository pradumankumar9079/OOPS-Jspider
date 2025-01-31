package com.jsp.practice;

import java.util.ArrayList;

public class StackImpl {
	static class Stack {
		ArrayList<Integer> list = new ArrayList<>();

		boolean isEmpty() {
			return list.size() == 0;
		}

		void push(int data) {
			list.add(data);
		}

		int pop() {
			int idx = list.size() - 1;
			int value = list.get(idx);
			list.remove(list.get(list.size() - 1));
			return value;
		}

		int peek() {

			int idx = list.size() - 1;
			int value = list.get(idx);
			return value;
		}

		public static void main(String[] args) {
			Stack st = new Stack();
			st.push(10);
			st.push(20);
			st.push(30);
			System.out.println(st.peek());
			System.out.println(st.pop());
			System.out.println(st.peek());

		}
	}
}
