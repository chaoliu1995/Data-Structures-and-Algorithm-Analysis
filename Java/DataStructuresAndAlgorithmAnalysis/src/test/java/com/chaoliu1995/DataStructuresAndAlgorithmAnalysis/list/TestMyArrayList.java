package com.chaoliu1995.DataStructuresAndAlgorithmAnalysis.list;

import java.util.Iterator;

import org.junit.Test;

public class TestMyArrayList {
	
	@Test
	public void testMyArrayList(){
		MyArrayList<Integer> list = new MyArrayList<Integer>();
		for(int i = 1;i<=20;i++) {
			list.add(i);
		}
		
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + " | ");
		}
		System.out.println();
		System.out.println("----------------remove---------------------");
		list.remove(10);
		it = list.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + " | ");
		}
		System.out.println();
		System.out.println("----------------add---------------------");
		list.add(6, 99);
		list.add(16, 199);
		it = list.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + " | ");
		}
		System.out.println();
	}
	
}
