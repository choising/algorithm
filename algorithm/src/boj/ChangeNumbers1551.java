package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ChangeNumbers1551 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int r = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];
		st = new StringTokenizer(br.readLine(), ",");
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i = 1; i <= r; i++) {
			for(int j = 0; j < n - i; j++) {
				arr[j] = arr[j+1] - arr[j];
			}
		}
		
		for(int i = 0; i < n - r - 1; i++) {
			System.out.print(arr[i] + ",");
		}
		System.out.println(arr[n-r-1]);
	}
}
