package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FemalePresident2775 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		int[][] arr = new int[15][15];
		for (int i = 0; i < arr.length; i++) {
			arr[0][i] = i+1;
			arr[i][0] = 1;
		}
		
		for (int i = 0; i < t; i++) {
			int n = Integer.parseInt(br.readLine());
			int m = Integer.parseInt(br.readLine()) - 1;

			for (int j = 1; j <= n; j++) {
				for (int k = 1; k <= m; k++) {
					arr[j][k] = arr[j-1][k] + arr[j][k-1]; 
				}
			}
			System.out.println(arr[n][m]);
		}
	}
}
