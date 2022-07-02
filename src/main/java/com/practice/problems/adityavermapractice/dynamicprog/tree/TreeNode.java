package com.practice.problems.adityavermapractice.dynamicprog.tree;

import lombok.Data;

@Data
public class TreeNode<T> {

	public T val;
	public TreeNode<T> left;
	public TreeNode<T> right;

	public TreeNode() {
	}

	public TreeNode(T val) {
		this.val = val;
	}

	public TreeNode(T val, TreeNode<T> left, TreeNode<T> right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
}