package com.fan.tree;

public class TestBinaryTree {
	public static void main(String[] args) {
	BinaryTree binaryTree = new BinaryTree();
	TreeNode root = new TreeNode(1);
	binaryTree.setRoot(root);
	
	TreeNode leftNode = new TreeNode(2);
	root.setLeftNode(leftNode);
	
	TreeNode rightNode = new TreeNode(3);
	root.setRightNode(rightNode);
		
	}
}
