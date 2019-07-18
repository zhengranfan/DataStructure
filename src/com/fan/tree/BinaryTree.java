package com.fan.tree;

public class BinaryTree {
	private TreeNode root;

	public TreeNode getRoot() {
		return root;
	}

	public void setRoot(TreeNode root) {
		this.root = root;
	}
	
	//前序遍历
	public void frontShow() {
		root.frontShow();
	}
	
	public void midleShow() {
		root.midleShow();
	}
	
	public void afterShow() {
		root.afterShow();

	}
	
	public TreeNode frontSearch(int value) {	
		return  root.frontSearch(value);
	}
}
