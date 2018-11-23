package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class WithoutBracket16503 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int operand1 = Integer.parseInt(st.nextToken());
		String op1 = st.nextToken();
		int operand2 = Integer.parseInt(st.nextToken());
		String op2 = st.nextToken();
		int operand3 = Integer.parseInt(st.nextToken());
		
		int answer = calc(calc(operand1, op1, operand2), op2, operand3);
		int answer2 = calc(operand1, op1, calc(operand2, op2, operand3));
		
		if(answer < answer2) {
			System.out.println(answer);
			System.out.println(answer2);
		}
		else {
			System.out.println(answer2);
			System.out.println(answer);
		}
	}
	
	public static int calc(int operand1, String op, int operand2) {
		if(op.equals("+")) return operand1 + operand2;
		if(op.equals("-")) return operand1 - operand2;
		if(op.equals("*")) return operand1 * operand2;
		if(op.equals("/")) return operand1 / operand2;
		return 0;
	}

}
