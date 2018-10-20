package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Virus2606 {
	static int count = 0;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		
		int[][] arr = new int[n][n];
		boolean[] visit = new boolean[n];
		
		for(int i = 0; i < m; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int y = Integer.parseInt(st.nextToken()) - 1;
			int x = Integer.parseInt(st.nextToken()) - 1;
			arr[y][x] = 1;
			arr[x][y] = 1;
		}
		
		Queue<Integer> q = new LinkedList<>();
		q.add(0);
		visit[0] = true;
		bfs(arr, visit, q);
		
		System.out.println(count-1);
	}
	
	static void bfs(int[][] arr, boolean[] visit, Queue<Integer> q) {
		while(!q.isEmpty()) {
			count++;
			int v = q.poll();
			for(int i = 0; i < arr.length; i++) {
				if(arr[v][i] == 1 && visit[i] == false) {
					visit[i] = true;
					q.add(i);
				}
			}
		}
	}
	

}
