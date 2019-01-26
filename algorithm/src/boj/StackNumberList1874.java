package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class StackNumberList1874 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		Stack<Integer> stack = new Stack<>();
		int pos = 0;
		for(int i = 1; i <= n; i++) {
			stack.push(i);
			sb.append("+").append(System.lineSeparator());
			while(!stack.isEmpty() && stack.peek() == arr[pos]) {
				pos++;
				stack.pop();
				sb.append("-").append(System.lineSeparator());
			}
		}
		if(!stack.isEmpty()) {
			System.out.println("NO");
		} else {
			System.out.println(sb.toString());	
		}
	}

}
