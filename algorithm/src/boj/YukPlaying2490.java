package boj;

import java.util.Scanner;

public class YukPlaying2490 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < 3; i++) {
			int zero = 0;
			for(int j = 0; j < 4; j++) {
				if(sc.nextInt() == 0) zero++;
			}
			if(zero == 1) System.out.println("A");
			else if(zero == 2) System.out.println("B");
			else if(zero == 3) System.out.println("C");
			else if(zero == 4) System.out.println("D");
			else System.out.println("E");
		}
		sc.close();
	}

}
