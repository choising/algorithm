package adt;

public interface DoubleLinkedList<E> {
	void set(int index, E element);
	E remove(int index);
	E get(int index);
	int size();
}
