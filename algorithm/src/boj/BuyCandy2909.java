package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BuyCandy2909 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int c = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int n = 1;
		
		for (int i = 0; i < k; i++) {
			n *= 10;
		}
		
		int base = (c / n) * n;
		int mod = c % n;
		
		if (mod >= n / 2) {
			base += n;
		}
		
		System.out.println(base);
	}

}
