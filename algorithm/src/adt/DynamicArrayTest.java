package adt;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class DynamicArrayTest {
	@Test
	public void init() {
		DynamicArray<Integer> da = new DynamicArray<>();
		assertEquals(0, da.size());
		
		int size = 15;
		DynamicArray<Integer> da2 = new DynamicArray<>(size);
		assertEquals(size, da2.size());
		
		size = 5;
		DynamicArray<Integer> da3 = new DynamicArray<>(size);
		assertEquals(size, da3.size());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void getWithException() {
		DynamicArray<Integer> da = new DynamicArray<>();
		da.get(11);
	}
	
	@Test
	public void get() {
		DynamicArray<Integer> da = new DynamicArray<>();
		da.set(0, 1);
		assertEquals((Integer)1, da.get(0));
	}
	
	@Test
	public void set() {
		DynamicArray<Integer> da = new DynamicArray<>();
		da.set(0, 1);
		assertEquals((Integer)1, da.get(0));
		
		da.set(10, 5);
		assertEquals((Integer)5, da.get(10));
		assertEquals(11, da.size());
		
		DynamicArray<String> da2 = new DynamicArray<>();
		da2.set(0, "Hello");
		assertEquals("Hello", da2.get(0));
	}
	
	@Test
	public void remove() {
		DynamicArray<Integer> da = new DynamicArray<>();
		da.set(0, 0);
		da.set(1, 1);
		da.set(2, 2);
		da.set(3, 3);
		da.set(4, 4);
		da.set(5, 5);
		assertEquals(6, da.size());
		assertEquals("[0, 1, 2, 3, 4, 5]", da.toString());
		assertEquals((Integer)3, da.remove(3));
		assertEquals(5, da.size());
		assertEquals("[0, 1, 2, 4, 5]", da.toString());
	}
	
	

}
