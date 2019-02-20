package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ABC3047 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int[] arr = new int[3];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < 3; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		String ss = br.readLine();
		for(String s : ss.split("")) {
			System.out.print(arr[MyNumber.find(s)] + " ");
		}
	}
}

enum MyNumber {
	AA(0, "A"), BB(1, "B"), CC(2, "C");
	
	private int val;
	private String str;

	private MyNumber(int val, String str) {
		this.val = val;
		this.str = str;
	}

	public static int find(String s) {
		for (MyNumber n : values()) {
			if(n.str.equals(s))
				return n.val;
		}
		return 0;
	}
}
