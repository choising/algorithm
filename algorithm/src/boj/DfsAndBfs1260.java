package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class DfsAndBfs1260 {
	static int[][] adj;
	static boolean[] visit;
	static Queue<Integer> q;
	static int n;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		q = new LinkedList<>();
		
		n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int v = Integer.parseInt(st.nextToken());
		
		adj = new int[n+1][n+1];
		visit = new boolean[n+1];
		
		for(int i = 0; i < m; i++) {
			StringTokenizer temp = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(temp.nextToken());
			int y = Integer.parseInt(temp.nextToken());
			adj[x][y] = 1;
			adj[y][x] = 1;
		}
		
		int[][] bfsAdj = Arrays.copyOf(adj, n+1);
		boolean[] bfsVisit = Arrays.copyOf(visit, n+1);
		
		dfs(v);
		System.out.println();
		q.add(v);
		bfsVisit[v] = true;
		bfs(bfsAdj, bfsVisit);
		
	}
	
	
	static void bfs(int[][] bfsAdj, boolean[] bfsVisit) {
		while(!q.isEmpty()) {
			int v = q.poll();
			System.out.print(v + " ");
			for(int i = 1; i < n+1; i++) {
				if(bfsAdj[v][i] == 1 && bfsVisit[i] == false) {
					q.add(i);
					bfsVisit[i] = true;
				}
			}
		}
	}
	
	static void dfs(int v) {
		System.out.print(v + " ");
		visit[v] = true;
		for(int i = 1; i < n+1; i++) {
			if(adj[v][i] == 1 && visit[i] == false) {
				dfs(i);
			}
		}
		
	}
	
	
	
	
	
	
	
	

}
