package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NumberSquare1051 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[][] arr = new int[n][m];
		
		for(int i = 0; i < n; i++) {
			String[] ss = br.readLine().split("");
			for(int j = 0; j < m; j++) {
				arr[i][j] = Integer.parseInt(ss[j]);
			}
		}
		
			int max = 1;
			for(int i = 0; i < n-1; i++) {
				for(int j = 0; j < m-1; j++) {
					int target = arr[i][j];
					for(int k = j+1; k < m; k++) {
						if(target == arr[i][k]) {
							int diff = k - j;
							if(i + diff < n) {
								int x = arr[i+diff][k];
								int y = arr[i+diff][j];
								if(target == x && target == y) {
									max = Math.max((diff+1)*(diff+1), max);
								}
							}
						}
					}
				}
			}
			System.out.println(max);
		}
}
