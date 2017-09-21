package com.chaoliu1995.DataStructuresAndAlgorithmAnalysis.list;


public class MyLinkedList<T> {
	
	private int size;
	
	private Node<T> first;
	
	private Node<T> last;
	
	public MyLinkedList() {
		size = 0;
	}
	
	private static class Node<T>{
		Node<T> next;
		Node<T> prev;
		T item;
		
		public Node(Node<T> prev,T item,Node<T> next) {
			this.item= item;
			this.prev = prev;
			this.next = next;
		}
	}
	
	public boolean add(T t) {
		if(first == null) {
			first.item = t;
		}else {
			last.next = new Node<T>(last.prev,t,null);
			last = last.next;
		}
		return true;
	}
	
	public boolean addFirst(T t) {
		if(first == null) {
			first = new Node<T>(null,t,null);
			last = first;
		}else {
			first.prev = new Node<T>(null,t,first);
			first = first.prev;
		}
		size++;
		return true;
	}
	public boolean addLast(T t) {
		if(last == null) {
			last = new Node<T>(null,t,null);
			first = last;
		}else {
			last.next = new Node<T>(last,t,null);
			last = last.next;
		}
		size++;
		return true;
	}
	
	public T get(int idx) {
		return null;
	}
	
	public T set(int idx,T t) {
		return null;
	}
	
	public boolean contains(T t) {
		return false;
	}
	
	public boolean removeFirst() {
		if(first == null) {
			return false;
		}
		first = first.next;
		first.prev = null;
		size--;
		return true;
	}
	public boolean removeLast() {
		if(last == null) {
			return false;
		}
		last = last.prev;
		last.next = null;
		size--;
		return true;
	}
	
	public T getFirst() {
		if(first == null) {
			return null;
		}
		return first.item;
	}
	
	public T getLast() {
		if(last == null) {
			return null;
		}
		return last.item;
	}
	
	public int size() {
		return size;
	}
	
}
