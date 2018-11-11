package boj;

import java.util.Scanner;

public class PrintStarFive2442 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			for(int j = i; j < n-1; j++) {
				System.out.print(" ");
			}
			int star = 2 * i + 1;
			for(int j = 0; j < star; j++) {
				System.out.print("*");	
			}
			System.out.println();
		}
		sc.close();
	}
}
