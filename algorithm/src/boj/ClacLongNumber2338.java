package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class ClacLongNumber2338 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BigInteger n = new BigInteger(br.readLine());
		BigInteger m = new BigInteger(br.readLine());
		System.out.println(n.add(m));
		System.out.println(n.subtract(m));
		System.out.println(n.multiply(m));
	}
}
