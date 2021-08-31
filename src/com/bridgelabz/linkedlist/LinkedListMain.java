package com.bridgelabz.linkedlist;

public class LinkedListMain {
	public static void main(String[] args) {
		MyNode<Integer> firstNode = new MyNode<Integer>(56);
		MyNode<Integer> secondNode = new MyNode<Integer>(30);
		MyNode<Integer> thirdNode = new MyNode<Integer>(40);
		MyNode<Integer> fourthNode = new MyNode<Integer>(70);
		
		MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();
		myLinkedList.addInOrder(firstNode);
		myLinkedList.addInOrder(secondNode);
		myLinkedList.addInOrder(thirdNode);
		myLinkedList.addInOrder(fourthNode);
		
		System.out.println("Created a linked list :");
		myLinkedList.display();
		
		
	}
}
