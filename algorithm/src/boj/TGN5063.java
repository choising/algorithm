package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TGN5063 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int r = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			go(r, e - c);
		}
	}

	private static void go(int r, int eMinusC) {
		if(r > eMinusC) {
			System.out.println("do not advertise");
			return;
		}
		if(r == eMinusC) {
			System.out.println("does not matter");
			return;
		}
		if(r < eMinusC) {
			System.out.println("advertise");
			return;
		}
	}

}
