package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ContinuousSum1912 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int sum = Integer.parseInt(st.nextToken());
		int max = sum;
		
		while(st.hasMoreTokens()) {
			int m = Integer.parseInt(st.nextToken());
			sum = Math.max(sum + m, m);
			if(sum > max) max = sum;
		}
		System.out.println(max);
	}
}
