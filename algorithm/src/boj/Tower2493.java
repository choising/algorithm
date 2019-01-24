package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Tower2493 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Stack<MyPair> stack = new Stack<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();

		for(int i = 0; i < n; i++) {
			int cur = Integer.parseInt(st.nextToken());
			sb.append(go(cur, i, stack) + " ");
		}
		System.out.println(sb.toString());
	}
	
	private static int go(int cur, int index, Stack<MyPair> stack) {
		while(!stack.isEmpty()) {
			MyPair candidate = stack.pop();
			if(candidate.getValue() > cur) {
				stack.push(candidate);
				stack.push(new MyPair(index, cur));
				return candidate.getIndex() + 1;
			}
		}
		stack.push(new MyPair(index, cur));
		return 0;
	}

}

class MyPair {
	private int index;
	private int value;
	
	public int getIndex() {
		return index;
	}
	public int getValue() {
		return value;
	}
	public MyPair(int index, int value) {
		this.index = index;
		this.value = value;
	}
}
