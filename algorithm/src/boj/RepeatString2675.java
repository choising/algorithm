package boj;

import java.util.Scanner;

public class RepeatString2675 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			int a = sc.nextInt();
			String s = sc.next();
			char[] c = s.toCharArray();
			for(int j = 0; j < c.length; j++) {
				for(int k = 0; k < a; k++) {
					System.out.print(c[j]);					
				}
			}
			System.out.println();
		}
		sc.close();
	}

}
