package com.headcrest.generics;

public class GenericStack<E> {
	private E [] elements;
	private int size = 0;
	final int DEFAULT_CAPACITY = 50;
		
	GenericStack() {
		elements = (E[]) new Object[DEFAULT_CAPACITY];
	}
	
	GenericStack(int capacity) {
		elements = (E[]) new Object[capacity];
	}
	
	public void push(E value) {
		if (size >= elements.length) {
		      E[] temp = (E[])new Object[elements.length * 2];
		      System.arraycopy(elements, 0, temp, 0, elements.length);
		      elements = temp;
		}
		elements[size++] = value;
	}
	
	public int capacity() {return elements.length;} // Introduced during testing
	
	public E peek() {
		return elements[size-1];
	}
	
	public E pop() {
		return elements[--size];
	}
	
	public boolean isEmpty() {
		return (size == 0);
	}
	
	@Override
	public String toString() {
		StringBuilder b = new StringBuilder();
		for (int i = size-1; i >= 0; i--) {
			b.append(elements[i].toString());
			if (i > 0) 
				b.append(",");
		}
		return b.toString();
	}
}
