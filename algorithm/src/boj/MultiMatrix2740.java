package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MultiMatrix2740 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[][] arr1 = new int[n][m];
		for(int i = 0; i < n; i++) {
			StringTokenizer stt = new StringTokenizer(br.readLine());
			for(int j = 0; j < m; j++) {
				arr1[i][j] = Integer.parseInt(stt.nextToken());
			}
		}
		
		st = new StringTokenizer(br.readLine());
		m = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int[][] arr2 = new int[m][k];
		for(int i = 0; i < m; i++) {
			StringTokenizer stt = new StringTokenizer(br.readLine());
			for(int j = 0; j < k; j++) {
				arr2[i][j] = Integer.parseInt(stt.nextToken());
			}
		}
		
		int[][] arr3 = new int[n][k];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < k; j++) {
				arr3[i][j] = go(arr1, arr2, i, j);
			}
		}
		
		for(int i = 0; i < arr3.length; i++) {
			for(int j = 0; j < arr3[0].length; j++) {
				System.out.print(arr3[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	static int go(int[][] arr1, int[][] arr2, int x, int y) {
		int sum = 0;
		for(int i = 0; i < arr2.length; i++) {
			sum += arr1[x][i] * arr2[i][y];
		}
		return sum;
	}
	
}
