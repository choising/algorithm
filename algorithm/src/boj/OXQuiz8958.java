package boj;

import java.util.Scanner;

public class OXQuiz8958 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			String s = sc.next();
			solution(s);
		}
		sc.close();
	}
	
	public static void solution(String s) {
		String[] ss = s.split("");
		int sum = 0;
		int cnt = 0;
		for(String str : ss) {
			if(str.equals("O")) {
				cnt += 1;
				sum += cnt;
			}
			else {				
				cnt = 0;
			}
		}
		System.out.println(sum);
	}

}
