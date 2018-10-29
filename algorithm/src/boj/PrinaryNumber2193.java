package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrinaryNumber2193 {

	static int n;
	static long[] arr;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		solution();
	}
	
	public static void solution() {
		if(n == 1) {
			System.out.println(1);
			return;
		}
		if(n == 2) {
			System.out.println(1);
			return;
		}
		if(n == 3) {
			System.out.println(2);
			return;
		}
		arr = new long[n+1];
		arr[2] = 1;
		arr[3] = 2;
		
		for(int i = 4; i < n+1; i++) {
			arr[i] = arr[i-1] + arr[i-2];
		}
		
		System.out.println(arr[n]);
	}

}
