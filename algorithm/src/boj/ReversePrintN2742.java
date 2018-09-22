package boj;

import java.util.Scanner;

public class ReversePrintN2742 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = n; i > 0; i--) {
			System.out.println(i);
		}
		sc.close();
	}
}
