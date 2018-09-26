package boj;

import java.util.Scanner;

public class PlusCycle1110 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int solution = solution(n);
		int cnt = 1;
		while(n != solution) {
			solution = solution(solution);
			cnt++;
		}
		System.out.println(cnt);
		sc.close();
	}
	
	public static int solution(int num) {
		int a = num / 10;
		int b = num % 10;
		int c = a + b;
		int d = c % 10;
		int answer = b * 10 + d;
		return answer;
	}
}
