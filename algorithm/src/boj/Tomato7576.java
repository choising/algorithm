package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Tomato7576 {

	static int[] moveY = { -1, 1, 0, 0 };
	static int[] moveX = { 0, 0, -1, 1 };
	static int n;
	static int m;
	static int count = 0;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		int[][] arr = new int[m+2][n+2];
		boolean[][] visit = new boolean[m+2][n+2];
		
		for(int i = 1; i < m+1; i++) {
			StringTokenizer temp = new StringTokenizer(br.readLine());
			for(int j = 1; j < n+1; j++) {
				arr[i][j] = Integer.parseInt(temp.nextToken());
			}
		}
		
		// init, padding boundary.
		for(int i = 0; i < m+2; i++) {
			arr[i][0] = -1;
			arr[i][n+1] = -1;
		}
		for(int i = 0; i < n+2; i++) {
			arr[0][i] = -1;
			arr[m+1][i] = -1;
		}
		
		Queue<String> q = new LinkedList<>();
		for(int i = 1; i < m + 1; i++) {
			for(int j = 1; j < n + 1; j++) {
				if(arr[i][j] == 1 && visit[i][j] == false) {
					q.add(i + "," + j);
					visit[i][j] = true;
				}
			}
		}
		
		while(!q.isEmpty()) {
			int qSize = q.size();
			for(int i = 0; i < qSize; i++) {
				unitBFS(arr, visit, q);
			}
			count++;
		}
		if(search(arr)) System.out.println(count-1);
		else System.out.println(-1);
	}
	
	static void unitBFS(int[][] arr, boolean[][] visit, Queue<String> q) {
		String[] sArr = q.poll().split(",");
		int y = Integer.parseInt(sArr[0]);
		int x = Integer.parseInt(sArr[1]);
		for(int i = 0; i < 4; i++) {
			int newY = y + moveY[i];
			int newX = x + moveX[i];
			if(arr[newY][newX] == 0 && visit[newY][newX] == false) {
				arr[newY][newX] = 1;
				visit[newY][newX] = true;
				q.add(newY + "," + newX);
			}
		}
	}
	
	static boolean search(int[][] arr) {
		for(int i = 1; i < m+1; i++) {
			for(int j = 1; j < n+1; j++) {
				if(arr[i][j] == 0) return false;
			}
		}
		return true;
	}
}
