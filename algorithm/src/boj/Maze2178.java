package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Maze2178 {
	static int count = 1;
	static int min = 9999999;
	static int n;
	static int m;
	static int[] moveY = { -1, 1, 0, 0 };
	static int[] moveX = { 0, 0, -1, 1 };
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		int[][] adj = new int[n+2][m+2];
		boolean[][] visit = new boolean[n+2][m+2]; 
		
		for(int i = 0; i < n+2; i++) {
			adj[i][0] = 0;
			adj[i][m+1] = 0;
		}
		
		for(int i = 0; i < m+2; i++) {
			adj[0][i] = 0;
			adj[n+1][i] = 0;
		}
		
		for(int i = 0; i < n; i++) {
			String[] tempArr = br.readLine().split("");
			for(int j = 0; j < tempArr.length; j++) {
				adj[i+1][j+1] = Integer.parseInt(tempArr[j]);
			}
		}
		
//		dfs(adj, visit, 1, 1);
		
		Queue<String> q = new LinkedList<>();
		q.add("1,1");
		visit[1][1] = true;
		bfs(adj, visit, q);
		System.out.println(count+1);
	}
	
//	static void dfs(int[][] adj, boolean[][] visit, int y, int x) {
//		if(y == n && x == m) {
//			if(min > count) min = count;
//		}
//		
//		for(int i = 0; i < 4; i++) {
//			int newY = y + moveY[i];
//			int newX = x + moveX[i];
//			if(adj[newY][newX] == 1 && visit[newY][newX] == false) {
//				visit[newY][newX] = true;
//				count++;
//				dfs(adj, visit, newY, newX);
//				visit[newY][newX] = false;
//				count--;
//			}
//		}
//	}
	static void bfs(int[][] adj, boolean[][] visit, Queue<String> q) {
		while(!q.isEmpty()) {
			int size = q.size();
			for(int i = 0; i < size; i++) {
				String[] strs = q.poll().split(",");
				int y = Integer.parseInt(strs[0]);
				int x = Integer.parseInt(strs[1]);
				for(int j = 0; j < 4; j++) {
					int newY = y + moveY[j];
					int newX = x + moveX[j];
					if(newY == n && newX == m) return;
					if(adj[newY][newX] == 1 && visit[newY][newX] == false) {
						visit[newY][newX] = true;
						q.add(newY + "," + newX);
					}
				}
			}
			count++;	
		}
	}
}
