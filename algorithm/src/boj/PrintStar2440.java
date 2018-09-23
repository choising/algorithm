package boj;

import java.util.Scanner;

public class PrintStar2440 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			for(int j = i; j <= n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}

}
