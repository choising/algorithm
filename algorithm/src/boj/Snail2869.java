package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Snail2869 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int v = Integer.parseInt(st.nextToken());
		
		go(a, b, v);
	}

	private static void go(int a, int b, int v) {
		int target = v - a;
		if (target <= 0) {
			System.out.println("1");
			return;
		}
		
		double div = a - b;
		int answer = (int) Math.ceil(target / div);
		
		System.out.println(answer + 1);
	}

}

