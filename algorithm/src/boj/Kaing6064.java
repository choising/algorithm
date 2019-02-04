package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Kaing6064 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int m = Integer.parseInt(st.nextToken());
			int n = Integer.parseInt(st.nextToken());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			go(m, n, x, y);
		}
	}
	
	private static void go(int m, int n, int targetX, int targetY) {
		int max = 0;
		int y = 0;
		while(y != n) {
			max += m;
			y = y + m > n ? (y + m) % n : y + m;
			y = y == 0 ? n : y;
		}
		int answer = 0;
		answer += targetX;
		y = y + targetX > n ? (y + targetX) % n : y + targetX;
		y = y == 0 ? n : y;
		if(y == targetY) {
			System.out.println(answer);
			return;
		}
		while(answer < max) {
			answer += m;
			y = y + m > n ? (y + m) % n : y + m;
			y = y == 0 ? n : y;
			if(y == targetY) {
				System.out.println(answer);
				return;
			}
		}
		if(answer <= max && y == targetY) {
			System.out.println(max);
			return;
		}
		System.out.println(-1);
	}

}
