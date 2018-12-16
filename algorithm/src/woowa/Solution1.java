package woowa;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class Solution1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int solution(String S) {
		return action(binaryToInt(S));
	}

	private int binaryToInt(String binary) {
		return Integer.parseInt(binary, 2);
	}

	private int action(int v) {
		int count = 0;
		while (v != 0) {
			if (v % 2 == 0) {
				v /= 2;
			} else if (v % 2 == 1) {
				v -= 1;
			}
			count++;
		}
		return count;
	}

	@Test
	public void action() {
		int v = 28;
		assertEquals(7, action(v));
	}

	@Test
	public void binaryToInt() {
		String s = "011100";
		assertEquals(28, binaryToInt(s));
	}

	@Test
	public void countToZero() {
		String s = "011100";
		assertEquals(7, solution(s));
	}
}
