package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibonacci2747 {

	static int n;
	static int[] fib;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		fib();
	}
	
	public static void fib() {
		if(n == 0) {
			System.out.println(0);
			return;
		}
		if(n <= 2) {
			System.out.println(1);
			return;
		}
		fib = new int[n+1];
		fib[0] = 0;
		fib[1] = 1;
		for(int i = 2; i < n+1; i++) {
			fib[i] = fib[i-1] + fib[i-2];
		}
		System.out.println(fib[n]);
	}

}
