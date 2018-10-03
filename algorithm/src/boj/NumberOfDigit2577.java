package boj;

import java.util.Scanner;

public class NumberOfDigit2577 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int answer = a*b*c;
		int[] cntArr = new int[10];
		while(answer > 0) {
			cntArr[answer%10]++;
			answer /= 10;
		}
		
		for(int i : cntArr) {
			System.out.println(i);
		}
		sc.close();
	}

}
