package test;

public class DynamicArray<E> {
	private static final int DEFAULT_SIZE = 10;
	
	private int size;
	private Object[] arr;
	
	public DynamicArray() {
		this.size = 0;
		this.arr = new Object[DEFAULT_SIZE];
	}
	
	public DynamicArray(int size) {
		if(size < 0) throw new IllegalArgumentException();
		this.size = size;
		this.arr = new Object[this.size];
	}

	public E get(int index) {
		if(index >= this.size) throw new IllegalArgumentException();
		return (E)this.arr[index];
	}

	public int size() {
		return this.size;
	}
	
	public void set(int index, E value) {
		if(index >= this.arr.length) {
			int newSize = this.newSize(index);
			this.sizeUp(newSize);
		}
		if(index+1 > this.size) this.size = index+1; 
		this.arr[index] = value;		
	}

	public E remove(int index) {
		if(index >= this.size) throw new IllegalArgumentException();
		E value = (E)this.arr[index];
		this.shiftLeft(index);		
		return value;
	}
	
	private void shiftLeft(int index) {
		this.size--;
		for(int i = index; i < this.size; i++) {
			this.arr[i] = this.arr[i+1];
		}
	}
	
	private int newSize(int index) {
		int curSize = this.arr.length;
		while(index >= curSize) curSize *= 2;
		return curSize;
	}
	
	private void sizeUp(int newSize) {
		Object[] temp = new Object[newSize];
		for(int i = 0; i < this.size; i++) {
			temp[i] = this.arr[i];
		}
		this.arr = temp;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for(int i = 0; i < this.size - 1; i++) {
			sb.append(this.arr[i] + ", ");
		}
		sb.append(this.arr[this.size-1] + "]");
		return sb.toString();
	}
	
	

}
