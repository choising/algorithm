package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FibonacciFunction1003 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[][] fib = new int[41][2];
		fib[0][0] = 1;
		fib[0][1] = 0;
		fib[1][0] = 0;
		fib[1][1] = 1;
		for(int i = 2; i < 41; i++) {
			fib[i][0] = fib[i-1][0] + fib[i-2][0];
			fib[i][1] = fib[i-1][1] + fib[i-2][1];
		}
		
		int n = Integer.parseInt(br.readLine());
		for(int i = 0; i < n; i++) {
			int m = Integer.parseInt(br.readLine());
			System.out.println(fib[m][0] + " " + fib[m][1]);
		}
	}

}
