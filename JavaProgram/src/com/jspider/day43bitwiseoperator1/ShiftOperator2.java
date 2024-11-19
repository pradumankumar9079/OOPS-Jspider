package com.jspider.day43bitwiseoperator1;

public class ShiftOperator2 {
	public static void main(String[] args) {
		// Left Shift Operator
		// Read Like This Shift binary of 2 to the left by one position or do
		// Left Part*((always 2)^Right Part)-->Something Like this
		System.out.println(2 << 1);
		System.out.println(2 << 2);
		System.out.println(2 << 3);

		// Right Shift Operator
		// Read Like This Shift binary of 2 to the Right by one position or do
		// Left Part/((always 2)^Right Part)-->Something Like this
		System.out.println(2 >> 1);
		System.out.println(2 >> 2);
		System.out.println(2 >> 3);
		System.out.println(8 >> 1);
		System.out.println(16 >> 2);
		System.out.println(32 >> 2);

		System.out.println(14 << 2);
		System.out.println(16 >> 2);

	}
}

//4
//8
//16
//1
//0
//0
//4
//4
//8
//56
//4
