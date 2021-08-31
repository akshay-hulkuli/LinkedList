package com.bridgelabz.linkedlist;

public class LinkedListMain {
	public static void main(String[] args) {
		MyNode<Integer> firstNode = new MyNode<Integer>(56);
		MyNode<Integer> secondNode = new MyNode<Integer>(30);
		MyNode<Integer> thirdNode = new MyNode<Integer>(70);
		
		MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();
		myLinkedList.append(firstNode);
		myLinkedList.append(secondNode);
		myLinkedList.append(thirdNode);
		
		System.out.println("Created a linked list :");
		myLinkedList.display();
		
		System.out.println("popped element is : "+myLinkedList.popLast().getKey() );
		
		System.out.println("modified linked list :");
		myLinkedList.display();
		
		
	}
}
