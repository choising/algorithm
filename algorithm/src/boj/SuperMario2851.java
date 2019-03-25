package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SuperMario2851 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[10];
		int[] answer = new int[10];
		int sum = 0;
		for(int i = 0; i < 10; i++) {
			int n = Integer.parseInt(br.readLine());
			sum += n;
			arr[i] = n;
			answer[i] = sum - 100;
		}
		
		int min = 1000;
		int minIndex = 0;
		for(int i = 0; i < 10; i++) {
			int abs = Math.abs(answer[i]);
			if(min >= abs) {
				min = abs;
				minIndex = i;
			}			
		}
		
		int x = 0;
		for(int i = 0; i <= minIndex; i++) {
			x += arr[i];
		}
		
		System.out.println(x);
	}

}
