package adt;

public class ChoisingLinkedList<E>implements DoubleLinkedList<E>{
	private int size;
	private Node<E> head;
	private Node<E> tail;
	
	public ChoisingLinkedList() {
		this.size = 0;
	}

	@Override
	public E get(int index) {
		if(index >= this.size || index < 0) throw new IllegalArgumentException();
		Node<E> indexNode = this.findNode(index);
		return indexNode.element;
	}

	private Node<E> findNode(int index){
		Node<E> indexNode = this.head;
		for(int i = 0; i < index; i++) {
			indexNode = indexNode.next;
		}
		return indexNode;
	}
	
	@Override
	public int size() {
		return this.size;
	}
	
	@Override
	public void set(int index, E element) {
		// TODO Auto-generated method stub
		if(this.size < index) throw new IllegalArgumentException("size : " + this.size);
		if(index < 0) throw new IllegalArgumentException();
		
		if(this.size == 0) {
			this.init(element);
		} else if(index == 0) {
			this.addFirst(element);
		} else if(index == this.size) {
			this.addLast(element);
		} else {
			this.addGeneral(index, element);
		}
		
		this.size++;
	}
	
	private void init(E element) {
		Node<E> curNode = new Node<E>(element, null, null);
		this.head = curNode;
		this.tail = curNode;
	}

	private void addFirst(E element) {
		Node<E> curNode = new Node<E>(element, null, this.head);
		this.head.prev = curNode;
		this.head = curNode;
	}
	
	private void addLast(E element) {
		Node<E> curNode = new Node<E>(element, this.tail, null);
		this.tail.next = curNode;
		this.tail = curNode;
	}
	
	private void addGeneral(int index, E element) {
		Node<E> indexNode = this.findNode(index);
		Node<E> curNode = new Node<E>(element, indexNode.prev, indexNode);
		indexNode.prev = curNode;	
		curNode.prev.next = curNode;
	}
	
	@Override
	public E remove(int index) {
		// TODO Auto-generated method stub
		if(this.size <= index) throw new IllegalArgumentException("size : " + this.size);
		if(index < 0) throw new IllegalArgumentException();
		
		E value = null;
		if(index == 0) {
			value = this.removeFirst();
		} else if(index == this.size - 1) {
			value = this.removeLast();
		} else {
			value = this.removeGeneral(index);
		}
		
		this.size--;
		return value;
	}
	
	private E removeFirst() {
		E value = this.head.element;
		
		if(this.head.next == null) {
			this.head.element = null;
		}
		else {
			this.head.next.prev = null;
			this.head = this.head.next;
		}
		
		return value;
	}
	
	private E removeLast() {
		E value = this.tail.element;
		this.tail = tail.prev;
		this.tail.next = null;
		return value;
	}
	
	private E removeGeneral(int index) {
		Node<E> indexNode = this.findNode(index);
		E value = indexNode.element;
		indexNode.prev.next = indexNode.next;
		indexNode.next.prev = indexNode.prev;
		return value;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		Node<E> temp = head;
		sb.append(temp + ",");
		for(int i = 1; i < this.size; i++) {
			temp = temp.next;
			sb.append(temp + ",");
		}
		return "[" + sb.toString().substring(0, sb.length()-1) +"]";
	}

	private class Node<E> {
		private E element;
		Node<E> prev;
		Node<E> next;
		public Node(E element, Node<E> prev, Node<E> next) {
			this.element = element;
			this.prev = prev;
			this.next = next;
		}
		@Override
		public String toString() {
			return String.valueOf(this.element);
		}
		
	}
}
