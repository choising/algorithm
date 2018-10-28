package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class FindPrime1978 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		boolean[] prime = new boolean[1001];
		Arrays.fill(prime, true);
		prime[0] = false;
		prime[1] = false;
		
		for(int i = 2; i < (int)Math.sqrt(1001); i++) {
			if(prime[i]) {
				for(int j = i+i; j < 1001; j += i) {
					prime[j] = false;
				}
			}
		}
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int count = 0;
		while(st.hasMoreTokens()) {
			if(prime[Integer.parseInt(st.nextToken())]) {
				count++;				
			}
		}
		System.out.println(count);
	}
}
