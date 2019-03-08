package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FiveSixDifference2864 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String s1 = st.nextToken();
		String s2 = st.nextToken();
		System.out.println(goMin(s1) + goMin(s2));
		System.out.println(goMax(s1) + goMax(s2));
		
	}

	private static int goMin(String s) {
		return Integer.parseInt(s.replace('6', '5'));
	}
	
	private static int goMax(String s) {
		return Integer.parseInt(s.replace('5', '6'));
	}
}
