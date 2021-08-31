package com.bridgelabz.linkedlist;

public class MyLinkedList<K> {
	public MyNode<K> head;
	public MyNode<K> tail;
	
	public MyLinkedList() {
		this.head = null;
		this.tail = null;
	}
	
	public void add(MyNode<K> newNode) {
		if(head == null) {
			this.head = newNode;
		}
		if(tail == null) {
			this.tail = newNode;
		}
		else {
			newNode.setNext(this.head);
			this.head = newNode;
		}
	}
	
	public void append(MyNode<K> newNode) {
		if(head == null) {
			this.head = newNode;
		}
		if(tail == null) {
			this.tail = newNode;
		}
		else {
			this.tail.setNext(newNode);
			this.tail = newNode;
		}
	}
	
	public void insert(MyNode<K> prevNode , MyNode<K> newNode) {
		MyNode<K> tempNode = prevNode.getNext();
		prevNode.setNext(newNode);
		newNode.setNext(tempNode);
	}
	
	public MyNode<K> pop(){
		MyNode<K> tempNode = this.head;
		this.head = this.head.getNext();
		return tempNode;
	}
	
	public MyNode<K> popLast(){
		MyNode<K> tempNode= this.head;
		while(!tempNode.getNext().equals(this.tail)) {
			tempNode = tempNode.getNext();
		}
		this.tail = tempNode;
		tempNode = tempNode.getNext();
		this.tail.setNext(null);
		return tempNode;
	}
	
	
	public void display() {
		MyNode<K> tempNode = this.head;
		while(tempNode != null) {
			System.out.print(tempNode.getKey()+" -> ");
			tempNode = tempNode.getNext();
		}
		System.out.println("null");
	}
}
