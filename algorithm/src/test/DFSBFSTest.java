package test;

import java.util.LinkedList;
import java.util.Queue;

public class DFSBFSTest {
	static int[] moveY = { -1, 1, 0, 0 };
	static int[] moveX = { 0, 0, -1, 1 };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// for DFS Test
//		int[][] adj = {
//				{1, 1, 1, 1, 1, 1, 1},
//				{1, 0, 0, 0, 0, 0, 1},
//				{1, 1, 1, 1, 1, 0, 1},
//				{1, 0, 0, 0, 0, 0, 1},
//				{1, 0, 1, 1, 1, 0, 1},
//				{1, 0, 0, 0, 0, 0, 1},
//				{1, 1, 1, 1, 1, 1, 1}
//		};
		
		//for BFS Test
		int[][] adj = {
			{1, 1, 1, 1, 1, 1, 1},
			{1, 0, 0, 0, 0, 0, 1},
			{1, 0, 1, 1, 1, 0, 1},
			{1, 0, 1, 1, 1, 0, 1},
			{1, 0, 1, 1, 1, 0, 1},
			{1, 0, 0, 0, 0, 0, 1},
			{1, 1, 1, 1, 1, 1, 1}
		};
		
		boolean[][] visit = new boolean[7][7];
		
//		dfs(adj, visit, 1, 1);
		
		Queue<Integer> q = new LinkedList<>();
		q.add(11);
		bfs(adj, visit, q);
	}
	
	public static void dfs(int[][] adj, boolean[][] visit, int i, int j) {
		visit[i][j] = true;
		print(visit);

		for(int k = 0; k < 4; k++) {
			int indexY = i + moveY[k];
			int indexX = j + moveX[k];
			if(adj[indexY][indexX] == 0 && visit[indexY][indexX] == false) {
				dfs(adj, visit, indexY, indexX);
			}
		}
	}
	
	public static void bfs(int[][] adj, boolean[][] visit, Queue<Integer> q) {
		while(!q.isEmpty()) {
			int v = q.poll();
			visit[v/10][v%10] = true;
			print(visit);
			for(int k = 0; k < 4; k++) {
				int indexY = v/10 + moveY[k];
				int indexX = v%10 + moveX[k];
				if(adj[indexY][indexX] == 0 && visit[indexY][indexX] == false) {
					q.add(indexY * 10 + indexX);
				}
			}
		}
	}
	

	public static void print(boolean[][] visit) {
		for(int i = 0; i < visit.length; i++) {
			for(int j = 0; j < visit.length; j++) {
				System.out.print(visit[i][j] ? "1 " : "0 ");
			}
			System.out.println();
		}
		System.out.println("-------------");
	}
}
