package com.bridgelabz.linkedlist;

public class LinkedListMain {
	public static void main(String[] args) {
		MyNode<Integer> firstNode = new MyNode<Integer>(56);
		MyNode<Integer> secondNode = new MyNode<Integer>(30);
		MyNode<Integer> thirdNode = new MyNode<Integer>(40);
		MyNode<Integer> fourthNode = new MyNode<Integer>(70);
		
		MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();
		myLinkedList.append(firstNode);
		myLinkedList.append(secondNode);
		myLinkedList.append(thirdNode);
		myLinkedList.append(fourthNode);
		
		System.out.println("Created a linked list :");
		myLinkedList.display();
		myLinkedList.delete(40);
		System.out.println("after deleting 40, size is : "+myLinkedList.size());
		
	}
}
