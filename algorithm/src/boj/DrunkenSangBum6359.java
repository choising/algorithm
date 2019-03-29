package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DrunkenSangBum6359 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());

		boolean arr[] = new boolean[101];
		
		for(int i = 1; i < 101; i++) {
			for(int j = i; j < 101; j+=i) {
				arr[j] = !arr[j];
			}
		}
		
		for(int i = 0; i < t; i++) {
			int n = Integer.parseInt(br.readLine());
			System.out.println(go(arr, n));
		}
	}
	
	static int go(boolean[] arr, int n) {
		int answer = 0;
		for(int i = 1; i <= n; i++) {
			if(arr[i]) answer++;
		}
		return answer;
	}

}
