package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FibonacciTwo2748 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		System.out.println(fib(n));
	}
	
	static long fib(int n) {		
		if(n == 0) return 0;
		if(n == 1) return 1;
		long[] fib = new long[n+1];
		fib[0] = 0;
		fib[1] = 1;
		for(int i = 2; i < n+1; i++) {
			fib[i] = fib[i-1] + fib[i-2];
		}
				
		return fib[n];
	}

}
