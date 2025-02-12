package com.jsp.impl;

class Node {
	int data;
	Node left;
	Node right;

	Node(int data) {
		this.data = data;
		left = right = null;
	}
}

class BinaryTree {
	Node root;

	public Node insert(Node node, int data) {
		Node newNode = new Node(data);
		if (node == null) {
			return newNode;
		}

		if (data < node.data) {
			node.left = insert(node.left, data);
		}
		if (data > node.data) {
			node.right = insert(node.right, data);
		}
		return node;
	}

	public void inOrder(Node root) {
		if (root == null)
			return;
		inOrder(root.left);
		System.out.println(root.data);
		inOrder(root.right);

	}

}

public class BST {
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
//		Node newNode = new Node(10);
//		tree.root = newNode;
//		newNode.left = new Node(5);
//		newNode.right = new Node(20);
//
//		newNode.left.left = new Node(4);
//		newNode.right.right = new Node(8);

		tree.root = tree.insert(tree.root, 20);
		tree.insert(tree.root, 30);
		tree.inOrder(tree.root);
	}
}
