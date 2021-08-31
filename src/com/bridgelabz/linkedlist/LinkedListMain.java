package com.bridgelabz.linkedlist;

public class LinkedListMain {
	public static void main(String[] args) {
		MyNode<Integer> firstNode = new MyNode<Integer>(70);
		MyNode<Integer> secondNode = new MyNode<Integer>(30);
		MyNode<Integer> thirdNode = new MyNode<Integer>(56);
		
		MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();
		myLinkedList.add(firstNode);
		myLinkedList.add(secondNode);
		myLinkedList.add(thirdNode);
		
		System.out.println("Created a linked list :");
		myLinkedList.display();
		
	}
}
