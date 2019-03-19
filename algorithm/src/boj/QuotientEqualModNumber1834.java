package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class QuotientEqualModNumber1834 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BigInteger n = new BigInteger(br.readLine());
		BigInteger answer = BigInteger.ZERO;
		
		for(int i = 1; i < n.intValue(); i++) {
			BigInteger bi = BigInteger.valueOf(i);
			answer = answer.add(n.multiply(bi).add(bi));
		}
		System.out.println(answer.toString());
	}
}
