package boj;

import java.util.Scanner;

public class Gugudan2739 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 1; i < 10; i++) {
			System.out.println(n+ " * " + i + " = " + n*i);
		}
		sc.close();
	}

}
