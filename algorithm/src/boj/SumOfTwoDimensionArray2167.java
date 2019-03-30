package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SumOfTwoDimensionArray2167 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[][] arr = new int[n+1][m+1];
		for(int i = 1; i < n+1; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 1; j < m+1; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int[][] sum = new int[n+1][m+1];
		
		for(int i = 1; i < n+1; i++) {
			for(int j = 1; j < m+1; j++) {
				sum[i][j] = sum[i-1][j] + sum[i][j-1] - sum[i-1][j-1] + arr[i][j];
			}
		}
		
		int t = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine());
			int sX = Integer.parseInt(st.nextToken());
			int sY = Integer.parseInt(st.nextToken());
			int eX = Integer.parseInt(st.nextToken());
			int eY = Integer.parseInt(st.nextToken());
			int answer = sum[eX][eY] - sum[sX-1][eY] - sum[eX][sY-1] + sum[sX-1][sY-1];
			System.out.println(answer);
		}
	}

}
