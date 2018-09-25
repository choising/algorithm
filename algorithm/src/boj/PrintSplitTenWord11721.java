package boj;

import java.util.Scanner;

public class PrintSplitTenWord11721 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n = 10;
		
		while(n < s.length()) {
			System.out.println(s.substring(n-10, n));
			n += 10;
		}
		System.out.println(s.substring(n-10, s.length()));
		sc.close();
	}
}
