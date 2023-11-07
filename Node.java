package com.binarysearchtree;

public class Node {
    int data;
    public Node left;
	public Node right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}