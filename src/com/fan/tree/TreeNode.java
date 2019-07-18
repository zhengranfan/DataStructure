package com.fan.tree;

import java.util.concurrent.locks.ReadWriteLock;

public class TreeNode {
	private int value;
	private TreeNode leftNode;
	private TreeNode rightNode;
	
	public TreeNode(int value) {
		this.value = value;
	}

	public TreeNode getLeftNode() {
		return leftNode;
	}

	public void setLeftNode(TreeNode leftNode) {
		this.leftNode = leftNode;
	}

	public TreeNode getRightNode() {
		return rightNode;
	}

	public void setRightNode(TreeNode rightNode) {
		this.rightNode = rightNode;
	}
	
	//前序遍历
	public void frontShow() {
		System.out.print(value);
		if(leftNode != null) {
			leftNode.frontShow();
		}
		if(rightNode != null) {
			rightNode.frontShow();
		}
	}
	
	public void midleShow() {
		if(leftNode !=null) {
			leftNode.midleShow();
		}
		System.out.print(this.value);
		
		if(rightNode != null) {
			rightNode.midleShow();
		}
	}
	
	public void afterShow() {
		if(leftNode !=null) {
			leftNode.midleShow();
		}
		
		if(rightNode != null) {
			rightNode.midleShow();
		}	
		System.out.print(this.value);
	}
	
	

}
