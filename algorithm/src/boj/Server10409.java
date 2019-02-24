package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Server10409 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int t = Integer.parseInt(st.nextToken());
		int max = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int[] arr = new int[t];
		for(int i = 0; i < t; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		System.out.println(go(t, max, arr));
	}

	private static int go(int t, int max, int[] arr) {
		int sum = 0;
		for(int i = 0; i < t; i++) {
			sum += arr[i];
			if(sum > max) return i;
		}
		return t;
	}
}
