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
	
	leftNode.setLeftNode(new TreeNode(4));
	leftNode.setRightNode(new TreeNode(5) );
	
	rightNode.setLeftNode(new TreeNode(6));
	rightNode.setRightNode(new TreeNode(7));
	
	
	System.out.println("前序遍历:");
	//前序遍历
	binaryTree.frontShow();
	System.out.println();
	System.out.println("中序遍历:");
	binaryTree.midleShow();
	System.out.println();
	System.out.println("后序遍历:");
	binaryTree.afterShow();
	System.out.println();
	
	System.out.println(binaryTree.frontSearch(7).getValue());
	
	

		
	}
}
