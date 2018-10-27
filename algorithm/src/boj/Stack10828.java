package boj;

import java.util.Scanner;
import java.util.Stack;

public class Stack10828 {
	static Stack<Integer> stack = new Stack<>();
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws NumberFormatException {
		// TODO Auto-generated method stub
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			String inst = sc.next();
			if(inst.equals("push")) {
				int x = sc.nextInt();
				stack.push(x);
			}
			else if(inst.equals("pop")){
				if(stack.isEmpty()) System.out.println("-1");
				else System.out.println(stack.pop());
			}
			else if(inst.equals("size")) {
				System.out.println(stack.size());
			}
			else if(inst.equals("empty")) {
				System.out.println(stack.isEmpty() ? 1 : 0);
			}
			else if(inst.equals("top")) {
				if(stack.isEmpty()) System.out.println("-1");
				else System.out.println(stack.lastElement());
			}
		}
		sc.close();
	}
}
