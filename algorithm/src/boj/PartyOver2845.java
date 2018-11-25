package boj;

import java.util.Scanner;

public class PartyOver2845 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int answer = sc.nextInt() * sc.nextInt();
		
		for(int i = 0; i < 5; i++) {
			System.out.print(sc.nextInt() - answer);
			if(i != 4)
			System.out.print(" ");
		}
		sc.close();
	}

}
