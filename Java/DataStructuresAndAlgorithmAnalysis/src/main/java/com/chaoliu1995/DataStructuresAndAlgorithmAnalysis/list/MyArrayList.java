package com.chaoliu1995.DataStructuresAndAlgorithmAnalysis.list;

import java.util.Arrays;
import java.util.Iterator;

public class MyArrayList<T> {
	
	private static final int DEFAULT_SIZE = 10;
	
	private Object[] EMPTY_ARR = {};
	
	private int size = 0;
	
	public MyArrayList(){
		EMPTY_ARR = new Object[DEFAULT_SIZE];
		size = 0;
	}
	
	public Integer size() {
		return size;
	}
	
	public boolean add(T t) {
		checkArrSize();
		EMPTY_ARR[size] = t;
		size++;
		return true;
	}
	public boolean add(int idx,T t) {
		checkArrSize();
		if(idx >= size || idx < 0) {
			throw new IndexOutOfBoundsException(outOfBoundsMsg(idx));
		}
		for(int i = size; i > idx; i--) {
			EMPTY_ARR[i] = EMPTY_ARR[i-1];
		}
		EMPTY_ARR[idx] = t;
		size++;
		return true;
	}
	
	@SuppressWarnings("unchecked")
	public T get(int idx) {
		if(idx >=size)
			throw new IndexOutOfBoundsException(outOfBoundsMsg(idx));
		return (T)EMPTY_ARR[idx];
	}
	
	public boolean set(int idx,T t) {
		if(idx >=size)
			throw new IndexOutOfBoundsException(outOfBoundsMsg(idx));
		this.EMPTY_ARR[idx] = t;
		return true;
	}
	
	private String outOfBoundsMsg(int index) {
        return "Index: "+index+", Size: "+size;
    }
	
	private void checkArrSize() {
		if(size == EMPTY_ARR.length) {
			/*
			Object[] tempArr = new Object[size*2];
			for(int i = 0;i <= size-1;i++) {
				tempArr[i] = EMPTY_ARR[i];
			}
			EMPTY_ARR = tempArr;
			*/
			EMPTY_ARR = Arrays.copyOf(EMPTY_ARR, size * 2);
		}
	}
	
	public boolean isEmpty() {
		if(size == 0)
			return true;
		return false;
	}
	
	public void clear() {
		for(int i = 0;i < size; i++) {
			EMPTY_ARR[i] = null;
		}
		size = 0;
	}
	
	public Iterator<T> iterator(){
		return new MyArrayListIterator(0);
	}
	
	public boolean remove(int idx) {
		if(idx >= size || idx < 0) {
			throw new IndexOutOfBoundsException(outOfBoundsMsg(idx));
		}
		EMPTY_ARR[idx] = null;
		for(int i = idx; i < size-1;i++) {
			EMPTY_ARR[i] = EMPTY_ARR[i+1];
		}
		EMPTY_ARR[size-1] = null;
		size-=1;
		return true;
	}
	
	private class MyArrayListIterator implements Iterator<T>{
		
		private int current;
		private int next;
		
		MyArrayListIterator(int i){
			current = i;
		}
		
		@Override
		public boolean hasNext() {
			if(current != size) {
				return true;
			}
			return false;
		}

		@SuppressWarnings("unchecked")
		@Override
		public T next() {
			next = current;
			current++;
			return (T)EMPTY_ARR[next];
		}
		
	}
}
