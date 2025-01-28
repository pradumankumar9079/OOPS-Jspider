package dsaday7;

import java.util.Scanner;

// Stack Implementation with array
public class Stackimpln {

	// i want this two to accessible to any method that's why static
	static int[] stack;
	static int top;

	static void createStack(int size) {
		stack = new int[size];
		top = -1;
		System.out.println("stack had been Created With Size: " + size);
	}

	static void push(int ele) {
		if (top == stack.length - 1) {
			System.out.println("StackOverFlow Error..!!");
		} else {
			top++;
			stack[top] = ele;
			System.out.println(ele + " had been added to stack..!!");
		}
	}

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("======Welcome To Stack Impln========");
		System.out.println("Enter the size of stack: -");
		int size = ip.nextInt();
		createStack(size);
		push(10);
		push(20);
		push(30);
		push(40);
		push(50);
	}

}
