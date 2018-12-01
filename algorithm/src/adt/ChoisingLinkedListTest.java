package adt;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ChoisingLinkedListTest {
	
	@Test
	public void create() {
		DoubleLinkedList<Integer> list = new ChoisingLinkedList<>();
		assertEquals(0, list.size());
	}
	
	@Test
	public void set() {
		DoubleLinkedList<Integer> list = new ChoisingLinkedList<>();
		list.set(0, 5);
		list.set(0, 3);
		list.set(0,10);
	}
	
}
