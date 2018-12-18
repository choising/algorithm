package boj;

import java.util.Scanner;

public class APlusBSenve11021 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println("Case #" + (i+1) + ": " + (a+b));
		}
		sc.close();
	}

}
