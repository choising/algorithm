package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Fibonacci4150 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		List<BigInteger> list = new ArrayList<>();
		
		list.add(BigInteger.ONE);
		list.add(BigInteger.ONE);
		
		for (int i = 2; i < n; i++) {
			list.add(list.get(i-1).add(list.get(i-2)));
		}
		
		System.out.println(list.get(n-1));
	}

}
