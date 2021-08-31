package com.bridgelabz.linkedlist;

public class LinkedListMain {
	public static void main(String[] args) {
		MyNode<Integer> firstNode = new MyNode<Integer>(56);
		MyNode<Integer> secondNode = new MyNode<Integer>(30);
		MyNode<Integer> thirdNode = new MyNode<Integer>(70);
		
		firstNode.setNext(secondNode);
		secondNode.setNext(thirdNode);
		
		System.out.println("Created a linked list :");
		MyNode<Integer> tempNode = firstNode;
		while(tempNode != null) {
			System.out.print(tempNode.getKey()+" -> ");
			tempNode = tempNode.getNext();
		}
		System.out.println("null");
	}
}
