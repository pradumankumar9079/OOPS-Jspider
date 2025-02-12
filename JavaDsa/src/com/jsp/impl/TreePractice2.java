package com.jsp.impl;

class TreeNode {
	int data;
	TreeNode left;
	TreeNode right;

	TreeNode(int data) {
		this.data = data;
		left = right = null;
	}
}

class BinaryTre {
	TreeNode root = null;

	TreeNode insert(TreeNode node, int data) {
		TreeNode tn = new TreeNode(data);
		if (node == null) {
			return tn;
		}

		if (node.data < data) {
			node.right = insert(node.right, data);
		}

		if (node.data > data) {
			node.left = insert(node.left, data);
		}
		return node;
	}

	void inOrder(TreeNode node) {
		if (node == null) {
			return;
		}

		inOrder(root.left);
		System.out.println(root.data);
		inOrder(root.right);
	}

}

public class TreePractice2 {
	public static void main(String[] args) {
		BinaryTre bt = new BinaryTre();
		bt.root = bt.insert(bt.root, 10);
		bt.insert(bt.root, 20);
		bt.insert(bt.root, 30);
		bt.insert(bt.root, 40);
		bt.inOrder(bt.root);
	}
}
