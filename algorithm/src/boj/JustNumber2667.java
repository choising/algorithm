package boj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class JustNumber2667 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n+2][n+2];
		String[][] sArr = new String[n+2][n+2];
		for(int i = 1; i <= n; i++) {
			sArr[i] = sc.next().split("");
		}
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				arr[i][j] = Integer.parseInt(sArr[i][j-1]);
			}
		}

		sc.close();
		boolean visit[][] = new boolean[arr.length][arr.length];
		List<Integer> list = new ArrayList<>();
		Queue<int[]> q = new LinkedList<>();
		
		for(int i = 1; i < arr.length; i++) {
			for(int j = 1; j < arr.length; j++) {
				if(arr[i][j] == 1 && visit[i][j] == false) {
					visit[i][j] = true;
					int[] qArr = new int[2];
					qArr[0] = i;
					qArr[1] = j;
					q.add(qArr);
					bfs(arr, visit, q, 0, list);
				}
			}
		}
		
		System.out.println(list.size());
		Collections.sort(list);
		for(int intVal : list) {
			System.out.println(intVal);
		}
	}
	

	public static void bfs(int[][] arr, boolean[][] visit, Queue<int[]> q, int cnt, List<Integer> list) {
		if(q.isEmpty()) {
			list.add(cnt);
			return;
		}
		int[] qArr = q.poll();
		cnt += 1;
		int[] minusX = {-1, 1, 0, 0};
		int[] minusY = {0, 0, -1, 1};
		
		for(int i = 0; i < 4; i++) {
			int x = qArr[0] + minusX[i];
			int y = qArr[1] + minusY[i];
			if(arr[x][y] == 1 && visit[x][y] == false) {
				visit[x][y] = true;
				int[] newArr = new int[2];
				newArr[0] = x;
				newArr[1] = y;
				q.add(newArr);
			}
		}
		bfs(arr, visit, q, cnt, list);
	}
}
