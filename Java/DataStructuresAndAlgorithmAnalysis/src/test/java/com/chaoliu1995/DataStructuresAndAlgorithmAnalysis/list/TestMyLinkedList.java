package com.chaoliu1995.DataStructuresAndAlgorithmAnalysis.list;

import org.junit.Test;

public class TestMyLinkedList {
	
	@Test
	public void testMyLinkedList(){
		MyLinkedList<Integer> list = new MyLinkedList<Integer>();
		int i = 1;
		while(i <= 20) {
			list.addFirst(i);
			i++;
		}
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
	}
	
}
