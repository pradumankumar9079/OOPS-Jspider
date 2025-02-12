//package com.jsp.impl;
//
//class TreeNode {
//	int data;
//	TreeNode left;
//	TreeNode right;
//
//	TreeNode(int data) {
//		this.data = data;
//		left = right = null;
//	}
//}
//
//class BinarTree {
//	TreeNode root;
//
//	TreeNode insert(TreeNode node, int value) {
//		TreeNode newNode = new TreeNode(value);
//		if (node == null)
//			return newNode;
//
//		if (node.data < value) {
//			node.left = insert(node.left, value);
//		}
//		if (node.data > value) {
//			node.right = insert(node.right, value);
//		}
//		return node;
//	}
//
//	void inOrder(TreeNode node) {
//		if (root == null)
//			return;
//		inOrder(root.left);
//		System.out.println(root.data);
//		inOrder(root.right);
//	}
//}
//
//public class TreePractice {
//	public static void main(String[] args) {
//		BinaryTree tree = new BinaryTree();
//		tree.root = tree.insert(tree.root, 10);
//		tree.insert(tree.root, 20);
//		tree.inOrder(tree.root);
//	}
//}
