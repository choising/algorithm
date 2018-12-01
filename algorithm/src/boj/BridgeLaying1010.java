package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class BridgeLaying1010 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			System.out.println(comb(n, m));
		}
	}
	
	static long comb(int n, int m) {
		if(n == m) return 1;
		BigInteger answer = new BigInteger("1");
		BigInteger div = new BigInteger("1");
		for(int i = 1; i <= n; i++) {
			answer = answer.multiply(new BigInteger(String.valueOf(m--)));
			div = div.multiply(new BigInteger(String.valueOf(i)));
		}
		
		BigInteger realAnswer = answer.divide(div);
		return realAnswer.longValue();
	}

}
