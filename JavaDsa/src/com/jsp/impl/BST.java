package com.jsp.impl;

public class BST {
	static class Node {
		int data;
		Node left, right;

		Node(int data) {
			this.data = data;
			left = right = null;
		}
	}

	Node root;

	BST() {
		root = null;
	}

}
