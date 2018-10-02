package boj;

import java.math.BigInteger;
import java.util.Scanner;

public class Hanoi1914 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		BigInteger bg = BigInteger.ONE;
		for(int i = 0; i < n; i++) {
			bg = bg.multiply(BigInteger.valueOf(2));
		}
		bg = bg.subtract(BigInteger.ONE);
		System.out.println(bg.toString());
		if(n <= 20) hanoi(1, 2, 3, n);
		sc.close();
	}
	
	public static void hanoi(int from, int by, int to, int n) {
		if(n == 1) {
			System.out.println(from +" "+ to);
			return;
		}
		hanoi(from, to, by, n-1);
		System.out.println(from + " "+ to);
		hanoi(by, from, to, n-1);		
	}
}
