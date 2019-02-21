package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No3000Bus9546 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		int[] arr = new int[31];
		arr[1] = 1;
		for(int i = 2; i < 31; i++) {
			arr[i] = arr[i-1]*2 + 1;
		}
		
		for(int i = 0; i < t; i++) {
			System.out.println(arr[Integer.parseInt(br.readLine())]);
		}
	}
}
