
public class SuperStack<T> {
	private T[] items;
	private int top;
	
	
	public SuperStack<T>(int size){
		items = (T[]) new Object[size];
		
	}
	
	public boolean isEmpty() {
		return true;
	}
	
	public boolean isFull() {
		return true;
	}
	
	public boolean push(T item) {
		return true;
	}
	
	public T pop() {
		return null;
	}
}
