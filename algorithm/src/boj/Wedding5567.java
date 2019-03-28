package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Wedding5567 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[][] arr = new int[n+1][n+1];
		int t = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			arr[a][b] = 1;
			arr[b][a] = 1;
		}
		
		// 1의 친구
		Set<Integer> set = new HashSet<>();
		for(int i = 2; i <= n; i++) {
			if(arr[i][1] == 1) {
				set.add(i);
			}
		}
		
		for(int i = 1; i <= n; i++) {
			arr[1][i] = 0;
			arr[i][1] = 0; 
		}
		
		Set<Integer> newSet = new HashSet<>();
		
		for (int i : set) {
			for (int j = 1; j <= n; j++) {
				if(arr[i][j] == 1) {
					newSet.add(j);
				}
			}
			for(int j = 1; j <= n; j++) {
				arr[i][j] = 0;
				arr[j][i] = 0; 
			}
		}

		newSet.addAll(set);
		
		System.out.println(newSet.size());
	}
}
