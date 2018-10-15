package boj;

import java.util.Scanner;

public class FindAlphabet10809 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();
		
		for(int i = 97; i < 123; i++) {
			char a = (char)i;
			System.out.print(s.indexOf(a));
			System.out.print(" ");
		}
	}
}
