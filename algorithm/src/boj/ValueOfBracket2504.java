package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class ValueOfBracket2504 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		System.out.println(calculate(s));	
	}
	
	private static int calculate(String s) {
		Stack<String> inputStack = new Stack<>();
		Stack<String> stack = new Stack<>();

		for(int i = 0; i < s.length(); i++) {
			inputStack.push(String.valueOf(s.charAt(i)));
		}
		
		while(!inputStack.isEmpty()) {
			String element = inputStack.pop();
			if(element.equals("(")) {
				if(stack.isEmpty()) return 0;
				String curElement = stack.pop();
				int number = 0;
				while(!curElement.equals(")")) {
					if(stack.isEmpty() || curElement.equals("]")) return 0;
					number += Integer.parseInt(curElement);
					curElement = stack.pop();
				}
				if(number == 0) stack.push(String.valueOf(2));
				else {
					stack.push(String.valueOf(2 * number));
				}
			}
			else if(element.equals("[")) {
				if(stack.isEmpty()) return 0;
				String curElement = stack.pop();
				int number = 0;
				while(!curElement.equals("]")) {
					if(stack.isEmpty() || curElement.equals(")")) return 0;
					number += Integer.parseInt(curElement);
					curElement = stack.pop();
				}
				if(number == 0) stack.push(String.valueOf(3));
				else {
					stack.push(String.valueOf(3 * number));
				}
			}
			else {
				stack.push(element);
			}
		}
		
		int answer = 0;
		
		while(!stack.isEmpty()) {
			String e = stack.pop();
			if(e.equals("(") || e.equals(")") || e.equals("[") || e.equals("]")) {
				return 0;
			}
			answer += Integer.parseInt(e);
		}
		return answer;
	}

}
