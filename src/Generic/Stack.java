package Generic;

public class Stack<E> {
	private Object[] elements;
	private int size = 0;
	private static final int DEFAULT_INITIAL_CAPACITY = 16;
	
	public Stack(){
		elements = new Object[DEFAULT_INITIAL_CAPACITY];
	}
	
}
