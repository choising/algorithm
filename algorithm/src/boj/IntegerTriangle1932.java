package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class IntegerTriangle1932 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[][] origin = new int[n][n];
		int[][] answer = new int[n][n];
		origin[0][0] = Integer.parseInt(br.readLine());
		for(int i = 1; i < n; i++) {
			String[] ss = br.readLine().split(" ");
			int[] arr = Arrays.stream(ss).mapToInt(s -> Integer.parseInt(s)).toArray();
			origin[i] = arr;
		}
		
		answer[0] = origin[0];
		
		for(int i = 1; i < n; i++) {
			answer[i][0] = origin[i][0] + answer[i-1][0];
			for(int j = 1; j <= i; j++) {
				answer[i][j] = origin[i][j] + Math.max(answer[i-1][j], answer[i-1][j-1]);
			}
		}
		
		int max = 0;
		for(int i = 0; i < n; i++) {
			max = Math.max(max, answer[n-1][i]);
		}
		System.out.println(max);
	}

}
