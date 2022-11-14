package com.gl.dsa.bsttoskewedtree;

class Node{
	int val;
	Node left;
	Node right;
	
	Node(int data){
		val = data;
		left = null;
		right = null;
	}
}

public class BSTtoSkewedTree {
	
	static Node node;
	static Node previousNode = null;
	static Node headNode = null;
	
	static void ConvertBSTtoSkewedTree(Node root, int order) {
		
		if(root == null) {
			return;
		}
		if(order > 0) {
			ConvertBSTtoSkewedTree(root.right, order);
		}else {
			ConvertBSTtoSkewedTree(root.left, order);
		}
		
		Node rightNode = root.right;
		Node leftNode = root.left;
		
		if (headNode == null) {
			headNode = root;
			root.left = null;
			previousNode = root;
		}else {
			previousNode.right = root;
			root.left = null;
			previousNode = root;
		}
		
		if (order > 0) {
			ConvertBSTtoSkewedTree(leftNode, order);
		}else {
			ConvertBSTtoSkewedTree(rightNode, order);
		}
	}
	
	public static void traverseToSkewed(Node root) {
		if(root == null) {
			return;
		}
		System.out.print(root.val + " ");
		traverseToSkewed(root.right);
	}
	
	public static void main(String[] args) {
		
		BSTtoSkewedTree tree = new BSTtoSkewedTree();
		tree.node = new Node(50);
	     tree.node.left = new Node(30);
	     tree.node.right = new Node(60);
	     tree.node.left.left = new Node(10);
	     tree.node.right.left= new Node(55);
	     
	     int order = 0;
	     ConvertBSTtoSkewedTree(node, order);
	     traverseToSkewed(headNode);

	}

}
