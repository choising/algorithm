package codeforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ProblemA_div3 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			int d = Integer.parseInt(st.nextToken());
			
			go(a, b, c, d);
		}
		
	}

	private static void go(int a, int b, int c, int d) {
		for(int j = a; j <= b; j++) {
			for(int k = c; k <=d; k++) {
				if(j != k) {
					System.out.println(j + " " + k);
					return;
				}
			}
		}
	}
}
